package com.fengdi.wxapplet.hsgj.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/16.
 * 简单缓存的数据
 */
public class WxCacheManager {

    public static final boolean ENABLE = false;
    public static final String INDEX = "index";
    public static final String CODE="ssmCode";
    public static final String CATALOG = "catalog";
    public static final String GOODS = "goods";
    public static final Integer CACHE_TIME=10;
    public static final Integer CODE_TIME=1;

    private static Map<String, Map<String, Object>> cacheDataList = new HashMap<>();

    /**
     * 缓存首页数据
     *
     * @param data
     */
    public static void loadData(String cacheKey, Map<String, Object> data) {
        Map<String, Object> cacheData = cacheDataList.get(cacheKey);
        //有记录，则先丢弃
        if (cacheData != null) {
            cacheData.remove(cacheKey);
        }

        cacheData = new HashMap<>();
        //深拷贝
        cacheData.putAll(data);
        cacheData.put("isCache", "true");
        if(cacheKey==CODE){
            //设置验证码缓存时间1分钟
            cacheData.put("expireTime", LocalDateTime.now().plusMinutes(CODE_TIME));
        }else {
            cacheData.put("expireTime", LocalDateTime.now().plusMinutes(CACHE_TIME));
        }
        cacheDataList.put(cacheKey, cacheData);
    }

    public static Map<String, Object> getCacheData(String cacheKey) {
        return cacheDataList.get(cacheKey);
    }

    /**
     * 判断缓存中是否有数据
     *
     * @return
     */
    public static boolean hasData(String cacheKey) {
        if (ENABLE) {
            return false;
        }
        Map<String, Object> cacheData = cacheDataList.get(cacheKey);
        if (cacheData == null) {

            return false;
        } else {
            LocalDateTime expire = (LocalDateTime) cacheData.get("expireTime");
            if (expire.isBefore(LocalDateTime.now())) {
                return false;
            } else {

                return true;
            }
        }
    }

    /**
     * 清除所有缓存
     */
    public static void clearAll() {
        cacheDataList = new HashMap<>();
    }

    /**
     * 清除缓存数据
     */
    public static void clear(String cacheKey) {
        Map<String, Object> cacheData = cacheDataList.get(cacheKey);
        if (cacheData != null) {
            cacheDataList.remove(cacheKey);
        }
    }

}

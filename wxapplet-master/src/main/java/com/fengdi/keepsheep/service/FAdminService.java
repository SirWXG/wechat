package com.fengdi.keepsheep.service;

import com.fengdi.keepsheep.bean.FAdmin;
import com.fengdi.keepsheep.bean.FAdminExample;

import java.util.List;
import java.util.Map;

public interface FAdminService {
	
	/**
	 * 验证登录
	 * @param map
	 * @return
	 */
	List<FAdmin> checkLogin(Map<String, String> map);

	List<FAdmin> selectByExample(FAdminExample fAdminExample);

	/**
	 * 更新登录时间
	 * @return
	 */
	int updateAdminForLoginTime();

	/**
	 * 条件查询
	 * @return
	 */
	List<FAdmin> selectAdminByStatus(Map<String, Object> map);

	/**
	 * 添加会员
	 * @param fAdmin
	 * @return
	 */
	int insert(FAdmin fAdmin);

	/**
	 * 根据编号删除会员
	 * @param adminNo
	 * @return
	 */
	int deleteByPrimaryKey(String adminNo);

	/**
	 * 根据编号删除会员
	 * @param adminNo
	 * @return
	 */
	int deleteAdminByAdminNo(String adminNo);


	/**
	 * 更改会员状态
	 * @param map
	 * @return
	 */
	int updateAdminStatus(Map<String, String> map);

	/**
	 * 根据编号查询会员
	 * @param adminNo
	 * @return
	 */
	List<FAdmin> selectAdminByAdminNo(String adminNo);

	/**
	 * 更新会员信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(FAdmin record);
}

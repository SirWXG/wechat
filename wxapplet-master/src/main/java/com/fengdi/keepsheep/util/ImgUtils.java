package com.fengdi.keepsheep.util;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


/**
 * 图片处理类
 * Created by Administrator on 2019/3/15.
 */
public class ImgUtils {
    public static String getImgs(HttpServletRequest request, CommonsMultipartFile file){
        String filePath = null;
        try {
            //上传后的地址，注意("/upload")是表示文件上传后的目标文件夹
            String realPath = request.getSession().getServletContext().getRealPath("/images");
            //获取文件名
            String filename = file.getOriginalFilename();
            //获取文件后缀名
            String extensionname = filename.substring(filename.lastIndexOf(".") + 1);
            if(extensionname.trim().equals("")||extensionname==null){
                return "";
            }else{
                //给上传的文件起别名，有很多种方式
                String newFilename = String.valueOf(System.currentTimeMillis()) + "." + extensionname;
                System.out.println(realPath+"  "+newFilename);
                //创建File对象，传入目标路径参数，和新的文件别名
                File dir = new File("http://u.m-coms.com/Fengdi/images/", newFilename);
                if (!dir.exists()) {//如果dir代表的文件不存在，则创建它，
                    dir.mkdirs();//
                }
                filePath = "http://u.m-coms.com/Fengdi/images/"+newFilename;
                //如果存在则直接执行下面操作
                file.transferTo(dir);//将上传的实体文件复制到指定目录upload下
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return filePath;
    }
}

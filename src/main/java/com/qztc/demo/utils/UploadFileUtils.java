package com.qztc.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author wangxl
 * @date 2018/11/26 11:07
 */
public class UploadFileUtils {
    private static final Logger logger = LoggerFactory.getLogger(UploadFileUtils.class);
    public static String uploadImage(MultipartFile file){
        String fileName = file.getOriginalFilename();
        String filePath;
        String[] strArray = fileName.split("\\.");
        int suffixIndex = strArray.length -1;
        String fileNameNow = strArray[suffixIndex];
        System.out.println(fileNameNow);
        if(("png").equals(fileNameNow)){
            fileName = "ycc"+System.currentTimeMillis()+"."+fileNameNow;
            // filePath = "F:/kdgc_project/appdemo/src/main/resources/static/images/";
            filePath = "/Users/wangxianlin/IdeaProjects/StudentJobFeedbackSystem/src/main/webapp/resources/images/course/";
        }else {
            fileName = "ycc"+System.currentTimeMillis()+"."+fileNameNow;
            // filePath = "F:/kdgc_project/appdemo/src/main/resources/static/images/";
            filePath = "/Users/wangxianlin/IdeaProjects/StudentJobFeedbackSystem/src/main/webapp/resources/pdf/";
        }

        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(filePath+fileName);
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.warn("上传失败!!!");
            return null;
        }
        logger.info("上传成功！！！");

        return fileName;
    }

}

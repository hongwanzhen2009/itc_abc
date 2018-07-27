package com.hong.itcabc.FileD19IO;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件/文件夹
 */
public class FileDemo3 {
    public static void main(String[] args) {
        try {
            createFiles();
            deleteFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFiles() {
        File file = new File("E:\\tempFiles\\createFile.txt");
        boolean resultFlag = file.delete();
        if (resultFlag) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }
    }

    /**
     * @author hongw
     * @date 2018/7/28 3:10
     * @description:
     */
    private static void createFiles() throws IOException {
        File file = new File("E:\\tempFiles\\createFile.txt");
        // createNewFile方法进能够创建文件，不能创建文件夹，路径如不存在会报错
        boolean resultFlag = file.createNewFile();
        if (resultFlag) {
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件创建失败");
        }
    }
}

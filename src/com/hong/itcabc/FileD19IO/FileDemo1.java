package com.hong.itcabc.FileD19IO;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // 创建File对象，并制定文件的路径
        //绝对路径
        File file1 = new File("E:\\tempFiles\\temp.txt");
        System.out.println(file1);

        // 相对路径 E:\workspace\idea\itc_abc\itc_abc.iml
        File file2 = new File("itc_abc.iml");
        System.out.println(file2);

        // 第一个参数和第二个参数合并，合并后创建File对象（合并后构成一个完整的路径），param1最后和param2第一个斜杠可以省略
        File file3 = new File("E:\\workspace\\idea", "itc_abc\\itc_abc.iml");
        System.out.println(file3);

        // 父对象和子路径
        File parentFile = new File("E:\\workspace\\idea");
        File file4 = new File("itc_abc\\itc_abc.iml");
        System.out.println(file4);
    }
}

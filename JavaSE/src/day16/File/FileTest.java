package day16.File;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File file = new File("/Users/aloong/IdeaProjects/JavaSE/src/day16/File/hello.txt");
        File file = new File("JavaSE/src/day16/File/hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
//        System.out.println(file.getCanonicalPath());
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
    }
}

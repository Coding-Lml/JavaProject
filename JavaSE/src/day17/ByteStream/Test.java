package day17.ByteStream;

import java.io.*;

// IO流分为字节流和字符流
// -字节流分为字节输入流 和 字节输出流
// -字符流分为字符输入流 和 字符输出流

/*第一步：创建FileInputStream文件字节输入流管道，与源文件接通。
第二步：调用read()方法开始读取文件的字节数据。
第三步：调用close()方法释放资源*/
public class Test {
    public static void main(String[] args) throws IOException {
        //字节输入流 相对于内存程序而言
        InputStream is = new FileInputStream("JavaSE/src/day17/ByteStream/hello.txt");
        int x;
        while ((x = is.read()) != -1){
            System.out.println((char)x);
        }
        is.close();
        //字节输入流每次读取多个字节
        byte[] buffer = new byte[3];
        int len; // 记住每次读取了多少个字节。  abc 66
        while ((len = is.read(buffer)) != -1){
            // 注意：读取多少，倒出多少。
            String rs = new String(buffer, 0 , len);
            System.out.print(rs);
        }
        // 性能得到了明显的提升！！
        // 这种方案也不能避免读取汉字输出乱码的问题！！

//        is.close(); // 关闭流

        // 1、创建一个字节输出流管道与目标文件接通。
        // 覆盖管道：覆盖之前的数据
//        OutputStream os =
//                new FileOutputStream("file-io-app/src/itheima04out.txt");

        // 追加数据的管道
        OutputStream os =
                new FileOutputStream("JavaSE/src/day17/ByteStream/hello.txt", true);

        // 2、开始写字节数据出去了
        os.write(97); // 97就是一个字节，代表a
        os.write('b'); // 'b'也是一个字节
        // os.write('磊'); // [ooo] 默认只能写出去一个字节

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes, 0, 15);

        // 换行符
        os.write("\r\n".getBytes());

        os.close(); // 关闭流
    }
}

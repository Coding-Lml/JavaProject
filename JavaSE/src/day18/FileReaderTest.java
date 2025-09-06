package day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderTest {
    public static void main(String[] args) {
        try (
                // 1、创建一个文件字符输入流管道与源文件接通
                Reader fr = new FileReader("JavaSE/src/day18/hello");
        ){
            // 2、一个字符一个字符的读（性能较差）
//            int c; // 记住每次读取的字符编号。
//            while ((c = fr.read()) != -1){
//                System.out.print((char) c);
//            }
            // 每次读取一个字符的形式，性能肯定是比较差的。

            // 3、每次读取多个字符。（性能是比较不错的！）
            char[] buffer = new char[3];
            int len; // 记住每次读取了多少个字符。
            while ((len = fr.read(buffer)) != -1){
                // 读取多少倒出多少
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                // 0、创建一个文件字符输出流管道与目标文件接通。
                // 覆盖管道
                // Writer fw = new FileWriter("io-app2/src/itheima02out.txt");
                // 追加数据的管道
                Writer fw = new FileWriter("JavaSE/src/day18/hello", true);
        ){
            // 1、public void write(int c):写一个字符出去
            fw.write('a');
            fw.write(97);
            fw.write('磊'); // 写一个字符出去
            fw.write("\r\n"); // 换行

            // 2、public void write(String c)写一个字符串出去
            fw.write("我爱你中国abc");
            fw.write("\r\n");

            // 3、public void write(String c ,int pos ,int len):写字符串的一部分出去
            fw.write("我爱你中国abc", 0, 5);
            fw.write("\r\n");

            // 4、public void write(char[] buffer):写一个字符数组出去
            char[] buffer = {'黑', '马', 'a', 'b', 'c'};
            fw.write(buffer);
            fw.write("\r\n");

            // 5、public void write(char[] buffer ,int pos ,int len):写字符数组的一部分出去
            fw.write(buffer, 0, 2);
            fw.write("\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

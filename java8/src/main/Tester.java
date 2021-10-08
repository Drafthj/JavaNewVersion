import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Tester {
    public static void main(String[] args) {
        Reader stringReader = new StringReader("test");
        BufferedReader br = new BufferedReader(stringReader);
        try (BufferedReader br1 = br){
            System.out.println(br1.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

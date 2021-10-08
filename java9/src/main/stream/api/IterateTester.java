package stream.api;

import java.util.List;
import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IterateTester {
    public static void main(String[] args) {
        IntStream.iterate(3, x -> x < 100, x -> x + 3).forEach(System.out::print);
    }
}

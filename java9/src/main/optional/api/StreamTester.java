package optional.api;

import java.util.Optional;

/**
 * 〈stream()方法〉
 *  stream 方法的作用就是将 Optional 转为一个 Stream，
 *  如果该 Optional 中包含值，那么就返回包含这个值的 Stream，
 *  否则返回一个空的 Stream（Stream.empty()）。
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StreamTester {
    public static void main(String[] args) {
        System.out.println(Optional.of(1).stream().count());
        System.out.println(Optional.ofNullable(null).stream().count());
    }
}

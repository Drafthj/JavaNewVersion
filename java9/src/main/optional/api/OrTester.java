package optional.api;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * 如果值存在，返回 Optional 指定的值，否则返回一个预设的值。
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class OrTester {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("X");
        Supplier<Optional<String>> supplier = () -> Optional.of("not present");
        optional.or(supplier).ifPresent(System.out::println);
        optional = Optional.empty();
        optional.or(supplier).ifPresent(System.out::println);
    }
}

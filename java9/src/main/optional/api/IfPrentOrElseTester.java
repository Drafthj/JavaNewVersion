package optional.api;

import java.util.Optional;

/**
 * ifPresentOrElse方法
 *
 * ifPresentOrElse 方法的改进就是有了 else，接受两个参数 Consumer 和 Runnable。
 *
 * ifPresentOrElse 方法的用途是
 * 如果一个 Optional 包含值，则对其包含的值调用函数 action，即 action.accept(value)，这与 ifPresent 一致；
 * 与 ifPresent 方法的区别在于，ifPresentOrElse 还有第二个参数 emptyAction —— 如果 Optional 不包含值，
 * 那么 ifPresentOrElse 便会调用 emptyAction，即 emptyAction.run()。
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IfPrentOrElseTester {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(1);
        optional.ifPresentOrElse(System.out::println, ()-> {
            System.out.println("not present");
        });

        optional = Optional.empty();
        optional.ifPresentOrElse(System.out::println, ()-> {
            System.out.println("not present");
        });
    }
}

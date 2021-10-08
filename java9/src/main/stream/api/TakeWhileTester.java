package stream.api;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class TakeWhileTester {
    public static void main(String[] args) {
        //take while一直到满足条件的元素停止
        List.of("A","B","C","","D","E").stream().takeWhile(s->!s.isEmpty())
                .forEach(System.out::print);
    }
}

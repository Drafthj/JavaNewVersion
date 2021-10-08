package collections.api;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Main {
    public static void main(String[] args) {
        //不可变set
        Set<String> immutableSet = Set.of("A","B","C");
        System.out.println(immutableSet);
        List<String> immutableList = List.of("A","B","C");
        System.out.println(immutableList);
        Map<String, String> immutableMap = Map.of("A","apple", "B","boy", "C","cat");
        System.out.println(immutableMap);

        Map<String, String> immutableMap2
                = Map.ofEntries(new AbstractMap.SimpleEntry<>("A", "apple"),
                new AbstractMap.SimpleEntry<>("B", "boy"),
                new AbstractMap.SimpleEntry<>("C", "cat"));
        System.out.println(immutableMap2);
    }
}

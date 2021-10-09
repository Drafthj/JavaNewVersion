package completeFuture.api;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/9
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DelayTester {
    public static void main(String[] args) {
        System.out.println("开始时间:" + LocalDateTime.now());
        CompletableFuture completableFuture = CompletableFuture.runAsync(
                () -> System.out.println("执行时间为：" + LocalDateTime.now()),
                //延迟五秒执行
                CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS));
        completableFuture.join();
    }
}

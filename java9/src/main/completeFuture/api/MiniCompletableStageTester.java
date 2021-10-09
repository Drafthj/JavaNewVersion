package completeFuture.api;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
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
public class MiniCompletableStageTester {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture completableFuture = CompletableFuture.completedFuture(10);
        CompletionStage minimalCompletionStage = completableFuture.minimalCompletionStage();
        System.out.println(minimalCompletionStage.toCompletableFuture().get());
    }
}

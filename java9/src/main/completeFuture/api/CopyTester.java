package completeFuture.api;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/9
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CopyTester {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture completableFuture = CompletableFuture.completedFuture(10);
        //类似于深拷贝，用于防御性拷贝
        CompletableFuture copyCompletableFuture = completableFuture.copy();
        completableFuture.obtrudeValue(8);
        System.out.println(completableFuture.get());
        System.out.println(copyCompletableFuture.get());

    }
}

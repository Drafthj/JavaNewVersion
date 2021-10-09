package completeFuture.api;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CompleteTimeOutTester {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       CompletableFuture completableFuture =  CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
            //超时处理
        }).completeOnTimeout(0, 5, TimeUnit.SECONDS);

        //print 0
        System.out.println(completableFuture.get());
    }
}

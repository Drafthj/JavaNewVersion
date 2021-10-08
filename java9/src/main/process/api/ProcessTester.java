package process.api;

import java.io.IOException;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ProcessTester {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("mspaint.exe");
        try {
            Process process = processBuilder.start();
            ProcessHandle.Info info = process.info();
            String np = "not present";
            System.out.printf("Process ID : %s%n", process.pid());
            System.out.printf("Command name : %s%n", info.command().orElse(np));
            System.out.printf("Command line : %s%n", info.commandLine().orElse(np));

            System.out.printf("Start time: %s%n",
                    info.startInstant().map(i -> i.atZone(ZoneId.systemDefault())
                            .toLocalDateTime().toString()).orElse(np));

            System.out.printf("Arguments : %s%n",
                    info.arguments().map(a -> Stream.of(a).collect(
                            Collectors.joining(" "))).orElse(np));

            System.out.printf("User : %s%n", info.user().orElse(np));
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //关闭进程
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

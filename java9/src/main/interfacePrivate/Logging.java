package interfacePrivate;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2021/10/8
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface Logging {
    String ORACLE = "Oracle_database";
    String MYSQL = "Mysql_database";
    private void log(String message, String level) {
        getConnection();
        System.out.println("Log Message：Level :" + level + ",message:" + message);
        closeConnection();
    }

    default void logInfo(String message) {
        log(message, "INFO");
    }

    default void logError(String message) {
        log(message, "ERROR");
    }

    default void logFatal(String message) {
        log(message, "FATAL");
    }

    default void logWarn(String message) {
        log(message, "WARN");
    }

    private static void getConnection() {
        System.out.println("Open Database connection");
    }

    private static void closeConnection() {
        System.out.println("Close Database connection");
    }
}

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
public class Tester {
    public static void main(String[] args) {
        System.out.println("-----------MYSQL LOGGING------------");
        MysqlLogging mysqlLogging = new MysqlLogging();
        mysqlLogging.logInfo("test info");
        mysqlLogging.logError("test error");
        mysqlLogging.logFatal("test fatal");
        mysqlLogging.logWarn("test warn");

        System.out.println("-----------ORACLE LOGGING------------");
        OracleLogging oracleLogging = new OracleLogging();
        oracleLogging.logInfo("test info");
        oracleLogging.logError("test error");
        oracleLogging.logFatal("test fatal");
        oracleLogging.logWarn("test warn");
    }
}

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @业务描述：
 * @package_name： PACKAGE_NAME
 * @project_name： logs-study
 * @author： ratelfu@qq.com
 * @create_time： 2020-08-04 20:47
 * @copyright (c) ratelfu 版权所有
 */
public class LogBackTest {
    private static final Logger logger = LoggerFactory.getLogger(LogBackTest.class);

    public static void main(String[] args) {
        logger.debug("这是debug");
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");
    }
}

package study.log;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: java study
 * @description:
 * @author: Allen
 * @create: 2020-05-11 14:40
 **/

public class StudyLog {
    private static final Logger log = LoggerFactory.getLogger(StudyLog.class);
    static {
        PropertyConfigurator.configure("/Users/shiqunxing/ideaProject/javastudy/src/main/resources/log4j.properties");
    }

    public static void main(String[] args) {
        log.info("Hello:{}","world");
    }
}

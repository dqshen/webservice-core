package com.sdmap.core.controller;

import com.dqs.log4jslf4jadapter.logsomething;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {

    // private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    // 基本服务示例，在命令行执行下面的curl看效果，或者直接在浏览器地址栏查看
    // curl "http://192.168.200.137:8080/hello?who=GIS"
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "who", defaultValue = "world") String who) {
        
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");        
        // logsomething是一个简单类，内容如下：
        /*
        package com.dqs.log4jslf4jadapter;

        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        public class logsomething {

            protected static final Logger Logger = LogManager.getLogger();

            public static void hellolog() {

                Logger.info("hello log4j2!");

            }
        } */

        logsomething.hellolog();
        

        return "Hello" + who;
    }
}

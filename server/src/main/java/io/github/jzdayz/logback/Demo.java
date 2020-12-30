package io.github.jzdayz.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Demo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);
    public static void main(String[] args) {
        LOGGER.info("111");
        try {
            TimeUnit.DAYS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

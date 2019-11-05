package com.github.houbbbbb.crawlerspringbootstarter.crframe.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName CrawlerProperties
 * @Description TODO
 * @Author hbw
 * @Date 2019/10/25 16:31
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "crawler")
public class CrawlerProperties {
    private int poolSize = 6;
    private int timeout = 2000;

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}

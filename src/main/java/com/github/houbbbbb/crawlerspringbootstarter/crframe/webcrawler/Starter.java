package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import com.github.houbbbbb.crawlerspringbootstarter.crframe.properties.CrawlerProperties;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName Starter
 * @Description 启动器
 * @Author hbw
 * @Date 2019/10/25 16:25
 * @Version 1.0
 **/
public class Starter {
    private String rootUrl;
    private Parser parser;
    private CrawlerProperties crawlerProperties;

    public Starter(CrawlerProperties crawlerProperties) {
        this.crawlerProperties = crawlerProperties;
    }

    public String getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void start() {
        Tran tran = new Tran();
        tran.parser = parser;
        tran.crawlerProperties = crawlerProperties;
        tran.executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(crawlerProperties.getPoolSize());
        tran.requestQueue.offer(new Requester(tran, rootUrl));
        tran.scheduler.scheduleAtFixedRate(new Center(tran), 3, 3, TimeUnit.SECONDS);
    }
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import com.github.houbbbbb.crawlerspringbootstarter.crframe.properties.CrawlerProperties;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName Tran
 * @Description 传值实体
 * @Author hbw
 * @Date 2019/10/25 16:02
 * @Version 1.0
 **/
public class Tran {
    public ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(1);
    public ConcurrentLinkedQueue<Requester> requestQueue = new ConcurrentLinkedQueue<>();
    public CrawlerProperties crawlerProperties;
    public ThreadPoolExecutor executor;
    public Parser parser;
}

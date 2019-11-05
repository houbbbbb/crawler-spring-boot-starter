package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import org.jsoup.nodes.Document;

import java.util.concurrent.FutureTask;

/**
 * @ClassName Requester
 * @Description 请求
 * @Author hbw
 * @Date 2019/10/25 16:39
 * @Version 1.0
 **/
public class Requester {
    private FutureTask<Document> future;
    private String url;
    private Tran tran;

    public Requester(Tran tran, String url) {
        this.tran = tran;
        this.url = url;
        this.future = new FutureTask<>(new Crawler(url, tran.crawlerProperties.getTimeout()));
        this.tran.executor.submit(this.future);
        this.tran.requestQueue.offer(this);
    }

    public Document getDoc() {
        try {
            return this.future.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import com.github.houbbbbb.crawlerspringbootstarter.crframe.utils.PrintUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;
import java.util.concurrent.Callable;

/**
 * @ClassName Crawler
 * @Description 爬取
 * @Author hbw
 * @Date 2019/10/25 16:12
 * @Version 1.0
 **/
public class Crawler implements Callable<Document> {
    private URL url;
    private int timeout;

    public Crawler(String url, int timeout) {
        PrintUtils.println("crawler url", url);
        this.timeout = timeout;
        try {
            this.url = new URL(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Document call() {
        try {
            return Jsoup.parse(url, timeout);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

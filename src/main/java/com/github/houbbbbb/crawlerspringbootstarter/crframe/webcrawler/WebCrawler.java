package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import com.github.houbbbbb.crawlerspringbootstarter.crframe.properties.CrawlerProperties;

/**
 * @ClassName WebCrawler
 * @Description TODO
 * @Author hbw
 * @Date 2019/10/25 19:39
 * @Version 1.0
 **/
public class WebCrawler {
    private CrawlerProperties crawlerProperties;

    public WebCrawler(CrawlerProperties crawlerProperties) {
        this.crawlerProperties = crawlerProperties;
    }

    public Starter getStarter() {
        return new Starter(crawlerProperties);
    }
}

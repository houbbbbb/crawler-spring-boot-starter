package com.github.houbbbbb.crawlerspringbootstarter.crframe.autoconfiguration;

import com.github.houbbbbb.crawlerspringbootstarter.crframe.filecrawler.FileCrawler;
import com.github.houbbbbb.crawlerspringbootstarter.crframe.properties.CrawlerProperties;
import com.github.houbbbbb.crawlerspringbootstarter.crframe.utils.PrintUtils;
import com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler.WebCrawler;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CrawlerAutoConfiguration
 * @Description TODO
 * @Author hbw
 * @Date 2019/10/29 9:14
 * @Version 1.0
 **/
@Configuration
@EnableConfigurationProperties(CrawlerProperties.class)
public class CrawlerAutoConfiguration {

    @Bean
    public WebCrawler getWebCrawler(CrawlerProperties crawlerProperties) {
        PrintUtils.println("poolSize", crawlerProperties.getPoolSize());
        PrintUtils.println("timeout", crawlerProperties.getTimeout());
        return new WebCrawler(crawlerProperties);
    }

    @Bean
    public FileCrawler getFileCrawler() {
        return new FileCrawler();
    }
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.filecrawler;

/**
 * @ClassName FileCrawler
 * @Description 文件爬取
 * @Author hbw
 * @Date 2019/10/28 9:25
 * @Version 1.0
 **/
public class FileCrawler {
    public FileCrawler() {
    }

    public FileStarter getStarter() {
        return new FileStarter();
    }
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import org.jsoup.nodes.Document;

/**
 * @ClassName Parser
 * @Description 解析
 * @Author hbw
 * @Date 2019/10/25 16:13
 * @Version 1.0
 **/
public interface Parser {
    void parse(Document document, Tran tran);
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.filecrawler;

import java.nio.file.Path;

/**
 * @ClassName Parser
 * @Description 解析器
 * @Author hbw
 * @Date 2019/10/28 9:48
 * @Version 1.0
 **/
public interface Parser {
    void parse(Path file);
}

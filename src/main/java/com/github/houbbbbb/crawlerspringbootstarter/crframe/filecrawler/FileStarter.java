package com.github.houbbbbb.crawlerspringbootstarter.crframe.filecrawler;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @ClassName Starter
 * @Description 文件遍历启动类
 * @Author hbw
 * @Date 2019/10/28 9:26
 * @Version 1.0
 **/
public class FileStarter {
    private String rootUrl;
    private Parser parser;

    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void start() {
        try {
            Path path = Paths.get(rootUrl);
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    try {
                        parser.parse(file);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

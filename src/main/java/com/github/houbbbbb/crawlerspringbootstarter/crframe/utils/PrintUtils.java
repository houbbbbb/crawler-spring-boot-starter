package com.github.houbbbbb.crawlerspringbootstarter.crframe.utils;

/**
 * @ClassName OutUtils
 * @Description 输出工具
 * @Author hbw
 * @Date 2019/10/25 11:27
 * @Version 1.0
 **/
public class PrintUtils {
    public static void println(String key, Object value) {
        StringBuilder sb = new StringBuilder();
        sb.append(key).append(" : ").append(value);
        System.out.println(sb.toString());
    }
}

package com.github.houbbbbb.crawlerspringbootstarter.crframe.webcrawler;

import org.jsoup.nodes.Document;

/**
 * @ClassName Center
 * @Description TODO
 * @Author hbw
 * @Date 2019/10/25 18:41
 * @Version 1.0
 **/
public class Center implements Runnable {
    private Tran tran;

    public Center(Tran tran) {
        this.tran = tran;
    }

    @Override
    public void run() {
        Requester requester = null;
        while (null != (requester = tran.requestQueue.poll())) {
            try {
                Document document = requester.getDoc();
                if (null != document) tran.parser.parse(document, tran);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

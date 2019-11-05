# crawler-spring-boot-starter
## spring boot 爬虫框架
### 中央仓库的maven依赖
```
<dependency>
  <groupId>com.github.houbbbbb</groupId>
  <artifactId>crawler-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>
```
### 使用方式
#### 配置方式：application.yml, 如果不配置，默认值：线程池大小：poolSize=6; 超时时间：timeout=2000;
```
crawler:
  pool-size: 6
  timeout: 2000
```
#### 代码示例
```
@Autowired
WebCrawler webCrawler; // 网页内容爬取
@Autowired
FileCrawler fileCrawler;

// 网页爬取
void crawlerTest() {
    Starter starter = webCrawler.getStarter(); // 获取爬取启动类
    starter.setRootUrl("http://www.xxx.com/"); // 要爬取的根url
    starter.setParser((document, tran) -> {    // 网页解析器，可以自定义解析网页文档
        Elements elements = document.select("a");
        for(Element element: elements) {
            String url = element.absUrl("href"); // 可以获取完整的url
            System.out.println("url " + url);
            new Requester(tran, url); // 将要爬取的url加入到任务队列
        }
    });
    starter.start(); // 启动爬取方法
}

// 本地文件遍历
void fileCrawlerTest() {
    FileStarter starter = fileCrawler.getStarter(); // 获取文件遍历启动器
    starter.setRootUrl("G:\\exc\\hhh"); // 设置文章根目录，只要设置好根目录，就是自动遍历目录中所有文件
    starter.setParser((file) -> { // 文件解析器，自定义实现，可以从这里获取到文件路径
        System.out.println("fileName " + file.getFileName()); // 
    });
    starter.start(); // 启动遍历方法
}
```

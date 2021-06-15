package com.atguigu.gulimall;

import com.aliyun.oss.OSS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class GulimallThirdPartyApplicationTest {
    @Autowired
    OSS ossClient;

    @Test
    void contextLoad() {
        ossClient.putObject("lostred", "oppo.png", new File("D:\\Development\\Manuals\\谷粒商城资料源码\\pics\\oppo.png"));
        ossClient.shutdown();
        System.out.println("上传成功！");
    }
}
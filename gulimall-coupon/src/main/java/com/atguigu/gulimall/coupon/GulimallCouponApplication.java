package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>一、启用注册中心的步骤</p>
 * <p>1.引入注册中心</p>
 * <p>2.在application中配置应用名和注册中心地址</p>
 * <p>3.在启动类上添加{@link EnableDiscoveryClient}注解</p>
 * <br>
 * <p>二、启用配置中心的步骤</p>
 * <p>1.引入配置中心和bootstrap依赖</p>
 * <p>2.创建bootstrap并配置应用名和配置中心地址</p>
 * <p>3.在配置中心添加对应应用名的配置</p>
 * <p>4.动态更新配置需要添加{@link org.springframework.cloud.context.config.annotation.RefreshScope}注解</p>
 * <p>如果配置中心和应用中都配置了相同的项，优先使用配置中心的值</p>
 * <br>
 * <p>三、配置中心细节</p>
 * <p>1.命名空间：默认是public(保留空间)，用于配置隔离，在bootstrap中配置命名空间</p>
 * <p>可以创建开发、测试、生产对应的命名空间</p>
 * <p>或者可以创建服务对应的命名空间</p>
 * <p>2.配置集</p>
 * <p>3.配置集id：在nacos中是Data Id</p>
 * <p>4.配置分组：默认是DEFAULT_GROUP</p>
 * <br>
 * <p>本项目中，用命名空间区分每个服务，用配置分组区分开发、测试、生产环境</p>
 * <br>
 * <p>四、加载配置集</p>
 * <p>1.任何配置文件都可以放在配置中心</p>
 * <p>2.需要在bootstrap中配置spring.cloud.nacos.config.extension-configs</p>
 * <p>3.spring-boot中的方法获取配置中心中配置的值</p>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

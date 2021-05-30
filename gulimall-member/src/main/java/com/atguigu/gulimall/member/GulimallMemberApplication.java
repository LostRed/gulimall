package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>远程调用其它服务</p>
 * <p>1.引入openfeign依赖</p>
 * <p>2.编写一个接口，告诉spring-cloud这个接口需要远程调用</p>
 * <p>3.在接口上添加{@link org.springframework.cloud.openfeign.FeignClient}注解并指明应用名，
 * 声明该接口要调用哪个服务</p>
 * <p>4.在接口的每一个方法上添加{@link org.springframework.web.bind.annotation.RequestMapping}注解，
 * 声明该方法要调用服务的哪个方法</p>
 * <p>5.在启动类上添加{@link EnableDiscoveryClient}注解，是应用在注册中心中能够找到对应服务</p>
 * <p>6.在启动类上添加{@link EnableFeignClients}注解并指明哪些接口是feign客户端，开启远程调用功能</p>
 */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}

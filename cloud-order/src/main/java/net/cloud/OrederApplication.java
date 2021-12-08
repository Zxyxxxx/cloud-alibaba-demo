package net.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//开启服务发现
@EnableDiscoveryClient
//开启fegin
@EnableFeignClients
public class OrederApplication {


    public static void main(String[] args){
        SpringApplication.run(OrederApplication.class,args);
        System.out.println("-----订单服务启动成功-----");
    }

    @Bean
    @LoadBalanced//开启ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

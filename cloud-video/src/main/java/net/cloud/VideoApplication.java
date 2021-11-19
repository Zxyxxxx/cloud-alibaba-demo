package net.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("net.cloud.dao")
public class VideoApplication {


    public static void main(String[] args){
        SpringApplication.run(VideoApplication.class,args);
        System.out.println("-----视频服务启动成功-----");
    }

}

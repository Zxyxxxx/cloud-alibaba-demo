package net.cloud.controller;

import net.cloud.domin.Video;
import net.cloud.domin.VideoOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 创建订单调用视频服务
     * */
    @RequestMapping("/saveOrder")
    public Object saveOrder(int videoId){
//        Video video = restTemplate.getForObject("http://localhost:9000/api/v1/video/findVideoById?videoId="+videoId,Video.class);

//        List<ServiceInstance> list = discoveryClient.getInstances("cloud-video-service");
//        ServiceInstance serviceInstance = list.get(0);
        Video video = restTemplate.getForObject("http://cloud-video-service/api/v1/video/findVideoById?videoId="+videoId,Video.class);

        VideoOrder order = new VideoOrder();
        order.setVideoId(video.getId());
        order.setVideoTitle(video.getTitle());
        order.setCreateTime(new Date());
        order.setServerInfo(video.getServerInfo());
        return order;
    }


}

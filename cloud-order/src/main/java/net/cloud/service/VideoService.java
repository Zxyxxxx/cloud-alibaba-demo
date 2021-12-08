package net.cloud.service;

import net.cloud.domin.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 视频服务客户端
 * */
@FeignClient(value = "cloud-video-service")
public interface VideoService {

    @GetMapping("/api/v1/video/findVideoById")
    Video findById(@RequestParam("videoId") int videoId);

    @PostMapping("/api/v1/video/save")
    int save(@RequestBody Video video);

}

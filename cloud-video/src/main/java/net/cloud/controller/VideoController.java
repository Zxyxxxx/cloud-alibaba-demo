package net.cloud.controller;


import net.cloud.domin.Video;
import net.cloud.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 查询视频详情
     * */
    @GetMapping("/findVideoById")
    public Object findVideoById(int videoId, HttpServletRequest request){
        Video video = videoService.findVideoById(videoId);
        video.setServerInfo(request.getServerName()+":"+request.getServerPort());
        return video;
    }



}

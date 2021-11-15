package net.cloud.controller;


import net.cloud.domin.Video;
import net.cloud.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/findVideoByIdsssss")
    public Object findVideoById(int videoId){
        Video video = videoService.findVideoById(videoId);
        return video;
    }



}

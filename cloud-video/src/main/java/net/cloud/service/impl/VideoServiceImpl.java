package net.cloud.service.impl;

import net.cloud.dao.VideoMapper;
import net.cloud.domin.Video;
import net.cloud.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findVideoById(int videoId) {
        return videoMapper.findById(videoId);
    }
}

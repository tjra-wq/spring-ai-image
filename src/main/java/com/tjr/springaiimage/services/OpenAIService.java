package com.tjr.springaiimage.services;

import com.tjr.springaiimage.model.Question;
import org.springframework.web.multipart.MultipartFile;

public interface OpenAIService {
    byte[] getImage(Question question);

    String getDescription(MultipartFile file);
}

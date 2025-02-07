package com.tjr.springaiimage.services;

import com.tjr.springaiimage.model.Question;

public interface OpenAIService {
    Object getImage(Question question);
}

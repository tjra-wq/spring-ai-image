package com.tjr.springaiimage.services;

import com.tjr.springaiimage.model.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenAIServiceImpl implements OpenAIService{
    @Override
    public Object getImage(Question question) {
        return null;
    }
}

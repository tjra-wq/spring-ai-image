package com.tjr.springaiimage.controllers;

import com.tjr.springaiimage.services.OpenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final OpenAIService openAIService;

    //todo impl
}

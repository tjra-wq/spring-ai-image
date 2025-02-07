package com.tjr.springaiimage.controllers;

import com.tjr.springaiimage.model.Question;
import com.tjr.springaiimage.services.OpenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("generate")
public class QuestionController {

    private final OpenAIService openAIService;

    @PostMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage(@RequestBody Question question) {
        return openAIService.getImage(question);
    }

    @PostMapping(value = "/imageDescription",
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> uploadImageAndGetDescription(
            @Validated @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(openAIService.getDescription(file));
    }
}

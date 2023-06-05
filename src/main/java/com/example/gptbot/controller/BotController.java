package com.example.gptbot.controller;

import com.example.gptbot.payload.ApiRequest;
import com.example.gptbot.payload.ApiResponse;
import com.example.gptbot.payload.Message;
import com.example.gptbot.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bot")
public class BotController {

    @Value("${gpt.model}")
    private String model;

    private final BotService botService;

    @PostMapping("/ask")
    public ResponseEntity<String> chat(@RequestBody String content) {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setModel(model);
        apiRequest.setMessages(List.of(new Message("user", content)));
        ApiResponse response = botService.ask(apiRequest);
        return new ResponseEntity<>(response.getChoices().get(0).getMessage().getContent(), HttpStatus.OK);
    }
}

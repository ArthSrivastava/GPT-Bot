package com.example.gptbot.service;

import com.example.gptbot.payload.ApiRequest;
import com.example.gptbot.payload.ApiResponse;
import com.example.gptbot.proxy.BotProxyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotService {
    private final BotProxyClient botProxyClient;

    public ApiResponse ask(ApiRequest apiRequest) {
        return botProxyClient.getResponse(apiRequest);
    }
}

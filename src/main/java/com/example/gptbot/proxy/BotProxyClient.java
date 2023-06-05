package com.example.gptbot.proxy;

import com.example.gptbot.payload.ApiRequest;
import com.example.gptbot.payload.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "BotProxyClient", url = "https://api.openai.com/v1/chat/completions")
public interface BotProxyClient {
    @PostMapping
    ApiResponse getResponse(@RequestBody ApiRequest apiRequest);
}

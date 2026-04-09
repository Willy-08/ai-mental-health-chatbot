package com.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getResponse(String message) {

        if(message.toLowerCase().contains("stress"))
            return "It is normal to feel stressed sometimes. Try relaxation and deep breathing.";

        if(message.toLowerCase().contains("sad"))
            return "I’m here for you. Talking to someone you trust can help.";

        return "Thank you for sharing. How are you feeling today?";
    }
}
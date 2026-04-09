package com.chatbot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    // In-memory chat history (for testing)
    private final List<String> chatHistory = new ArrayList<>();

    // Endpoint to send a message
    @PostMapping("/send")
    public MessageResponse sendMessage(@RequestBody MessageRequest request) {
        // Simple AI response logic (replace with real AI logic later)
        String userMessage = request.getMessage();
        chatHistory.add("User: " + userMessage);

        String botResponse = "Hello! You said: " + userMessage;
        chatHistory.add("Bot: " + botResponse);

        return new MessageResponse(botResponse, new ArrayList<>(chatHistory));
    }

    // Endpoint to get full chat history
    @GetMapping("/history")
    public List<String> getHistory() {
        return new ArrayList<>(chatHistory);
    }

    // Request body class
    public static class MessageRequest {
        private String message;
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
    }

    // Response class
    public static class MessageResponse {
        private String reply;
        private List<String> history;

        public MessageResponse(String reply, List<String> history) {
            this.reply = reply;
            this.history = history;
        }

        public String getReply() { return reply; }
        public List<String> getHistory() { return history; }
    }
}
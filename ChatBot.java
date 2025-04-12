
class ChatBot {

    // Respond based on user input
    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hi") || input.contains("hello") || input.contains("hey")) {
            return "Hello! How can I help you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing great! How about you?";
        } else if (input.contains("i'm fine") || input.contains("i am fine") || input.contains("good")) {
            return "That's good to hear!";
        } else if (input.contains("sad") || input.contains("tired") || input.contains("not okay")) {
            return "I'm sorry to hear that. Talking can help — I'm here for you.";
        } else if (input.contains("thank you") || input.contains("thanks")) {
            return "You're welcome!";
        } else if (input.contains("bye") || input.contains("goodbye")) {
            return "Goodbye! Talk to you soon!";
        } else if (input.contains("name")) {
            return "I'm DRAVIS AI, your friendly chatbot.";
        } else {
            return "Hmm... I’m not sure how to respond to that. Could you rephrase?";
        }
    }
}

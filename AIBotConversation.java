import java.util.*;

public class AIBotConversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("🤖 DRAVIS AI: Hello! I'm DRAVIS AI. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.toLowerCase().contains("bye")) {
                System.out.println("🤖 DRAVIS AI: " + bot.getResponse(userInput));
                break;
            }

            String response = bot.getResponse(userInput);
            System.out.println("🤖 DRAVIS AI: " + response);
        }

        scanner.close();
    }
}

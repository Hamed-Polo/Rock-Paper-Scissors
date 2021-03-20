import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"Rock", "Paper", "Scissors"};
        int playerCount = 0;
        int botCount = 0;
        
        System.out.println("Welcome to Rock Paper Scissors");
        String answer = "";

        for (int h = 0; h < 3; h++) {
            System.out.print("\nChoose between Rock, Paper, or Scissors " +
                    "(Best" +
                    " " +
                    "out of " +
                    "3)" +
                    " or type exit to leave: ");
            answer = input.next();

            if (answer.equalsIgnoreCase("exit")){
                break;
            }
            int rand = (int) (Math.random() * 3 + 0.0);
            String randomAnswer = array[rand];
            int temp = 0;

            if (answer.equalsIgnoreCase("rock")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Paper beats rock.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Rock beats scissors.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("paper")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Paper beats rock.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Scissors beat paper.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("scissors")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Rock beats scissors.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Scissors beats paper.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
            else {
                h = temp;
            }
        }
        if (answer.equalsIgnoreCase("exit")){
            System.out.println("\nGame Over. You Quit");
            System.exit(1);
        }
        if (playerCount > botCount){
            System.out.println("\nCongrats! You Win!");
        }
        else if (botCount > playerCount){
            System.out.println("\nGame Over. You Lose.");
        }
        else {
            System.out.println("\nIt's Tied. Nobody Wins!");
        }
    }
}

import util.Input;

import java.util.Scanner;

public class thomasOffer {
    static Input input1 = new Input();
    static Scanner scan = new Scanner(System.in);
    // rock paper scissors
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("\n");
        System.out.println("Welcome to Scissors Rock Paper Mania!\n");
        System.out.println("Would you like to play a game?\n");
        Boolean play = input.yesNo();
        if (play) {
            System.out.println("Enter 1 to play the Computer\n\nEnter 2 to play against a Friend\n");
            int choice = input.getInt(1, 2);
            if (choice == 1) {
                playCpu();
            } else {
                playFriend();
            }
        }

    }

    public static void playCpu() {
        boolean confirm = true;
        int playerScore = 0;
        int computerScore = 0;
        do {
            System.out.println("\n Move Menu\n-----------------\n" + "Enter 1 for Scissors\n"+"    _    _\n" + "   (_)  / )\n" +
                    "     | (_/ \n" + "    _+/  \n" +  "   //|\\\n" +  "  // | )\n" +  " (/  |/    \n" +
                    "Enter 2 for Rock\n" + "    " +
                    "_______\n"+ "---'   ____)\n" + "      (_____)\n" + "      (_____)\n" +"      (____)\n" + "---.__(___)\n" +
                    "Enter 3 for Paper\n     __________\n" + "---'    _______)____\n" + "           _________)\n" + "          __________)\n" +
                    "         __________)\n" + "---._____________)\n" + "Enter 4 to exit");
            int playerMove = input1.getInt(1,5);
            int rand = (int) (Math.random() * 3) + 1;

            switch (playerMove) {
                case 1:
                    System.out.println("Player throws Scissors\n");
                    System.out.println("    _    _\n" +
                            "   (_)  / )\n" +
                            "     | (_/ \n" +
                            "    _+/  \n" +
                            "   //|\\\n" +
                            "  // | )\n" +
                            " (/  |/    ");
                    if (rand == 1) {
                        System.out.println("Computer throws Scissors\n    _    _\n" +
                                "   (_)  / )\n" +
                                "     | (_/ \n" +
                                "    _+/  \n" +
                                "   //|\\\n" +
                                "  // | )\n" +
                                " (/  |/    \n\nScissors likes Scissors and make little scissors\n\nIt's a tie, no points!");
                    } else if (rand == 2) {
                        System.out.println("Computer throws Rock\n    _______\n" +
                                "---'   ____)\n" +
                                "      (_____)\n" +
                                "      (_____)\n" +
                                "      (____)\n" +
                                "---.__(___)\n\nRock crushes Scissors\n\nComputer gets the point!");
                        computerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else {
                        System.out.println("Computer throws Paper\n     __________\n" +
                                "---'    _______)____\n" +
                                "           _________)\n" +
                                "          __________)\n" +
                                "         __________)\n" +
                                "---._____________)\n\nScissors shred Paper\n\nYou get the point!\n");
                        playerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    }
                    break;
                case 2:
                    System.out.printf("Player throws Rock\n    _______\n" +
                            "---'   ____)\n" +
                            "      (_____)\n" +
                            "      (_____)\n" +
                            "      (____)\n" +
                            "---.__(___)\n");
                    if (rand == 1) {
                        System.out.println("Computer throws Scissors\n    _    _\n" +
                                "   (_)  / )\n" +
                                "     | (_/ \n" +
                                "    _+/  \n" +
                                "   //|\\\n" +
                                "  // | )\n" +
                                " (/  |/    \n\nRock crushes Scissors\n\nYou get the point!");
                        playerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else if (rand == 2) {
                        System.out.println("Computer throws Rock\n    _______\n" +
                                "---'   ____)\n" +
                                "      (_____)\n" +
                                "      (_____)\n" +
                                "      (____)\n" +
                                "---.__(___)\n\nRock likes Rock and makes pebbles\n\nIt's a tie, no points!");
                    } else {
                        System.out.println("Computer throws Paper\n     __________\n" +
                                "---'    _______)____\n" +
                                "           _________)\n" +
                                "          __________)\n" +
                                "         __________)\n" +
                                "---._____________)\n\nPaper suffocates Rock\n\nComputer gets the point!");
                        computerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    }
                    break;
                case 3:
                    System.out.printf("Player throws Paper\n     __________\n" +
                            "---'    _______)____\n" +
                            "           _________)\n" +
                            "          __________)\n" +
                            "         __________)\n" +
                            "---._____________)\n");
                    if (rand == 1) {
                        System.out.println("Computer throws Scissors\n    _    _\n" +
                                "   (_)  / )\n" +
                                "     | (_/ \n" +
                                "    _+/  \n" +
                                "   //|\\\n" +
                                "  // | )\n" +
                                " (/  |/    \n\nScissors shred Paper\n\nComputer gets the point!");
                        computerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else if (rand == 2) {
                        System.out.println("Computer throws Rock\n    _______\n" +
                                "---'   ____)\n" +
                                "      (_____)\n" +
                                "      (_____)\n" +
                                "      (____)\n" +
                                "---.__(___)\n\nPaper suffocates Rock\n\nYou get the point!");
                        playerScore += 1;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else {
                        System.out.println("Computer throws Paper\n     __________\n" +
                                "---'    _______)____\n" +
                                "           _________)\n" +
                                "          __________)\n" +
                                "         __________)\n" +
                                "---._____________)\n\nPaper likes Paper and makes little paper\n\n It's a tie, no points!");
                    }
                    break;
                case 4:
                    System.out.println("Are you sure you want to exit?");

                    confirm = false;
                    break;
                case 5:
                    System.out.println("You have earned Fire!\n               (  .      )\n" +
                            "           )           (              )\n" +
                            "                 .  '   .   '  .  '  .\n" +
                            "        (    , )       (.   )  (   ',    )\n" +
                            "         .' ) ( . )    ,  ( ,     )   ( .\n" +
                            "      ). , ( .   (  ) ( , ')  .' (  ,    )\n" +
                            "     (_,) . ), ) _) _,')  (, ) '. )  ,. (' )\n" +
                            "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\nPlayer throws Fire!");
                    if (rand == 1) {
                        System.out.println("Computer throws Scissors\n    _    _\n" +
                                "   (_)  / )\n" +
                                "     | (_/ \n" +
                                "    _+/  \n" +
                                "   //|\\\n" +
                                "  // | )\n" +
                                " (/  |/    \n\nFire melts down Scissors\n\nYou get 5 points!");
                        playerScore += 5;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else if (rand == 2) {
                        System.out.println("Computer throws Rock\n    _______\n" +
                                "---'   ____)\n" +
                                "      (_____)\n" +
                                "      (_____)\n" +
                                "      (____)\n" +
                                "---.__(___)\n\nFire melts down Rock\n\nYou get 10 points!");
                        playerScore += 10;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    } else {
                        System.out.println("Computer throws Paper\n     __________\n" +
                                "---'    _______)____\n" +
                                "           _________)\n" +
                                "          __________)\n" +
                                "         __________)\n" +
                                "---._____________)\n\nFire burns Paper to ashes\n\nYou get 15 points!");
                        playerScore += 15;
                        System.out.printf("The score is:%n Player: %d%n Computer %d%n", playerScore, computerScore);
                    }
            }
            if (playerScore % 3 == 0 && computerScore == playerScore -3) {


            }

        } while (confirm);
    }

    public static void playFriend() {
        boolean confirm1 = true;
        int player1Score = 0;
        int player2Score = 0;
        String player1;
        String player2;

        System.out.println("What is Player 1's name?");
        player1 = scan.nextLine();
        System.out.printf("Welcome, it's nice to meet you %s%n", player1);
        System.out.println("What is Player 2's name?");
        player2 = scan.nextLine();
        System.out.printf("Welcome, it's nice to meet you %s%n", player2);
        do {
            System.out.printf("%s, Please choose a move!%n ",player1);
            System.out.println("\n Move Menu\n-----------------\n" + "Enter 1 for Scissors\n"+"    _    _\n" + "   (_)  / )\n" +
                    "     | (_/ \n" + "    _+/  \n" +  "   //|\\\n" +  "  // | )\n" +  " (/  |/    \n" +
                    "Enter 2 for Rock\n" + "    " +
                    "_______\n"+ "---'   ____)\n" + "      (_____)\n" + "      (_____)\n" +"      (____)\n" + "---.__(___)\n" +
                    "Enter 3 for Paper\n     __________\n" + "---'    _______)____\n" + "           _________)\n" + "          __________)\n" +
                    "         __________)\n" + "---._____________)\n" + "Enter 4 to exit");
            int player1Move = input1.getInt(1, 5);

            System.out.printf("%s, Please choose a move!\n ",player2);
            System.out.println("\n Move Menu\n-----------------\n" + "Enter 1 for Scissors\n"+"    _    _\n" + "   (_)  / )\n" +
                    "     | (_/ \n" + "    _+/  \n" +  "   //|\\\n" +  "  // | )\n" +  " (/  |/    \n" +
                    "Enter 2 for Rock\n" + "    " +
                    "_______\n"+ "---'   ____)\n" + "      (_____)\n" + "      (_____)\n" +"      (____)\n" + "---.__(___)\n" +
                    "Enter 3 for Paper\n     __________\n" + "---'    _______)____\n" + "           _________)\n" + "          __________)\n" +
                    "         __________)\n" + "---._____________)\n" + "Enter 4 to exit");
            int player2Move = input1.getInt(1, 5);
                switch (player1Move) {
                    case 1:
                        System.out.printf("%s throws Scissors\n", player1);
                        System.out.println("    _    _\n" +
                                "   (_)  / )\n" +
                                "     | (_/ \n" +
                                "    _+/  \n" +
                                "   //|\\\n" +
                                "  // | )\n" +
                                " (/  |/    ");
                        switch (player2Move){
                            case 1:
                                System.out.printf("%s throws Scissors\n",player2);
                                System.out.println("    _    _\n" +
                                        "   (_)  / )\n" +
                                        "     | (_/ \n" +
                                        "    _+/  \n" +
                                        "   //|\\\n" +
                                        "  // | )\n" +
                                        " (/  |/    \n");
                                System.out.println("It's a tie, No Points!\n");
                                break;
                            case 2:
                                System.out.printf("%s throws Rock\n    _______\n" +
                                        "---'   ____)\n" +
                                        "      (_____)\n" +
                                        "      (_____)\n" +
                                        "      (____)\n" +
                                        "---.__(___)\n\nRock crushes Scissors into paperclips\n\n%s gets the point!",player2);
                                player2Score += 1;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                                break;
                            case 3:
                                System.out.printf("%s throws Paper\n     __________\n" +
                                        "---'    _______)____\n" +
                                        "           _________)\n" +
                                        "          __________)\n" +
                                        "         __________)\n" +
                                        "---._____________)\n\n Scissors shred Paper to Confetti\n\n%s get a points!",player1);
                                player1Score += 1;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                            case 4:
                                System.out.println("Are you sure you want to exit?");

                                confirm1 = false;
                                break;
                        }
                        break;
                    case 2:
                        System.out.printf("%s throws Rock\n    _______\n" +
                                "---'   ____)\n" +
                                "      (_____)\n" +
                                "      (_____)\n" +
                                "      (____)\n" +
                                "---.__(___)\n\n", player1);
                        switch (player2Move){
                            case 1:
                                System.out.printf("%s throws Scissors\n",player2);
                                System.out.println("    _    _\n" +
                                        "   (_)  / )\n" +
                                        "     | (_/ \n" +
                                        "    _+/  \n" +
                                        "   //|\\\n" +
                                        "  // | )\n" +
                                        " (/  |/    \n");
                                System.out.printf("Rock crushes Scissors into paperclips\n\n%s gets the point!",player1);
                                player1Score += 1;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                                break;
                            case 2:
                                System.out.printf("%s throws Rock\n    _______\n" +
                                        "---'   ____)\n" +
                                        "      (_____)\n" +
                                        "      (_____)\n" +
                                        "      (____)\n" +
                                        "---.__(___)\n\nRocks like other Rocks and make pebbles, No Points!");
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                                break;
                            case 3:
                                System.out.printf("%s throws Paper\n     __________\n" +
                                        "---'    _______)____\n" +
                                        "           _________)\n" +
                                        "          __________)\n" +
                                        "         __________)\n" +
                                        "---._____________)\n\nPaper suffocates Rock\n\n%s gets a point",player2, player2);
                                player2Score += 1;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                            case 4:
                                System.out.println("Are you sure you want to exit?");

                                confirm1 = false;
                                break;
                        }
                        break;
                    case 3:
                        System.out.printf("%s throws Paper\n     __________\n" +
                                "---'    _______)____\n" +
                                "           _________)\n" +
                                "          __________)\n" +
                                "         __________)\n" +
                                "---._____________)\n\n",player1);
                        switch (player2Move){
                            case 1:
                                System.out.printf("%s throws Scissors\n",player2);
                                System.out.println("    _    _\n" +
                                        "   (_)  / )\n" +
                                        "     | (_/ \n" +
                                        "    _+/  \n" +
                                        "   //|\\\n" +
                                        "  // | )\n" +
                                        " (/  |/    \n");
                                System.out.printf("Scissors cut Paper into confetti\n\n%s gets the point!",player2);
                                player1Score += 2;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                                break;
                            case 2:
                                System.out.printf("%s throws Rock\n    _______\n" +
                                        "---'   ____)\n" +
                                        "      (_____)\n" +
                                        "      (_____)\n" +
                                        "      (____)\n" +
                                        "---.__(___)\n\nPaper suffocates Rock, %s gets a point", player2);
                                player1Score += 1;
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                                break;
                            case 3:
                                System.out.printf("%s throws Paper\n     __________\n" +
                                        "---'    _______)____\n" +
                                        "           _________)\n" +
                                        "          __________)\n" +
                                        "         __________)\n" +
                                        "---._____________)\n\nPaper likes Paper, no points!",player2);
                                System.out.printf("The score is:%n %s: %d%n %s: %d%n", player1, player1Score, player2, player2Score);
                            case 4:
                                System.out.println("Are you sure you want to exit?");
                                confirm1 = false;
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Are you sure you want to exit?");
                        confirm1 = false;
                        break;
                }
        } while (confirm1);
    }
}



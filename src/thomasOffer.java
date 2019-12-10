import util.Input;

public class thomasOffer {
// rock paper scissors

public static void main(String[] args) {
    Input input = new Input();

    System.out.println("Welcome to Rock Paper Scissors Mania!\n");
    System.out.println("Would you like to play?");
        Boolean confirm = input.yesNo();
do {
    System.out.println("Please enter your move\n"+ "Enter 1 for Rock\n"+"Enter 2 for Paper\n"+ "Enter 3 for Scissors\n"+"Enter 4 to exit");
    int playerMove = input.getInt(1,4);
    switch (playerMove) {
        case 1:
            System.out.println("Player chose Rock\n");
            break;
        case 2:
            System.out.println("Player chose Paper\n");
            break;
        case 3:
            System.out.println("Player chose Scissors\n");
            break;
        case 4:
            confirm = false;
            break;
    }

} while (confirm);
}


}

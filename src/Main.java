import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int userGuess, attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to Guess the Number Game!");
            System.out.println("I have selected a random number between 1 and 100. Try to guess it!");

            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly!");
                    System.out.println("Number of attempts: " + attempts);
                } else if (userGuess < randomNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing Guess the Number!");
        scanner.close();
    }
}

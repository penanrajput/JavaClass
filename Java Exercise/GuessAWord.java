import java.util.ArrayList;
import java.util.Scanner;

class GuessAWord
{
    public static void main(String[] args) {
        String[] words = { "VIENNA", "HELSINKI", "COPENHAGEN", "LONDON", "BERLIN", "AMSTERDAM" } ;
        ArrayList <String> words_to_be_guessed = new ArrayList<String>(6);
        for (int i = 0; i<words.length; i++) 
        {
            words_to_be_guessed.add(words[i]);
        }
        int arr[] = new int[7];

        for(int i=1; i<=6; i++)
        {
            System.out.println(i);
            int random_numbers = (int) ( Math.random() * words_to_be_guessed.size());
            String string_to_guess_now = words_to_be_guessed.get(random_numbers);

            System.out.print("GUESS: ");
            Scanner in = new Scanner(System.in);
            String string_to_guessed = in.next();
            int number_of_guesses = 1 ;
            while(string_to_guessed.equals(string_to_guess_now) == false)
            {
                System.out.println("  You guessed it Wrong. TRY AGAIN....");
                System.out.print("GUESS: ");
                string_to_guessed = in.next();
                number_of_guesses++;
            }
            System.out.println("  You guessed it right : String is -> "+ string_to_guess_now);
            System.out.println("      You guessed it "+number_of_guesses+"  times!");
            
            words_to_be_guessed.remove(random_numbers);
            
        }
    }



}
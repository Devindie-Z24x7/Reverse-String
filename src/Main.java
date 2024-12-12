import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = scanner.nextLine();

        String reverseString = "";
        char character;

        for (int i = 0; i<string.length(); i++) {
            character = string.charAt(i);
            reverseString = character + reverseString;
        }

        System.out.println(reverseString);

    }
}
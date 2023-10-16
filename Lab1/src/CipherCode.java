import java.util.Scanner;

public class CipherCode {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();
        int key = sc.nextInt();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = alphabet.indexOf(c);
            if (index == -1) {
                output += c;
            } else {
                int newIndex = (index + key) % 26;
                output += alphabet.charAt(newIndex);
            }
        }
        System.out.println(output);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.startsWith("echo")) {
                String echoThis = input.split("echo ")[1];
                System.out.println(echoThis);
            } else {
                System.out.printf("%s: command not found\n", input);
            }

        }

        System.exit(0);
    }
}

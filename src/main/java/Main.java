import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        final List<String> AVAILABLE_COMMANDS = List.of("exit", "echo", "type");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String input = sc.nextLine();

            if (!AVAILABLE_COMMANDS.contains(input.split(" ")[0])) {
                System.out.printf("%s: command not found\n", input);
            }

            if (input.equals("exit")) {
                break;
            }

            if (input.startsWith("echo")) {
                String echoThis = input.split("echo ")[1];
                System.out.println(echoThis);
            }

            if (input.startsWith("type")) {
                String typeThis = input.split("type ")[1];
                if (AVAILABLE_COMMANDS.contains(typeThis)) {
                    System.out.printf("%s is a shell builtin\n", typeThis);
                } else {
                    System.out.printf("%s: not found\n", typeThis);
                }
            }

        }

        System.exit(0);
    }
}

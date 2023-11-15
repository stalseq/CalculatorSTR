import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calk(input));
    }

    public static String calk(String input) throws Exception {
        String[] op = new String[]{"+", "-", "*", "/"};
        String[] data = input.split("[+\\-*/]");
        String oper = null;
        int res = 0;

        for (int i = 0; i < op.length; i++) {
            if (input.contains(op[i])) {
                oper = op[i];
            }
        }
        if (oper == null) {
            throw new Exception("Неверная математическая операция!");
        } else if (data.length != 2) {
            throw new Exception("Должно быть два операнда и один оператор");
        } else if (input.contains(" ")) {
            throw new Exception();
        }
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа должны быть от 1 до 10");
        }
        res = switch (oper) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new Exception();
        };
        return String.valueOf(res);
    }
}
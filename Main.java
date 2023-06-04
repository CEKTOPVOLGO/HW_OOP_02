import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, введите первое число, через пробел действие (+ - * /), через пробел второе число:");
        CalcStringParser calcStringParser = new CalcStringParser(scanner.nextLine());        
        Calculator calculator = new Calculator(calcStringParser.getNum1(), calcStringParser.getNum2(), calcStringParser.getOp());
        System.out.println("Результат вычисления: " + calculator.getResult());
    }
}
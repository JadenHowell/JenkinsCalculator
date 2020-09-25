import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Command:");
        Scanner scanner = new Scanner(System.in);

        String cmdLine = scanner.nextLine();

        List<String> arguments = new LinkedList<>();
        arguments = Arrays.asList(cmdLine.split(" "));

        while (!arguments.get(0).equals("quit")) {
            if ("add".equals(arguments.get(0))) {
                System.out.println(calculator.add(Integer.parseInt(arguments.get(1)),Integer.parseInt(arguments.get(2))));
            } else if ("binary".equals(arguments.get(0))) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(arguments.get(1))));
            } else if ("fibonacci".equals(arguments.get(0))) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(arguments.get(1))));
            } else if ("divide".equals(arguments.get(0))) {
                System.out.println(calculator.divide(Integer.parseInt(arguments.get(1)),Integer.parseInt(arguments.get(2))));
            } else if ("subtract".equals(arguments.get(0))) {
                System.out.println(calculator.subtract(Integer.parseInt(arguments.get(1)),Integer.parseInt(arguments.get(2))));
            } else if ("multiply".equals(arguments.get(0))) {
                System.out.println(calculator.multiply(Integer.parseInt(arguments.get(1)),Integer.parseInt(arguments.get(2))));
            } else {
                System.out.println("command not recognized");
            }
            System.out.println("Next command: (or 'quit')");
            cmdLine = scanner.nextLine();
            arguments = Arrays.asList(cmdLine.split(" "));
        }

    }

}

import java.util.Scanner;

public class SciCalculator {
    public static void menu(){
        System.out.print("\nCalculator menu \n---------------");
        System.out.print("\n0. Exit Program");
        System.out.print("\n1. Addition");
        System.out.print("\n2. Subtraction");
        System.out.print("\n3. Multiplication");
        System.out.print("\n4. Division");
        System.out.print("\n5. Exponentiation");
        System.out.print("\n6. Logarithm");
        System.out.print("\n7. Display Average");
    }
    public static void main(String[] args) {
        Scanner sciCalculator = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double result = 0;
        double totalSum = 0;
        int operation;
        int count = 0;

        System.out.println("Current Result: " + result );
        menu();

        while(true){
            System.out.println("\n\nEnter Menu Selection: ");
            operation=sciCalculator.nextInt();
            switch (operation) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = firstNumber + secondNumber;
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 2 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = firstNumber - secondNumber;
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 3 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = firstNumber * secondNumber;
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 4 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = firstNumber / secondNumber;
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 5 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = Math.pow(firstNumber, secondNumber);
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 6 -> {
                    System.out.println("Enter first operand: ");
                    firstNumber = sciCalculator.nextDouble();
                    System.out.println("Enter second operand: ");
                    secondNumber = sciCalculator.nextDouble();
                    result = Math.log(secondNumber) / Math.log(firstNumber);
                    System.out.println("Current Result: " + result);
                    totalSum += result;
                    count++;
                }
                case 7 -> {
                    if (count == 0) {
                        System.out.println("Error: no calculations yet to average!");
                        break;
                    }
                    System.out.println("Sum of calculations: " + totalSum);
                    System.out.println("Number of calculations: " + count);
                    result = totalSum / count;
                    System.out.println("Average of calculations: " + result);
                }
            }
             menu();
        }
    }
}







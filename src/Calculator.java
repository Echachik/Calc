import java.util.Scanner;

public class Calculator {
    private int result = 0;

    public void run() {
        String operand = "";

        do {
            showMenu();

            operand = readOperand("Please enter operand: ");
            int number = readNumber("Please enter number: ");

            switch (operand) {
                case "+":
                    addMethod(number);
                    break;
                case "-":
                    deductMethod(number);
                    break;
                case "/":
                    divideMethod(number);
                    break;
                case "*":
                    multiplyMethod(number);
                    break;
            }
        } while (!operand.equals("Q"));
    }
       public void showMenu(){
               System.out.println("+ Add");
               System.out.println("- Deduct");
               System.out.println("* Multiply");
               System.out.println("/ Divide");
               System.out.println("Q Quit");
               System.out.println("Your current value is:" + result);
       }
                 private String readOperand(String message) {
                    System.out.print(message);

                    Scanner sc = new Scanner(System.in);

                    return sc.nextLine();
                }
                private int readNumber(String message) {
        int result = 0;
boolean isValid = false;
        do {
            try {
                result = Integer.parseInt(readOperand(message));

                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid symbols, please try again");
            }
        } while (!isValid);
                    return result;
    }

    private void addMethod(int number) {
       result += number;
    }

    private void deductMethod(int number) {
        result -= number;
    }

    private void divideMethod(int number) {
        result -= number;
    }

    private void multiplyMethod(int number) { result *= number;}

    private int getResult() {
        return result;
    }

    public void setResult(int result) {
            this.result = result;
            }
    }
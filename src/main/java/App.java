/**
 * Created by samhudgens on 5/20/16.
 */
public class App {

    UserInput userInput = new UserInput();
    Calculator calculator = new Calculator();
    Display display = new Display();

    public void mathEngine() {
        boolean working = true;
        while(working) {
            int userChoice = userInput.promptUserforInt("What would you like to do?\n 1. Add 2. Substract 3. Multiply\n 4. Divide 5. Square 6. Square Root\n 7. Exponent 8. Invert Number 9. Invert sign of number\n 10. Sine 11. Cosine 12. Tangent\n 13. Arcsine 14. Arccosine 15. Arctangent\n 16. Log 17. Inverse Log 18. Natural Log\n 19. Inverse Natural Log 20. Factorial 21. Exit");
            switch (userChoice) {
                case 1:
                    double add1 = userInput.promptUserforDouble("What number to add?");
                    double add2 = userInput.promptUserforDouble("What to add to that number?");
                    display.currentDisplayValue = calculator.add(add1, add2);
                    break;
                case 2:
                    double subtract1 = userInput.promptUserforDouble("What number do you want to subtract a number from?");
                    double subtract2 = userInput.promptUserforDouble("What number do you want to subtract from that number?");
                    display.currentDisplayValue = calculator.subtract(subtract1, subtract2);
                    break;
                case 3:
                    double multiply1 = userInput.promptUserforDouble("What number do you want to multiply?");
                    double multiply2 = userInput.promptUserforDouble("What number do you want to multiply with that number?");
                    display.currentDisplayValue = calculator.multiply(multiply1, multiply2);
                    break;
                case 4:
                    double divide1 = userInput.promptUserforDouble("What number do you want to be divided?");
                    double divide2 = userInput.promptUserforDouble("What number do you want to divide that other number by?");
                    display.currentDisplayValue = calculator.divide(divide1, divide2);
                    break;
                case 5:
                    double square1 = userInput.promptUserforDouble("What number do you want to square?");
                    display.currentDisplayValue = calculator.square(square1);
                    break;
                case 6:
                    double squared = userInput.promptUserforDouble("What number do you want the square root of?");
                    display.currentDisplayValue = calculator.squareRoot(squared);
                    break;
                case 7:
                    double raised = userInput.promptUserforDouble("What number do you want to raise to a power?");
                    double exponent = userInput.promptUserforDouble("What power do you want to raise that number to?");
                    display.currentDisplayValue = calculator.exponent(raised, exponent);
                    break;
                case 8:
                    double inverted = userInput.promptUserforDouble("What number do you want to invert (divide 1 by the number)");
                    display.currentDisplayValue = calculator.inverse(inverted);
                    break;
                case 9:
                    double insign = userInput.promptUserforDouble("What number do you want to switch the sign of?");
                    display.currentDisplayValue = calculator.invertSign(insign);
                    break;
                case 10:
                    double sined = userInput.promptUserforDouble("Enter a number to find the sine");
                    display.currentDisplayValue = calculator.sin(sined);
                    break;
                case 11:
                    double cos = userInput.promptUserforDouble("Find a cosine");
                    display.currentDisplayValue = calculator.cos(cos);
                    break;
                case 12:
                    double tanned = userInput.promptUserforDouble("Enter a number to find the tangent");
                    display.currentDisplayValue = calculator.tan(tanned);
                    break;
                case 13:
                    double arcsined = userInput.promptUserforDouble("Enter a number to find the inverse sin");
                    display.currentDisplayValue = calculator.arcsin(arcsined);
                    break;
                case 14:
                    double arccosed = userInput.promptUserforDouble("Enter a number to find the inverse cosine");
                    display.currentDisplayValue = calculator.arccos(arccosed);
                    break;
                case 15:
                    double arctanned = userInput.promptUserforDouble("Enter a number to find the arctangent");
                    display.currentDisplayValue = calculator.arctan(arctanned);
                    break;
                case 16:
                    double logged = userInput.promptUserforDouble("Enter a number to find the logarithm");
                    display.currentDisplayValue = calculator.log(logged);
                    break;
                case 17:
                    double unlogged = userInput.promptUserforDouble("Enter a number to find the inverse log");
                    display.currentDisplayValue = calculator.inverseLog(unlogged);
                    break;
                case 18:
                    double natlogged = userInput.promptUserforDouble("Enter a number to find the natural log");
                    display.currentDisplayValue = calculator.naturalLog(natlogged);
                    break;
                case 19:
                    double unnatlogged = userInput.promptUserforDouble("Enter a number to find the inverse natural log");
                    display.currentDisplayValue = calculator.inverseNaturalLog(unnatlogged);
                    break;
                case 20:
                    double facted = userInput.promptUserforDouble("Enter a number to find the factorial");
                    display.currentDisplayValue = calculator.factorial(facted);
                    break;
                case 21:
                    working = false;
                    System.out.println("Calculator off");
                    break;
            }
            System.out.println(display.currentDisplayValue);
        }
    }

    public static void main(String[] args) {
        App app = new App();

        app.mathEngine();
    }
}


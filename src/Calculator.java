import java.util.Scanner;

/**
 * ეს კლასი გამოიყენება მარტივი არითმეტიკული ოპერაციების შესასრულებლად
 * როგორიცაა შეკრება, გამოკლება, გამრავლება და გაყოფა.
 */
public class Calculator {

    private double num1, num2, result;
    private char operator;

    /**
     * მეთოდი რომელიც მიიღებს მომხმარებლის მიერ შეყვანილ ორ რიცხვს და ოპერატორს
     * და შეასრულებს შესაბამის არითმეტიკულ ოპერაციას.
     */
    public void calculate() {
        Scanner input = new Scanner(System.in);

        System.out.print("შეიყვანეთ რიცხვი: ");
        num1 = input.nextDouble();

        System.out.print("მიუთითეთ რა ოპერაციის შესრულება გსურთ (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("შეიყვანეთ მეორე რიცხვი: ");
        num2 = input.nextDouble();

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                Logger.error("დაფიქსირდა შეცდომა: ნულზე გაყოფა დაუშვებელია.");
                return;
            }
        } else {
            Logger.error("დაფიქსირდა შეცდომა: არასწორი ოპერატორი.");
            return;
        }

        Logger.info("შედეგი: " + result);
    }
}
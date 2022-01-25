import java.util.Scanner;

public class Wk4Qn1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        Bmi newBmi = new Bmi(weight, height);
        System.out.println("BMI is " + newBmi.getBMI());
        System.out.println(newBmi.getBMIClass());

    }
}

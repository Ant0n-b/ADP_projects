import java.util.Scanner;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

       
    @Override
    protected boolean customerWantsCondiments() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like sugar and milk with your coffee (y/n)? ");
        String answer = scanner.nextLine();
        return answer.toLowerCase().startsWith("y");
    }
}

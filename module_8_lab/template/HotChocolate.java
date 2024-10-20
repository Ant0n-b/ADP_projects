public class HotChocolate extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Приготовление горячего шоколада...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавление маршмеллоу...");
    }

   
    @Override
    protected boolean customerWantsCondiments() {
        System.out.println("Добавить маршмеллоу (y/n)?");
        return getUserInput().equalsIgnoreCase("y");
    }

    private String getUserInput() {
        
        return "n"; 
    }
}
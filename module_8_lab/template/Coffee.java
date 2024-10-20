public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Заваривание кофе...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавление сахара и молока...");
    }

    
    @Override
    protected boolean customerWantsCondiments() {
        
        System.out.println("Добавить сахар и молоко (y/n)?");
        return getUserInput().equalsIgnoreCase("y");
    }

    
    private String getUserInput() {
       
        return "y"; 
    }
}
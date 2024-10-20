public class Main {
    public static void main(String[] args) {
        
        Beverage tea = new Tea();
        System.out.println("Приготовление чая:");
        tea.prepareRecipe();
        System.out.println();

        
        Beverage coffee = new Coffee();
        System.out.println("Приготовление кофе:");
        coffee.prepareRecipe();
        System.out.println();

        
        Beverage hotChocolate = new HotChocolate();
        System.out.println("Приготовление горячего шоколада:");
        hotChocolate.prepareRecipe();
    }
}
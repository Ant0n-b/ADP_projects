public class BeverageTest {
    public static void main(String[] args) {
          
        Beverage tea = new Tea();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        
        Beverage coffee = new Coffee();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}

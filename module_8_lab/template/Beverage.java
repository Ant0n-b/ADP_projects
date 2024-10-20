public abstract class Beverage {

     
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { 
            addCondiments();
        }
    }

      
    private void boilWater() {
        System.out.println("Кипячение воды...");
    }

    private void pourInCup() {
        System.out.println("Наливание в чашку...");
    }

    
    protected abstract void brew();
    protected abstract void addCondiments();

    
    protected boolean customerWantsCondiments() {
        return true;
    }
}
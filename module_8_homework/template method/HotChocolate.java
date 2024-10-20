public class HotChocolate extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Mixing hot chocolate powder with water");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding whipped cream");
    }
	@Override
    protected boolean customerWantsCondiments() {
        return false;  
    }
}
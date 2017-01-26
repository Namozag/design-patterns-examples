package patterns.structural.decorator.coffee.after;

/**
 *
 * @author Hany
 */
public abstract class CoffeeDecorator implements Coffee {
    
    private Coffee decorated;

    public CoffeeDecorator(Coffee decorated) {
        this.decorated = decorated;
    }

    @Override
    public double getCost() {
        return decorated.getCost();
    }

    @Override
    public String getIngredients() {
        return decorated.getIngredients();
    }

    @Override
    public String toString() {
        return getCost() + " \t| " + getIngredients();
    }
    
}

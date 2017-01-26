package patterns.structural.decorator.coffee.after;

/**
 *
 * @author Hany
 */
public class Milk extends CoffeeDecorator {

    public Milk(Coffee decorated) {
        super(decorated);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
    
}

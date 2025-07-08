package Toppings;

import Pizza.BasePizza;

public class ExtraChicken implements BasePizza {

    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 4;
    }
}

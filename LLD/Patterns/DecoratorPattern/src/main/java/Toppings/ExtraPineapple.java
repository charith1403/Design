package Toppings;

import Pizza.BasePizza;

public class ExtraPineapple implements BasePizza {

    BasePizza basePizza;

    public ExtraPineapple(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 3;
    }
}

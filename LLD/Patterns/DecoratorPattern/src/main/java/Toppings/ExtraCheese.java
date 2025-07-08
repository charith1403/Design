package Toppings;

import Pizza.BasePizza;

public class ExtraCheese implements BasePizza {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 2;
    }
}

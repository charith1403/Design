package org.charith;

import Pizza.BasePizza;
import Pizza.Margherita;
import Pizza.Pepperoni;
import Toppings.ExtraCheese;
import Toppings.ExtraChicken;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza pepperoni = new ExtraChicken(new ExtraCheese(new Pepperoni()));
        System.out.println(pepperoni.cost());

        Margherita margherita = new Margherita();
        System.out.println(margherita.cost());

    }
}
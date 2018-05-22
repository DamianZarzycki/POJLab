package Pl.Pizza.PizzaFactory;

import Pl.Pizza.PizzaModel.*;

public class StandardPizzaFactory implements PizzaFactory {

    public Pizza create(PizzaType type) {
        switch (type)
        {
            case WEGETARIANSKA:
                return  new WegeterianskaPizza();
            case CAPRICIOSA:
                return new CapriciosaPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            default: throw new IllegalArgumentException("Nie ma takiej pizzy");
        }
    }
}

package Pl.Pizza.PizzaFactory;

import Pl.Pizza.PizzaModel.Pizza;

public interface PizzaFactory {
    public Pizza create(PizzaType type);

}

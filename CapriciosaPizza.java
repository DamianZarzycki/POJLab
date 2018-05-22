package Pl.Pizza.PizzaModel;

import Pl.Pizza.PizzaOrder.Product;

public class CapriciosaPizza extends RawPizza implements Pizza {

    public  CapriciosaPizza()
    {
        opis = "Capriciosa pizza";
    }

    @Override
    public double koszt() {
        return 22;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}

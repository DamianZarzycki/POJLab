package Pl.Pizza.PizzaModel;

import Pl.Pizza.PizzaOrder.Product;

public class WegeterianskaPizza extends RawPizza implements Pizza {

    String opis;

    public WegeterianskaPizza()
    {
        opis = "Wegeteriańska pizza";
    }



    @Override
    public double koszt() {
        return 20;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}

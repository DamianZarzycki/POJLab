package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Ser extends PizzaTopping{
    RawPizza rawPizza;

    public Ser(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", ser";
    }

    @Override
    public double koszt() {
        return 1.5;
    }
}

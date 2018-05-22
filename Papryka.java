package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Papryka extends PizzaTopping{
    RawPizza rawPizza;

    public Papryka(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", papryka";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+1;
    }
}

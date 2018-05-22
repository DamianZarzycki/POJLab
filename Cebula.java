package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Cebula extends PizzaTopping {
    RawPizza rawPizza;

    public Cebula(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() +  ", cebula";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt() + 0.70;
    }
}

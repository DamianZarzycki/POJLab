package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Pomidor extends PizzaTopping {
    RawPizza rawPizza;

    public Pomidor(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", pomidor";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+1;
    }
}

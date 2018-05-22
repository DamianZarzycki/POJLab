package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Szynka extends PizzaTopping {
    RawPizza rawPizza;

    public Szynka(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", szynka";
    }

    @Override
    public double koszt() {
        return 1.7;
    }
}

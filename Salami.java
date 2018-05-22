package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class Salami extends PizzaTopping {
    RawPizza rawPizza;

    public Salami(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }

    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", salami";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+2.2;
    }
}

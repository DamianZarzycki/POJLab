package Pl.Pizza.PizzaModel.ToppingElements;

import Pl.Pizza.PizzaModel.RawPizza;

public class PaprykaHot extends PizzaTopping {
    RawPizza rawPizza;

    public PaprykaHot(RawPizza rawPizza){
        this.rawPizza=rawPizza;
    }


    @Override
    public String pobierzOpis() {
        return rawPizza.pobierzopis() + ", papryka ostra";
    }

    @Override
    public double koszt() {
        return rawPizza.koszt()+1.20;
    }
}

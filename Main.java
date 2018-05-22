package Pl.Pizza;

import Pl.Pizza.PizzaFactory.PizzaFactory;
import Pl.Pizza.PizzaFactory.PizzaType;
import Pl.Pizza.PizzaFactory.StandardPizzaFactory;
import Pl.Pizza.PizzaModel.CapriciosaPizza;
import Pl.Pizza.PizzaModel.RawPizza;
import Pl.Pizza.PizzaModel.ToppingElements.Cebula;
import Pl.Pizza.PizzaModel.ToppingElements.Salami;
import Pl.Pizza.PizzaModel.ToppingElements.Ser;
import Pl.Pizza.PizzaModel.WegeterianskaPizza;

public class Main {

    public static void main(String[] args) {
        PizzaFactory factory = new StandardPizzaFactory();
        factory.create(PizzaType.WEGETARIANSKA);
        factory.create(PizzaType.CAPRICIOSA);
        RawPizza rawPizza = new CapriciosaPizza();

        rawPizza = new Salami(rawPizza);

        System.out.println(rawPizza.pobierzopis() + " " + rawPizza.koszt() + "zł");

        rawPizza = new Cebula(rawPizza);
        rawPizza = new Cebula(rawPizza);


        System.out.println(rawPizza.pobierzopis() + " " + rawPizza.koszt() + "zł");
    }
}

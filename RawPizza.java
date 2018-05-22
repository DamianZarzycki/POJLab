package Pl.Pizza.PizzaModel;

public abstract class RawPizza {
    String opis = "PUSTA PIZZA";

    public  String pobierzopis(){
        return opis;
    }

    public abstract double koszt();
}

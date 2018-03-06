package Pierwszy;

public class Car {
String marka;
boolean isNew;
int przebieg;
double cena;

void printCar() {
	System.out.println("Marka: " + marka);
	System.out.println("Nowy: " + isNew);
	System.out.println("Przebieg: " + przebieg);
	System.out.println("Cena: " + cena);
}

	Car(){
		System.out.println("Inicjacja z nowego konstruktora.");
	}
	Car(String marka){
		this();
		this.marka=marka;
	}
	Car(String marka, boolean isNew, int przebieg, double cena){
		this(marka);
		this.isNew = isNew;
		this.przebieg = przebieg;
		this.cena = cena;
	}
	public void setMarka(String marka){
		this.marka=marka;
	}
	
	public String getMarka(){
		return marka;
	}
	
	public boolean New(){
		return isNew;
	}
	
	public void setNew(boolean isNew){
		this.isNew = isNew;
	}
	
	public int getPrzebieg(){
		return przebieg;
	}
	
	public void setPrzebieg(int przebieg){
		this.przebieg = przebieg;	
	}
	
	public void getCena(double cena){
		this.cena = cena;
	} 

}
	


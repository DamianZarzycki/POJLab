package Pierwszy;

public class Hello {

	public static void main(String[] args) {

		/*
		 * Car car = new Car("Mercedes");
		 * 
		 * 
		 * car.Marka = "BMW"; car.New = true; car.Przebieg = 0; car.Cena =
		 * 119990.9;
		 */

		Car car = new Car("Range Rover", false, 23000, 379000.9);
		car.printCar();
		System.out.println("====> zmieniam wartosci");
		
		
		car.setMarka("Audi");
		car.setPrzebieg(82357623);
		car.setNew(false);
		
		System.out.println("Marka " + car.getMarka());
		System.out.println("Przebieg " + car.getPrzebieg());
		System.out.println("Nowy " + car.New());
		System.out.println("Cena " + car.cena);
		

	}

}

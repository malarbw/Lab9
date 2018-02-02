/*
 * Brad Malarkey
 * 
 * Lab 9 -- create a program that will take in info about x number of cars and then print out a table of that info
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCars;
		ArrayList<Car> inventory = new ArrayList<Car>(); //initialize arraylist to store info

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();
		numCars = Validator.getInt(scan, "How many cars do you want to enter?: ");

		for (int i = 0; i < numCars; i++) { //for loop to iterate through the number of cars user wants to do
			Car car = new Car();

			String make = Validator.getString(scan, "Enter car #" + (i + 1) + " make: "); //lines validate info and set the input to Car class
			car.setMake(make); 
			String model = Validator.getString(scan, "Enter car #" + (i + 1) + " model: ");
			car.setModel(model);
			int year = Validator.getInt(scan, "Enter car #" + (i + 1) + " year: ", 1900, 2018);
			car.setYear(year);
			double price = Validator.getDouble(scan, "Enter car #" + (i + 1) + " price: ");
			System.out.println();
			car.setPrice(price);
			inventory.add(car);
		}
		System.out.println();
		System.out.println("Current inventory: ");
		System.out.println();

		for (int i = 0; i < inventory.size(); i++) { //need to iterate back through arraylist to print the info as desired
			System.out.println(inventory.get(i));
		}

	}

}

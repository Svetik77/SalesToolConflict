package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("THIS APP SHOWS SALES DATA");
		System.out.println("----------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}
}

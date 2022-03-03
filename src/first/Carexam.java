package first;

public class Carexam {
	public static void main(String args[]) {
		
		Car car1 = new Car("stupid");
		Car car2 = new Car();
		Car car3 = new Car("±¸±ÞÂ÷",1111);
		
		System.out.println(car1.name);
		System.out.println(car2.name + car2.number);
	}

}

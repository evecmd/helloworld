package 电影;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("Refactoring, a First Example, step7");
		
		Movie m1 = new Movie("Seven", Movie.NEW_RELEASE);
		Movie m2 = new Movie("Terminator", Movie.REGULAR);
		Movie m3 = new Movie("Star Trek", Movie.CHILDRENS);
		
		Rental r1 = new Rental(m1,4);
		Rental r2 = new Rental(m1,2);
		Rental r3 = new Rental(m3,7);
		Rental r4 = new Rental(m2,5);
		Rental r5 = new Rental(m3,3);
		
		Customer c1 = new Customer("jjhou");
		c1.addRental(r1);
		c1.addRental(r4);
		
		Customer c3 = new Customer("jiantao");
		c3.addRental(r3);
		c3.addRental(r5);
		
		System.out.println(c1.statement());
		System.out.println(c3.statement());
		
		
		

	}

}

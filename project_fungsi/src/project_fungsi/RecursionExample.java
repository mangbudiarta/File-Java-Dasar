package project_fungsi;

public class RecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Faktorial dari bilangan 5 adalah " + factorial(5));
		System.out.println("Faktorial dari bilangan 4 adalah " + factorial(4));

	}

	public static double factorial(double d) {
		if (d <= 1) {
			return 1;
		} else {
			return d * factorial(d - 1);
		}
	}

	public static double fibonacci(double d) {
		if (d < 2) {
			return d;
		} else {
			return (fibonacci(d - 1) + fibonacci(d - 2));
		}
	}

}

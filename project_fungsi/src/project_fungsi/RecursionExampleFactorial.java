package project_fungsi;

public class RecursionExampleFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Faktorial dari bilangan 5 adalah " + factorial(5));

	}

	public static double factorial(double d) {
		if (d <= 1) {
			return 1;
		} else {
			return d * factorial(d - 1);
		}
	}

}

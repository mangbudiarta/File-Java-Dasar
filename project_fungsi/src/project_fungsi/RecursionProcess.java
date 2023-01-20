package project_fungsi;

public class RecursionProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double limit = 10;

		System.out.println("Hasil forward method = " + forward(limit));
		System.out.println("Hasil backward method = " + backward(limit));
	}

	public static double forward(double limit) {
		double num1 = 5, result = 0;

		for (double i = 0; i < limit; i++) {
			result += num1;
		}
		return result;
	}

	public static double backward(double limit) {
		double num = 5;
		if (limit <= 1) {
			return num;
		} else {
			return backward(limit - 1) + num;
		}
	}

}

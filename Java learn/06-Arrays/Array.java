
public class Array {
	public static void main(String[] args) {
		int a[] = scores();
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < scores().length; i++) {
			System.out.println("Scores" + " " + (i + 1) + "= " + a[i]);
			sum = sum + a[i];
			avg = (sum / scores().length);
		}
		System.out.println("Sum of the Scores:" + sum);
		System.out.println("Average of the Scores:" + avg);
	}

	public static int[] scores() {
		int arr[] = { 57, 72, 33, 25, 82 };
		return arr;
	}
}
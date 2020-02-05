import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the sample size: ");
		int size = input.nextInt();

		int[] sample = new int[size];
		int[] sampleOne = new int[size];
		int[] sampleTwo = new int[size];
		int[] sampleThree = new int[size];

		int i = 0;
		int j = 0;
		int total = 0;
		int totalOne = 0;
		int totalTwo = 0;
		int totalThree = 0;
		int avg = 0;
		int avgOne = 0;
		int avgTwo = 0;
		int avgThree = 0;

		System.out.println("Enter numbers for Trial 0");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			sample[i] = input.nextInt();
			total += sample[i];
			avg = total/size;
		}
		System.out.println("\nEnter numbers for Trial 1");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			sampleOne[i] = input.nextInt();
			totalOne += sampleOne[i];
			avgOne = totalOne/size;
		}
		System.out.println("\nEnter numbers for Trial 2");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			sampleTwo[i] = input.nextInt();
			totalTwo += sampleTwo[i];
			avgTwo = totalTwo/size;
		}
		System.out.println("\nEnter numbers for Trial 3");
		for (i = 0; i < size; i++) {
			System.out.print("Enter sample #" + i + ":");
			sampleThree[i] = input.nextInt();
			totalThree += sampleThree[i];
			avgThree = totalThree/size;
		}
		System.out.println("\tSample  #\tTrial  1\tTrial  2\tTrial  3\tTrial  4");
		for (j = 0; j < size; j++){
			System.out.println("\t" + j + "\t\t" + sample[j] + "\t\t" + sampleOne[j] + "\t\t" + sampleTwo[j] + "\t\t" + sampleThree[j] );
		}
		System.out.println("\t------------------------------------------------------");
		System.out.println("Average: " + "\t\t" + avg + "\t\t" + avgOne + "\t\t" + avgTwo + "\t\t" + avgThree);

		int ara[] = { avg, avgOne, avgTwo, avgThree };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int z = 0; z < ara.length; z++){
			if (ara[z] < min){
				min = ara[z];		
			}
			if (ara[z] > max){
				max = ara[z];
			}
		}
		System.out.println("\nMin Average: " + min);
		System.out.println("Max Average: " + max);

		if (min == max) {
			System.out.println("\nThe trials match EXACTLY!");
		}
		else if ((2 * min) > max){
			System.out.println("\nThe trials concur with each other!");
		}
		else {
			System.out.println("\nThe trials do NOT concur!");
		}
	}
}

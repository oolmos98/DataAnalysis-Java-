import java.util.Arrays;
import java.util.Scanner;
public class DataAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the sample size: ");
		int size = in.nextInt();
		int sum=0,sum2=0,sum3=0,sum4=0;
		int[]sampleTrial = new int[size];
		int[]sampleTrialTwo = new int[size];
		int[]sampleTrialThree = new int[size];
		int[]sampleTrialFour = new int[size];
		int[]average=new int[4];

		//Trial 1
		System.out.println("Enter Numbers for Trial 1");
		for(int i=0; i < size; i++){
			System.out.println("Enter sample #" + i + ":  ");
			sampleTrial[i] = in.nextInt();
			sum += sampleTrial[i];
		}
		average[0] = sum/size;

		//Trial 2
		System.out.println("Enter Numbers for Trial 2");
		for(int i=0; i < size; i++){
			System.out.println("Enter sample #" + i + ":  ");
			sampleTrialTwo[i] = in.nextInt();
			sum2 += sampleTrialTwo[i];
		}
		average[1] = sum2/size;

		//Trail 3
		System.out.println("Enter Numbers for Trial 3");
		for(int i=0; i < size; i++){
			System.out.println("Enter sample #" + i + ":  ");
			sampleTrialThree[i] = in.nextInt();
			sum3 += sampleTrialThree[i];
		}
		average[2] = sum3/size;

		//Trial 4
		System.out.println("Enter Numbers for Trial 4");
		for(int i=0; i < size; i++){
			System.out.println("Enter sample #" + i + ":  ");
			sampleTrialFour[i] = in.nextInt();
			sum4 += sampleTrialFour[i];
		}
		average[3] = sum4/size;

		//Table 
		System.out.println("	Sample #	Trial 1 	Trial 2 	Trial 3 	Trial 4");
		for(int i = 0; i < size; ++i){
			System.out.println("	"+i+"		"+sampleTrial[i]+"		"+sampleTrialTwo[i]+"		"+sampleTrialThree[i]+"		"+sampleTrialFour[i]);
		}


		System.out.println("	--------------------------------------------------------------------");

		//Average
		System.out.println("Average:		"+average[0]+"		"+average[1]+"		"+average[2]+"		"+average[3]);
		System.out.println("");

		//Max and Min
		Arrays.sort(average);
		System.out.println("Min Average: " + average[0]);  
		System.out.println("Max Average: " + average[average.length-1]);

		if(average[0] == average[average.length-1])
			System.out.println("The trials match EXACTLY!");

		else if((2*average[0]) > average[average.length-1])
			System.out.println("The trials concur with each other!");

		else
			System.out.println("The trials do not concur!");
		in.close();
	}


}

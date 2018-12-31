import java.util.Scanner;

public class overlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	int arr1[];
	arr1 = new int[4];
	int arr2[];
	arr2 = new int[4];
	
	System.out.println("두 사각형의 좌표를 각각 입력하시오: ");
	
	for(int i=0; i<4 ; i++)
		arr1[i] = scan.nextInt();
	for(int i=0; i<4 ; i++)
		arr2[i] = scan.nextInt();

	if((arr2[0] <= arr1[0]) && (arr1[0] <= arr2[2]))
		System.out.println("Overlap!");
	else if((arr2[0] <= arr1[2]) && (arr1[0] <= arr2[2]))
		System.out.println("Overlap!");
	else if((arr2[1] <= arr1[1]) && (arr1[1] <= arr2[3]))
		System.out.println("Overlap!");
	else if((arr2[1] <= arr1[3]) && (arr1[3] <= arr2[3]))
		System.out.println("Overlap!");
	else 
		System.out.println("No Overlap!");
	
	}

}

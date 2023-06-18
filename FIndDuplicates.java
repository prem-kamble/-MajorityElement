import java.util.*;
class FindDuplicates{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int[]arr = new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter "+(i+1)+"  th Element ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]== arr[j]){
					System.out.print(" "+ arr[i]);
				}
			}
		}
		
	}
}
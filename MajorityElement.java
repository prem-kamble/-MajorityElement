/*

*/
import java.util.*;
class MajorityElement{
    
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() ;
        System.out.println("Array Size "+ size); 
        int elements[]= new int[size];
       for(int i = 0;i<size ; i++){
           System.out.println("Enter "+ (i+1) +"th array Elements");
           elements[i]= sc.nextInt();
       }
       
    int result = findMajorityElement(elements,elements.length);
    System.out.println(result);
   
    }
    public static int findMajorityElement(int[] arr,int n){
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2)
            return arr[index];
        else 
            return -1;
    }
}
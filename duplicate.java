import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in array");
        for (int i=0; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The duplicate number ");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    System.out.println(arr[j] +"At index" + i);
                }
            }

        }

    }
}

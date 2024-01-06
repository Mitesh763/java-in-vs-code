import java.util.Scanner;

public class practice_set_6 {
    public static void main(String[] args) {

        // Question_1 :
        // float [] a={5.6f,4.6f,8.7f,1.6f,4.9f};
        // float sum=0;
        // for (int i = 0; i < a.length; i++) {
        // sum += a[i];
        // }
        // System.out.println("sum is : " + sum);

        // Queestion 2 :
        // int[] arr = { 5, 45, 32, 82 };
        // int a = 45, b = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (a == arr[i]) {
        // b++;
        // }
        // }
        // if (b != 0) {
        // System.out.println("given integer pesent " + b + " times!");
        // }

        // Queestion 3 :
        // float [] a={5.6f,4.6f,8.7f,1.6f,4.9f};
        // float sum=0;
        // for(float element : a)
        // {
        // sum += element;
        // }
        // System.out.println("Average in Physics's mark : " + sum/a.length);


        // Question_4 :
        // int [][] mat1={{1,2,3},
        // {4,5,6}}; 
        // int [][] mat2={{7,8,9},
        // {1,4,7}};

        // int [][] sum={{0,0,0},
        // {0,0,0}};

        // for(int i=0;i<mat1.length;i++){
        // for(int j=0; j<mat1[i].length;j++){
        // sum[i][j] = mat1[i][j] + mat2[i][j];
        // System.out.print(sum[i][j] + " ");
        // }
        // System.out.println("");
        // }

        // Question 5:
        // int[] arr ={1,2,3,4,5,6};
        // int n= Math.floorDiv(arr.length, 2);
        // int temp;
        // for (int i = 0; i < n; i++) {
        //     temp=arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i]=temp;
        // }
        // for (int element : arr) {
            
        //     System.out.print(element + " ");
        // }

        // Question 6: 
            // int[] a ={1,6,54,95,3,7,5,84};
            // int max=0;
            // for (int i : a) {
            //     if (i>max) {
            //         max=i;
            //     }
            // }
            // System.out.println("Maximum number is : " + max);

            // Question 7:
            // int [] arr={4,6,3,5,99,8,9};
            // int min=arr[0];
            // for (int i : arr) {
            //     if (min>i) {
            //         min=i;
            //     }
            // }
            // System.out.println(min);

            // Question 8 :
            Scanner sc=new Scanner(System.in);
            int [] arr={5,6,76,49,12,356,74};
            
            for (int i : arr) {
                System.out.println(i);
            }
            System.out.println("If it is short write false otherwise true");
            String isShort=sc.nextLine();
            if (isShort=="false") {
                System.out.println("array already shorted!");
            }
            else{
                // int min;
                // int max;
                for(int j=0; j<arr.length-1;j++){

                for(int i=0; i<arr.length-1;i++){

                    if(arr[i]>arr[i+1]){
                        int temp;
                        temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }
        }
            for (int ele : arr) {
                System.out.println(ele);
            }
    }
}
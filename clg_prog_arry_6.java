
// OPERATIONS ON 1D ARRAY ::


import java.util.Scanner;

public class clg_prog_arry_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] arr = new int[10];
        // System.out.print("enter size of array :");
        // int n = sc.nextInt();

        int[] arr = new int[5];
        System.out.println("Enter elements in array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean a = true;
        while (a) {
            System.out.println();
            System.out.print(
                    "\n 1) Sorting\n 2) Searching\n 3) Minimumm value\n 4) Maximum value \n 5) Insertion\n 6) Deletion \n 7)Merge two array\n");
            System.out.print("Eneter Your choice :  ");

            int choice1 = sc.nextInt();
            switch (choice1) {

                case 0:
                    exit();
                    break;

                case 1:
                    Sorting(arr);
                    break;

                case 2:
                    Searching(arr);
                    break;

                case 3:
                    Minimum(arr);
                    break;

                case 4:
                    Maximum(arr);
                    break;

                case 5:
                    Insertion(arr);
                    break;

                case 6:
                    Deletion(arr);
                    break;

                case 7:
                    Merge(arr);
                    break;

                default:
                    System.out.println("PLease, Enter Valid number !");
            }
        }
    }

    public static void exit() {

    }

    public static void Sorting(int[] arr) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void Searching(int[] arr) {
        int p = 0;
        int count = 0;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter search element : ");
        int ele = sc1.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                p = i + 1;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not in List !");
        } else {
            System.out.println("Element  " + ele + " founded at position " + p);
        }
    }

    public static void Minimum(int[] arr) {
        int min1 = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                min1 = arr[i + 1];
            }
        }
        System.out.println("Minimum value is : " + min1);
    }

    public static void Maximum(int[] arr) {
        int max1 = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max1 = arr[i + 1];
            }
        }
        System.out.println("Maximum value is : " + max1);
    }

    public static void Insertion(int[] arr) {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter index for insertion operation :  ");
        int index = sc2.nextInt();

        System.out.print("Enter Element which you want to insert  : ");
        int insert_ele = sc2.nextInt();

        int[] arr1 = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (index == i) {
                arr1[j] = insert_ele;
                j++;
            }
            arr1[j] = arr[i];

        }
        for (int are : arr1) {
            System.out.println(" " + are);
        }
    }

    public static void Deletion(int[] arr) {
        Scanner sc2 = new Scanner(System.in);
        int delete_ele = 0;

        System.out.print("Enter index for Dletion operation :  ");
        int index = sc2.nextInt();

        int[] arr1 = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (index == i) {
                delete_ele = arr[j];
                i++;
            }
            arr1[j] = arr[i];

        }
        for (int are : arr1) {
            System.out.println(" " + are);
        }
    }

    public static void Merge(int[] arr) {

        Scanner sc3 = new Scanner(System.in);

        int[] array3 = new int[5];
        System.out.println("Enter element in second array:");
        for (int i = 0; i < (array3.length); i++) {
            array3[i] = sc3.nextInt();
        }

        int[] Merge_res = new int[arr.length + array3.length];

        for (int i = 0; i < arr.length; i++) {
            Merge_res[i] = arr[i];
        }

        for (int i = 0; i < array3.length; i++) {
            Merge_res[arr.length + i] = array3[i];
        }
       
        System.out.println("After Merge two Array : ");
        for (int i : Merge_res) {
            System.out.print("  " + i);
        }
        System.out.println();
    }
    
}
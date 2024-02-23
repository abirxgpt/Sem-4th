//Write a menu driven program to perform the following operations on an array of 10 integer 
//elements 1. Display 2. Searching 3. Sorting 4. Reverse 5. Find maximum




import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display");
            System.out.println("2. Searching");
            System.out.println("3. Sorting");
            System.out.println("4. Reverse");
            System.out.println("5. Find maximum");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayArray(array);
                    break;
                case 2:
                    System.out.print("Enter the element to search: ");
                    int elementToSearch = scanner.nextInt();
                    searchElement(array, elementToSearch);
                    break;
                case 3:
                    sortArray(array);
                    break;
                case 4:
                    reverseArray(array);
                    break;
                case 5:
                    findMaximum(array);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
    
    public static void displayArray(int[] arr) {
        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array sorted successfully.");
    }
    
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Array reversed successfully.");
    }
    
    public static void findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}

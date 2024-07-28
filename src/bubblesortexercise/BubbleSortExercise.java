/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesortexercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Thabo Setsubi ST10445734 thabosetsubi3@gmail.com
 */
public class BubbleSortExercise {

    
    public static void main(String[] args) 
    {
        int nums[] = {};
        System.out.println("Enter how many numbers you want to enter into the array: ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        
        nums = insertList(nums, userInput);
        
        int n = nums.length;
        bubbleSortAsc(nums, n);
        bubbleSortDesc(nums, n);
    }
    
    static int[] insertList(int nums[], int n)
    {
        System.out.println("Enter " + n + " number into the array: ");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i < n)
        {
            int num = scan.nextInt();
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[i] = num;
            
            i++;
        }
        return nums;
    }
    
    static void bubbleSortAsc(int nums[], int n)
    {
        
        int temp;
        boolean swapped;
        for(int i = 0; i < n; i++)
        {
            swapped = false;
            for(int j = 0; j < n-1; j++) 
            {
                if(nums[j] > nums[j +1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped = false) 
            {
                break;
            }
        }
        System.out.println("In Ascending Order: ");
        printList(nums, n);
    }
    
    static void bubbleSortDesc(int nums[], int n)
    {
        int temp;
        boolean swapped;
        for(int i = 0; i < n; i++)
        {
            swapped = false;
            for(int j = 0; j < n-1; j++) 
            {
                if(nums[j] < nums[j +1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped = false) 
            {
                break;
            }
        }
        System.out.println("In Descending Order: ");
        printList(nums, n);
    }
    
    static void printList(int nums[], int size)
    {
        for(int i=0; i < size; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    //--------------------------- End Of File --------------------------------//
}

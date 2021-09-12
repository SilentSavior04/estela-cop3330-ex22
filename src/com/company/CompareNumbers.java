package com.company;
import java.util.Scanner;

public class CompareNumbers {
    public static boolean contain(int[] nums, int x) {
        for (int n : nums)
            if (n == x)
                return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[100];
        int count = 0;
        int largest = 0;

        while (true) {
            System.out.print("Enter a number (-5 to stop):");
            int x = sc.nextInt();
            if (x==-5)
                break;
            if (contain(nums, x)) {
                System.out.println("Number already entered. Please Enter a different number: ");
                continue;
            }
            nums[count++] = x;
            largest = Math.max(x, largest);

        }
        System.out.println("The largest number is " +largest);
        sc.close();

    }
}

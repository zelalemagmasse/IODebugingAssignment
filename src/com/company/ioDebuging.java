package com.company;
import java.util.Scanner;
public class ioDebuging {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard= new Scanner(System.in);
        double num1,num2,num3;

        System.out.print("First intege");
        num1=keyboard.nextInt();

        System.out.print("Second intege");
        num2=keyboard.nextInt();

        System.out.print("First intege");
        num3=keyboard.nextInt();
        System.out.println("The total is :" + (num1 + num2 + num3));
    }

}

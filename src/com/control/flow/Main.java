package com.control.flow;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Easy
        int k = 80;

        for(int i=0;i<5;i++){
            k=k-12;
        }
        System.out.println(k);

        //C.20




        //Medium
        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println("Now Reverse!");

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

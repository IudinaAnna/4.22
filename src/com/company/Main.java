package com.company;
import java.sql.Array;
import java.time.Year;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array = new int[10];
        System.out.println("N" + "\t" + "10*N"+"\t"+"100*N"+"\t"+"1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.println((i)+"\t"+10*i+"\t\t"+100*i+"\t\t"+1000*i);
        }
    }
}

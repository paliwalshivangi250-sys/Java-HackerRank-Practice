// Problem: Java Stdin and Stdout II
// Platform: HackerRank
// Concepts Used: Scanner, nextLine(), input buffer handling

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    Double f= sc.nextDouble();
    sc.nextLine();
    String s = sc.nextLine();
    
    System.out.println("String:"+" "+ s);
     System.out.println("Double:"+" "+ f);
      System.out.println("Int:"+" "+ n);
    
    
}}

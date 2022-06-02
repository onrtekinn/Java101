package com.otekin;
import java.util.Scanner;

public class ProblemSolving {
    public void main(String[] args) {
        IsWeird();
    }

    public void Scanners() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + i);
    }

    public void Loops() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public void MultiplicationTable() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
    public  void reverseString(){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
    public void IsWeird(){
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n=sc.nextInt();
        //Scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans="";

       //scanner.close();

        if(n%2 == 1 || n>= 6 && n<=20){
            ans= "Weird";
        }
        else if (n%2 == 0 || n >= 2 && n <= 5){
            ans = "Not Weird";
        }
        else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
    }

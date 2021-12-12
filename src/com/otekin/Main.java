package com.otekin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Notes();
    }
    public static void TryScanner(){
        Scanner input =new Scanner(System.in);

        System.out.println("Set to number A");
        int a=input.nextInt();

        System.out.println("Set to number B");
        int b = input.nextInt();
        int summary = a+b;
        System.out.println ("summary :"+summary);
    }
    public static void Notes(){
        int Maths,Chemical,Physics,Music,History,Literature;
        Scanner input=new Scanner(System.in);
        System.out.println("Add to Maths note");
        Maths = input.nextInt();
        System.out.println("Add to Chemical note");
        Chemical = input.nextInt();
        System.out.println("Add to Pyhsics note");
        Physics = input.nextInt();
        System.out.println("Add to Music note");
        Music = input.nextInt();
        System.out.println("Add to History note");
        History = input.nextInt();
        System.out.println("Add to Litarature note");
        Literature = input.nextInt();

        double avg =(Maths+Chemical+Physics+Music+History+Literature)/6;
        System.out.println(avg);


    }
}

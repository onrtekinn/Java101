package com.otekin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TryScanner();
        //Notes();
        //loops();
        //PasswordManager();
        Arrays();
    }

    public static void TryScanner() {
        Scanner input = new Scanner(System.in);

        System.out.println("Set to number A");
        int a = input.nextInt();

        System.out.println("Set to number B");
        int b = input.nextInt();
        int summary = a + b;
        System.out.println("summary :" + summary);
    }

    public static void Notes() {
        int Maths, Chemical, Physics, Music, History, Literature;
        Scanner input = new Scanner(System.in);
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

        double avg = (Maths + Chemical + Physics + Music + History + Literature) / 6;
        System.out.println(avg);
        System.out.println(avg <= 60 ? "Geçti" : "Kaldı");
    }

    public void PasswordManager() {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }
    }
    public void loops(){int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }}
    public static void Arrays(){
        Scanner scanner=new Scanner(System.in);

        int[][] matris=new int[4][3];


        System.out.println("matrisin satır sayısi : "+matris.length);  // matrisin satır sayısını
        System.out.println("matrisin sutun sayisi : "+matris[0].length); // matrisin sutun sayısını

        for(int i=0; i<matris.length;i++){

            for(int j=0; j<matris[0].length;j++){


                System.out.printf("Matris için değer girin => [%d][%d] = \n",i,j);
                matris[i][j]=scanner.nextInt();



            }

            System.out.printf("********************* %d . satır tamanlandı ************************\n",i);


        }
        System.out.println("********************* MATRİS BİLGİ GİRİŞİ TAMAM ***********************");
        System.out.println(" Matris ekrana yazdırılıyor....");


        // matris.length satır sayısını , matris[0].length ise sutun sayısını verir.
        for (int i=0;i<matris.length;i++){


            for(int j=0; j<matris[0].length;j++){

                System.out.printf("[%d][%d]=%d\n",i,j,matris[i][j]);

            }
            System.out.println("-----");
        }

        /*
        int[] empId = new int[5];
        int len = empId.length;
        for(int i=0;i<=len;i++){
        //String[] Personal = {new String("Onur")};
        System.out.println(Personal[0]);
        }*/
    }
}
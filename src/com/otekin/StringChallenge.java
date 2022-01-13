package com.otekin;
import java.util.*;
import java.io.*;

public class StringChallenge {

        public static int CountWords(String str) {
            // code goes here
            int wordCount=0;
            boolean IsBlankSet=false;
            str=str.trim();
            //int endOfLine=str.length()-1;

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    IsBlankSet=true;
                }
                else if(IsBlankSet){
                    wordCount++;
                    IsBlankSet=false;
                }
      /*if(Character.isLetter(str.charAt(i))&& i!=endOfLine){
        word=true;
      }
      else if(Character.isLetter(str.charAt(i)) && word){
        wordCount++;
        word=false;
      }
      else if(Character.isLetter(str.charAt(i)) && i==endOfLine){
        wordCount++;
      }
    }*/

            }return wordCount +1;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(CountWords(s.nextLine()));
        }
    }


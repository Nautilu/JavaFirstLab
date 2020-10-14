package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите команды ");
        String S = console.nextLine();
        int countx = 0;
        int county = 0;
        char currentcommand;
        for (int i = 0; i < S.length(); i++) {
            currentcommand = S.charAt(i);
            if (currentcommand == 'U') {
                county++;
            } else {
                if (currentcommand == 'D') {
                    county--;
                } else {
                    if (currentcommand == 'R') {
                        countx++;
                    } else {
                        countx--;
                    }
                }
            }
        }
        if (countx==0 && county==0){
            System.out.print("Робот вернется в исходную точку");
        }
        else{
            System.out.print("Робот не вернется в исходную точку");
        }
    }

}
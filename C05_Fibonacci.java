package day24_OdevArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Fibonacci {
    public static void main(String[] args) {
        //verilen bir sayidan kucuk tum Fibonacci sayilari bir liste olarak olusturup yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        int sayi=scanner.nextInt();
        int sayi1=0;
        int sayi2=1;
        int sayi3;

        List<Integer>list=new ArrayList<Integer>();
        list.add(sayi1);
        list.add(sayi2);
        for(int i=0; i<sayi; i++) {

            sayi3=sayi1+sayi2;
            list.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;

        }
        System.out.println(list);
    }
}

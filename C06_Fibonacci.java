package day24_OdevArrayList;

import java.util.ArrayList;

public class C06_Fibonacci {
    public static void main(String[] args) {
        //1'den baslayarak istenen sayiya kadar Fibonacci sayisini bir liste olarak olusturup yazdirin
        int input=10;
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        ArrayList<Integer> liste=new ArrayList<Integer>();
        liste.add(sayi1);
        liste.add(sayi2);
        for (int i = 1; i <=input ; i++) {
            sayi3=sayi1+sayi2;
            liste.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;

        }
        System.out.println(liste);
    }
}

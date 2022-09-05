package day24_OdevArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04_ArrayHarfIcerenKelimeSil {
    public static void main(String[] args) {
        //verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        //kalan elementleri yeni bir array yapin
        Scanner scanner = new Scanner(System.in);
        System.out.println("istenmeyen harfi girin");
        String harf= scanner.nextLine();
        String[]sehirler={"Adana","Edirne","Samsun","Diyarbakir","Malatya","Mersin"};

        List<String>kalanlar=new ArrayList<String>();
        for (int i = 0; i < sehirler.length ; i++) {
            if(!(sehirler[i].contains(harf))){
                kalanlar.add(sehirler[i]);
            }

        }String yeniSehirler[]=new String[kalanlar.size()];
        for (int i = 0; i < kalanlar.size() ; i++) {

          yeniSehirler[i] = kalanlar.get(i);

        } sehirler=yeniSehirler;
        System.out.println("sehirler = " + Arrays.toString(sehirler));
    }
}

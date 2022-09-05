package day24_OdevArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_UniqueElementler {
    public static void main(String[] args) {
        //verilen bir array'deki  elementleri unique olarak yeni bir array olarak
        // donduren bir method olusturun
        int[] sayilar = {3, 6, 4, 6, 3, 8, 9, 4, 3, 20, 5, 1, 8};

       Integer[]sayilar1 =yeniArray((sayilar));
        System.out.println("sayilar1 = " + Arrays.toString(sayilar1));


    }

    private static Integer[] yeniArray(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("sayilar = " + Arrays.toString(sayilar));
        List<Integer> tekrarEdenSayilar = new ArrayList<Integer>();

        for (int i = 0; i < sayilar.length-1 ; i++) {
            if(sayilar[i]!=sayilar[i+1]){
                tekrarEdenSayilar.add(sayilar[i]);
            }
            if(!tekrarEdenSayilar.contains(sayilar[sayilar.length-1])){
            tekrarEdenSayilar.add(sayilar[sayilar.length-1]);
            }
        }
        Integer sayilar1[]=tekrarEdenSayilar.toArray(new Integer[0]);
        Arrays.sort(sayilar1);



         return sayilar1;

        }

}
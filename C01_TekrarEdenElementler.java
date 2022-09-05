package day24_OdevArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenElementler {
    public static void main(String[] args) {
        //Verilen bir arraydeki tekrar eden elementleri yazdirin
        String urunListesi[]={"biskrem","hobby","nutella","cay","kahve","hobby","nutella"
                ,"kahve","ikram","ikram"};
        List<String>tekrarEdenAburCubur=new ArrayList<>();
        Arrays.sort(urunListesi);
        System.out.println("aburCubur = " + Arrays.toString(urunListesi));
        for (int i = 0; i <urunListesi.length-1 ; i++) {
           if(urunListesi[i]==urunListesi[i+1]&&!tekrarEdenAburCubur.contains(urunListesi[i])){
               tekrarEdenAburCubur.add(urunListesi[i]);
           }


            }
        System.out.println("tekrar Eden AburCubur = " + tekrarEdenAburCubur);

        
        int[]sayilar={3,6,4,6,3,8,9,4,3,20,5,1,8};
        Arrays.sort(sayilar);
        System.out.println("sayilar = " + Arrays.toString(sayilar));
        List<Integer> tekrarEdenSayilar=new ArrayList<Integer>();
        for (int i = 0; i <sayilar.length-1 ; i++) {
            if((sayilar[i]==sayilar[i+1])&&!tekrarEdenSayilar.contains(sayilar[i])){
                tekrarEdenSayilar.add(sayilar[i]);
            }
            
        }
        System.out.println("tekrarEdenSayilar = " + tekrarEdenSayilar);

    }

        }

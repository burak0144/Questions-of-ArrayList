package day24_OdevArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ListQyaBasincaCik {
    public static void main(String[] args) {
        //kullanici Q'ya basincaya kadar girecegi isimleri alarak bir liste olusturup,bu isimleri bir list 
        //olarak bize donduren bir method olusturun
        List<String> isimListesi= listOlusturma();
        System.out.println("isimListesi = " + isimListesi);
    }

    public static List<String> listOlusturma() {
        Scanner scanner = new Scanner(System.in);

        String liste="";
        List<String> list = new ArrayList<>();

       boolean ciksinMi=false;

        while (!ciksinMi) {

           if (!liste.equalsIgnoreCase("Q")) {

               System.out.println("lutfen listeye isim giriniz");
               liste = scanner.nextLine();
              if(!liste.equalsIgnoreCase("Q")) {
               list.add(liste);
              }


            }
            else{
                System.out.println("ekleme iptal edildi");
                ciksinMi = true;

            }
        }
        return list;
    }
}

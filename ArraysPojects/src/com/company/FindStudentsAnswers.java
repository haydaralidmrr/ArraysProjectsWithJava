package com.company;

import java.util.Scanner;

public class FindStudentsAnswers {
    public static void main(String[] args) {


        Scanner tara = new Scanner(System.in);
        System.out.println("Toplam Ogrenci sayisini giriniz");
        int ogrenciSayisi=tara.nextInt();
        System.out.println("Toplam soru sayisini giriniz");
        int soruSayisi=tara.nextInt();

        char tumCevaplar[][] = new char[ogrenciSayisi][soruSayisi];
        char cevapAnahtari[]= new char[soruSayisi];

        cevapAnahtariOlustur(cevapAnahtari);
        ogrenciCevaplariniYerlestir(tumCevaplar);
        ogrenciCevaplariniGoster(tumCevaplar);
        cevapAnahtariniGoster(cevapAnahtari);
        ogrencileriDegerlendir(tumCevaplar,cevapAnahtari);
    }

    private static void cevapAnahtariniGoster(char[] cevapAnahtari) {
        for (int i=0;i<cevapAnahtari.length;i++) {
            System.out.print(cevapAnahtari[i]+",");
        }
        System.out.println();
    }

    private static void ogrenciCevaplariniGoster(char[][] tumCevaplar) {
        for (int satir=0;satir<tumCevaplar.length;satir++) {
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++) {
                System.out.print(tumCevaplar[satir][sutun]+",");
            }
            System.out.println();
        }
    }

    private static void ogrencileriDegerlendir(char[][] tumCevaplar, char[] cevapAnahtari) {
        for (int satir=0;satir<tumCevaplar.length;satir++) {
            int dogruSayisi=0;
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++) {
                if (tumCevaplar[satir][sutun]==cevapAnahtari[sutun]) {
                    dogruSayisi++;
                }
            }
            System.out.println(satir+".indexteki ogrencinin dogru sayisi = " +dogruSayisi);
        }


    }

    private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
        for (int i=0;i<cevapAnahtari.length;i++) {
            cevapAnahtari[i]=cevapOlustur();
        }
    }

    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
        for (int satir=0;satir<tumCevaplar.length;satir++) {
            for (int sutun=0;sutun<tumCevaplar[satir].length;sutun++) {
                tumCevaplar[satir][sutun]=cevapOlustur();
            }
        }
    }


    public static char cevapOlustur() {
        int rastgeleSayi=65+ (int)(Math.random()*5); //65=A 66=B 67=C 68=D 69=E
        char cevap=(char) rastgeleSayi;
        return cevap;
    }
}
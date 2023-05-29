package com.company;

public class KarmaAndSelection {
    public static void main(String[] args) {
        int dizi[]={2,6,32,9,4,1,-44,45};
        System.out.println("Dizinin yeri degismeden onceki hali");
        diziGoster(dizi);
        System.out.println("\n");
        diziYerDegis(dizi);
        System.out.println("Dizinin yer degistikten sonraki hali");
        diziGoster(dizi);
        System.out.println("\n");
        selectionSort(dizi);
        diziGoster(dizi);
        int sonuc=binarSearch(dizi,9);
        System.out.println("Sonuc="+sonuc);

    }

    private static int binarSearch(int[] dizi, int aranacakelaman) {
        int minIndex=0;
        int maxIndex=dizi.length-1;

        while (maxIndex>=minIndex) {
            int middleIndex=(maxIndex+minIndex)/2;
            if(aranacakelaman<dizi[middleIndex]) {
                maxIndex=middleIndex-1;
            }
            else if(aranacakelaman==dizi[middleIndex]) {
                return middleIndex;
            }
            else {
                minIndex=middleIndex+1;
            }
        }
        return -minIndex-1;

    }

    private static void selectionSort(int[] dizi) {
        for (int i=0;i<dizi.length-1;i++) {
            int min=dizi[i];
            int minIndex=i;

            for (int j=i+1;j<dizi.length;j++) {
                if (min>dizi[j]) {
                    min=dizi[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i) {
                dizi[minIndex]=dizi[i];
                dizi[i]=min;
            }
        }
    }

    private static void diziYerDegis(int[] dizi) {
        for (int i=dizi.length-1;i>0;i--) {
            int randomNumber=(int)(Math.random()*(i+1));
            int temp=dizi[i];
            dizi[i]=dizi[randomNumber];
            dizi[randomNumber]=temp;


        }

    }

    private static void diziGoster(int[] dizi) {
        for (int a:dizi) {
            System.out.print(a+",");
        }
    }
}

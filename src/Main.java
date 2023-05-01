import java.util.Scanner;
public class Main {
    static int asalSayi(int num,int sinir) {
        if (num < 2) {
            return 0;
        }
        else if (sinir == 1) { // sinir değeri 1'e gelene kadar hiçbir sayıya bölünmediği anlamına gelir. Sadece 1 e bölünüyorsa asaldır.
            return 1;
        }
        else if (num % sinir == 0) {
            return 0;
        }
        else return asalSayi( num, sinir-1);
    }
    public static void main(String[] args) {
        int sayi;
        Scanner inp= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        sayi=inp.nextInt();
        if (asalSayi(sayi,sayi/2)==0){
            System.out.println("Sayı asal değildir.");
        }
        else if(asalSayi(sayi,sayi/2)==1){
            System.out.println("Sayı asaldır");
        }
    }
}
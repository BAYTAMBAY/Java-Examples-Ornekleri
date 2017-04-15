package javaapplication139;

import java.util.Scanner;

public class JavaApplication139 {

    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);

        boolean devam = true;
        int b = 0;

        if (devam) {
            System.out.println("Türkiyenin başkenti neresidir");

            System.out.println("a) Ankara ");
            System.out.println("b) İstanbul");
            System.out.println("c) K.maraş");
            System.out.println("d) Kayseri");

            Thread.sleep(3 * 1000);
            System.out.println("Cevap şıkkını yazınız");
            String cevap = klavye.nextLine();
            if (cevap.equals("a")) {
                System.out.println("Tebrikler 1. soru tamam");

            } else if (cevap.equals("1") && b == 0) {
                System.out.println("2 Şık eleniyor");
                System.out.println("a) Ankara ");
                System.out.println("b) İstanbul");
                System.out.println("Cevap şıkkını yazınız");
                b++;

                String sonuç = klavye.nextLine();
                if (sonuç.equals("a")) {
                    System.out.println("Tebrikler 1. soru tamam");
                } else if (sonuç.equals("b")) {
                    System.out.println("Malesef Elendiniz");
                    devam = false;

                }

            } else {
                System.out.println("Malesef Elendiniz");
                devam = false;

            }
        }
//        1. bölüm

        if (devam) {
            System.out.println("En asi şehrimiz");
            System.out.println("a) Konya ");
            System.out.println("b) Adana");
            System.out.println("c) İzmir");
            System.out.println("d) Erzurum");
            Thread.sleep(3 * 1000);
            System.out.println("Cevap şıkkını yazınız");
            String cevap = klavye.nextLine();
            if (cevap.equals("b")) {
                System.out.println("Tebrikler 2. soruda tamam");

            }
            if (cevap.equals("1") && b == 0) {
                System.out.println("2 Şık eleniyor");
                System.out.println("b) Adana");
                System.out.println("d) Erzurum");
                System.out.println("Cevap şıkkını yazınız");
                b++;

                String sonuç = klavye.nextLine();
                if (sonuç.equals("b")) {
                    System.out.println("Tebrikler 2. soru tamam");
                } else if (sonuç.equals("d")) {
                    System.out.println("Malesef Elendiniz");
                    devam = false;

                }

            }
        } else {
            System.out.println("Malesef Elendiniz");
            devam = false;
        }
//        2.bölüm
        if (devam) {
            System.out.println("Kangalı ile ünlü şehrimiz");
            System.out.println("a) Konya ");
            System.out.println("b) Adana");
            System.out.println("c) Sivas");
            System.out.println("d) Bursa");
            Thread.sleep(3 * 1000);
            System.out.println("Cevap şıkkını yazınız");
            String cevap = klavye.nextLine();
            if (cevap.equals("c")) {
                System.out.println("Tebrikler 3. soruda tamam");

            }
            if (cevap.equals("1") && b == 0) {
                System.out.println("2 Şık eleniyor");
                System.out.println("a) Konya ");
                System.out.println("c) Sivas");
                System.out.println("Cevap şıkkını yazınız");
                b++;
                String sonuç = klavye.nextLine();
                if (sonuç.equals("c")) {
                    System.out.println("Tebrikler 3. soru tamam");
                } else if (sonuç.equals("a")) {
                    System.out.println("Malesef Elendiniz");
                    devam = false;

                }

            }
        } else {
            System.out.println("Malesef Elendiniz");
            devam = false;
        }
//        3.bölüm
        if (devam) {
            System.out.println("Karpuzun ile ünlü şehrimiz şehrimiz");
            System.out.println("a) Konya ");
            System.out.println("b) Adana");
            System.out.println("c) K.Maraş");
            System.out.println("d) Diyarbakır");
            Thread.sleep(3 * 1000);
            System.out.println("Cevap şıkkını yazınız");
            String cevap = klavye.nextLine();
            if (cevap.equals("d")) {
                System.out.println("Tebrikler 4 Tl kazandınız ");

            }
            if (cevap.equals("1") && b == 0) {
                System.out.println("2 Şık eleniyor");
                System.out.println("c) K.Maraş");
                System.out.println("d) Diyarbakır");
                System.out.println("Cevap şıkkını yazınız");
                b++;

                String sonuç = klavye.nextLine();
                if (sonuç.equals("d")) {
                    System.out.println("Tebrikler 4 Tl kazandınız");
                } else if (sonuç.equals("c")) {
                    System.out.println("Malesef Elendiniz");
                    devam = false;

                }

            }
        } else {
            System.out.println("Malesef Elendiniz");
            devam = false;
        }

    }

}

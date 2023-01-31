package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int choice;
        int price;


        while (right > 0) {
            System.out.print("Kullanıcı Adı : ");
            userName = inp.next();

            System.out.print("Parola : ");
            password = inp.next();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Java 101 Bankasına Hoşgeldiniz !");
                do {
                    System.out.print("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap\n" +
                            "Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    choice = inp.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price = inp.nextInt();
                            balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
                            break;
                    }
                }
                while (choice != 4);
                break;
            } else {
                right--;
                if (right != 0) {
                    System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız : " + right);
                } else if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankamızla iletişime geçiniz.");
                }
            }
        }
    }
}

package tugasjobsheet9;

import java.util.Scanner;

public class KafeSearch09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        int ketemu = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu \"" +menu[i] +"\" tersedia di kafe");
                ketemu = 1; 
                break;
            }
            }
            if (ketemu == 0) {
                System.out.println("Maaf, menu \"" +cari +"\" tidak tersedia di kafe");
            
        }
    }
}

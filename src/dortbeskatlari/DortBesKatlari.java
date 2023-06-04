package dortbeskatlari;

import java.util.Scanner;

public class DortBesKatlari {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("4 ve 5'in Katlarını Bulma Programına Hoşgeldiniz...");
        
        System.out.print("Lütfen Kaçıncı Sayıya Kadar Bulmak İstediğinizi Girin : ");
        int sayi = scanner.nextInt();
        
        for(int i=0 ;i<=sayi;i++){
            
            if(i % 4 == 0 || i % 5 == 0){
                System.out.println(i);
            }     
        }
        
    }
    
}

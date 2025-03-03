/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciklusok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author János
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // For ciklus - számláló ciklus
        // for (inicializálás; feltétel; léptetés) { ciklusmag }
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        
        // Értékadó operátorok
        // x = x + 2    x += 2
        // x = x - 2    x -= 2
        // x = x * 2    x *= 2
        // x = x / 2    x /= 2
        // x = x % 2    x %= 2
        
        // Inkrementálás
        // Postfix
        // x++ --> x += 1 --> eggyel növeli az értéket
        // pl. 3++ - lefut - 4
        // Prefix
        // ++x --> eggyel növeli az értéket
        // ++3 - 4 lefut - előbb növeli az értéket
        
        // Dekrementálás
        // Postfix
        // x-- --> x -= 1 --> eggyel csökken az érték
        // Postfix ...
        
        // Lista feltöltése
        List<String> nevek = new ArrayList<>();
        nevek.add("Béla"); // 0. index
        nevek.add("Lajos"); // 1. index
        nevek.add("Kevin"); // 2. index
        nevek.add("Minea"); // 3. index
        // nevek.size() - 4 elemű lista
        //System.out.println(nevek.get(0));
        for(int i = 0; i < nevek.size(); i++){
            System.out.println(nevek.get(i));
        }
        
        // Hatványozás: 2 5.hatványáig irassuk ki
        int ketto = 2;
        for(int i = 0; i <= 5; i++){
            if(i == 0){
                System.out.println("0. hatvány = 1");
            }
            else{
                System.out.printf("%d. hatvány = %d\n", i, ketto);
                ketto = ketto * 2;
            }
        }
        
        // Írjuk ki a számokat 5-től 1-ig csökkenő sorrendben
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }
        
        // 1-10ig páratlan számok
        for(int i = 1; i < 11; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        // léptetés kettesével
        for(int i = 1; i < 11; i+=2){
            System.out.println(i);
        }
        
        // Foreach - csakis gyűjtemények bejárásra alkalmas (tömb, lista, stb.)
        // nem rendelkezik indexekkel, konkrét értékekkel dolgozik
        List<String> gyumolcsok = List.of("Alma", "Körte", "Ananász");
        // for (típus elem : gyűjtemény) { ciklusmag }
        for(String gyumolcs : gyumolcsok){
            System.out.println(gyumolcs);
        }
        
        // While ciklus - elöltesztelő
        // Ameddig, amíg a feltétel igaz
        // while(feltétel) { ciklusmag }
        // ismétlések számát általában nem tudjuk
        
        int szam = 1;
        while(szam <= 10){
            System.out.println(szam);
            szam++; // érték növelése
        }
        
        int a = 0;
        // while(true) - végtelen ciklus
        while(true){
            System.out.println("Beragadtam!");
            a++;
            if(a == 5){
                break; // megtöri a ciklust
            }
        }
        
        // Addig kérjünk be számokat, amíg nem 0 a megadott szám
        System.out.println("Kérek egy számot: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // szám bekérése
        while(num != 0){
            System.out.println("Kérek egy számot (0-t a kilépéshez):");
            num = sc.nextInt();
        }
        
        // Do-While - hátultesztelő
        // a ciklusmag egyszer mindenképp lefut és utána ellenőrzi a feltételt
        /*
        do{
            ciklusmag
        }while(feltétel);
        */
        // Előző feladat minta
        int num2;
        do{
            System.out.println("Kérek egy számot (0-t a kilépéshez):");
            num2 = sc.nextInt();
        }while(num2 != 0);
        
        // While - nem biztos igaz a feltétel az elején
        // DoWhile - egyszer mindenképp lefut, ha igaz ha nem a feltétel
        
        // Programozási tételek
        List<Integer> szamok = List.of(1,5,10,3,10,25,-5);
        
        // 1. Összegzés tétel - SZUMMA
        int osszeg = 0;
        for(int i = 0; i < szamok.size(); i++){
            osszeg = osszeg + szamok.get(i);
            // osszeg += szamok.get(i);
            // első három iteráció:
            // 0 = 0 + 1; --> 1
            // 1 = 1 + 5; --> 6
            // 6 = 6 + 10; --> 16 
        }
        System.out.println("Összeg: " + osszeg);
        
        // 2. Megszámlálás tétele - keressük hány db 10-es szám van
        int db = 0;
        for(int i = 0; i < szamok.size(); i++){
            // Ha a vizsgált elem a listából 10
            if(szamok.get(i) == 10){
                db++; // növelem a darab értékét
            }
        }
        System.out.println("10-es darabszáma: " + db);
        
        // Minimum keresés
        int min = szamok.get(0); // Első elemet megadom neki
        for(int i = 0; i < szamok.size(); i++){
            // Ha a minimum nagyobb, mint a vizsgált elem
            if(min > szamok.get(i)){
                min = szamok.get(i); // új értéket kap
            }
        }
        System.out.println("Minimum: " + min);
        
        // Maximum keresés
        int max = szamok.get(0); // Feltételezünk egy értéket
        for(int i = 0; i < szamok.size(); i++){
            // Ha a maximum kisebb, mint a vizsgált elem
            if(max < szamok.get(i)){
                max = szamok.get(i); // új értéket kap
            }
        }
        System.out.println("Maximum: " + max);
    }
    
}

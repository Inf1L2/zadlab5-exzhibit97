package pl.edu.ur.oopl5.zad3;
import java.util.*;

public class Zad3 {
    public static void main(String[] args) {

        int menu = 0, menuGlowne = 1, n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilu elementowy stos chcesz utworzyc");
        n = scan.nextInt();
        Stos stos = new Stos(n);
        while(menuGlowne != 0){
            System.out.println("1. Dodanie elementu");
            System.out.println("2. Zrzucenie elementu");
            System.out.println("3. Rozmiar stosu");
            System.out.println("4. Elementy stosu");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    int nowyElemenent;
                    System.out.println("Dodanie elementu do stosu:");
                    nowyElemenent = scan.nextInt();
                    stos.push(nowyElemenent);
                    System.out.println(stos.getWskaznik());
                    break;
                case 2:
                    System.out.println("Zrzucenie elementow ze stosu");
                    stos.pop();
                    break;
                case 3:
                    stos.rozmiarStosu();
                    break;
                case 4:
                    stos.wypiszStos();
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }

        }
    }
}

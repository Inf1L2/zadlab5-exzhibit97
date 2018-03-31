package pl.edu.ur.oopl5.zad5;
import java.util.*;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;

    public Pracownik() {}

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public String getStanowisko() {
        return stanowisko;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void wyswietlDane() {
        System.out.println("Imie:" + getImie() + " Nazwisko:" + getNazwisko() + " Wiek:" + getWiek() + " Stanowisko:" + getStanowisko());
    }
    public void wprowadzDane(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie:");
        setImie(input.nextLine());
        System.out.println("Podaj nazwisko:");
        setNazwisko(input.nextLine());
        System.out.println("Podaj stanowisko:");
        setStanowisko(input.nextLine());
        System.out.println("Podaj wiek:");
        setWiek(input.nextInt());


    }

}

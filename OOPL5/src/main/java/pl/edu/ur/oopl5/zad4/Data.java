package pl.edu.ur.oopl5.zad4;

import java.util.Calendar;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;

    public Data(){}

    public Data(int dzien, int miesiac, int rok){
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public int getDzien() {
        return dzien;
    }
    public int getMiesiac() {
        return miesiac;
    }
    public int getRok() {
        return rok;
    }
    public void setDzien(int dzien) {
        this.dzien = dzien;
    }
    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }
    public void setRok(int rok) {
        this.rok = rok;
    }
    //ustawia date na aktualna prawdziwa date i wyswietla ja
    public void ustawDate() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
    }
    public void dataPrzod(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println(cal.getTime());
    }
    public void dataTyl(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -7);
        System.out.println(cal.getTime());
    }

}

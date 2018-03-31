package pl.edu.ur.oopl5.zad3;


public class Stos {

    private int wskaznik;
    private int[] tab;

    public Stos(int Rozmiar) {
        tab = new int[Rozmiar];
        wskaznik = 0;
    }

    public int getWskaznik() {
        return wskaznik;
    }

    public void push(int liczba) throws ArrayIndexOutOfBoundsException{
        if (wskaznik < tab.length) {
            tab[wskaznik] = liczba;
            wskaznik++;
        } else throw new ArrayIndexOutOfBoundsException(
                "Przepelnienie stosu, operacja nie powiodla sie");
    }
    public void pop() throws IndexOutOfBoundsException{
        if (wskaznik == 0){
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodla sie");
        }
        int temp = wskaznik - 1;
        for (int i = temp; i> -1; i--){
            System.out.println(tab[temp]);
            temp--;
        }
    }
    public void wypiszStos(){
        int i = 0;
        for (i = 0; i<tab.length; i++)
            System.out.println(tab[i]);
    }
    public void rozmiarStosu(){
        System.out.println(wskaznik);
    }
}

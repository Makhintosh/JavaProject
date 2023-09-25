public class Ludz {
    private String imie;
    private String nazwisko;
    private int wiek;
    private Adres adres;

    public Ludz(String imie, String nazwisko, int wiek, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
    }

    public String getCaleImie() {
        return imie + " " + nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}

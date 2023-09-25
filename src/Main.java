class Adres {
    private String ulica;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public String getUlica(){
        return ulica;
    }
    public void setUlica(String ulica){
        this.ulica = ulica;
    }

    public String getMiasto(){
        return miasto;
    }
    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKodPocztowy(){
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
}
class Ludz {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String adres;

    public Ludz(String imie, String nazwisko, int wiek, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
    }
    public String getCaleImie(){
        return imie + " " + nazwisko;
    }

    public int getWiek(){
        return wiek;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    
}
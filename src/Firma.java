public class Firma {
    private String nazwaFirmy;

    private String przemysl;

    private Adres siedziba;

    public Firma(String nazwaFirmy, String przemysl, Adres siedziba) {
        this.nazwaFirmy = nazwaFirmy;
        this.przemysl = przemysl;
        this.siedziba = siedziba;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getPrzemysl() {
        return przemysl;
    }

    public void setPrzemysl(String przemysl) {
        this.przemysl = przemysl;
    }

    public Adres getSiedziba() {
        return siedziba;
    }

    public void setSiedziba(Adres siedziba) {
        this.siedziba = siedziba;
    }
}

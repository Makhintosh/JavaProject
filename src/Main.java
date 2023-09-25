public class Main {
    public static void main(String[] args) {
        Adres adres1 = new Adres("123 cos tam", "Miasto 1", "12-100");
        Adres adres2 = new Adres("123 cos tam", "Miasto 2", "12-101");
        Adres adres3 = new Adres("123 cos tam", "Miasto 3", "12-102");

        Ludz ludz1 = new Ludz("Igor", "Szatkowski", 18, adres1);
        Ludz ludz2 = new Ludz("Kacper", "Psikuta", 19, adres2);
        Ludz ludz3 = new Ludz("Patryk", "Malomam", 21, adres3);
    }
}
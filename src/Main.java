import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Kosumsi> listKosumsi = new ArrayList<>();
        Kosumsi<Makanan, Minuma> breakfast = new Kosumsi<>();
        Kosumsi<Makanan, Minuma> lunch = new Kosumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuma susu = new Minuma();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKosumsi(roti, susu);
        listKosumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuma air = new Minuma();
        air.setNamaHidangan("Air Putih");
        lunch.setKosumsi(nasi, air);
        listKosumsi.add(lunch);

        System.out.println("Menu Kosumsi");
        for (Kosumsi<Makanan,Minuma> kosumsi: listKosumsi){
            Makanan makanan = kosumsi.getM();
            Minuma minuma = kosumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuma.disantap());
        }
    }
}

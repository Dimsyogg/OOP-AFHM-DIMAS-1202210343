public class MainApp{

    public static void main(String[] args) {
        TransportasiAir transportasiAir = new TransportasiAir(30, 5000);
        transportasiAir.informasi();
        System.out.println();
        Kapal kapal = new Kapal(5000, 2, "honda");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlabuh();
        System.out.println(
        );
        Sampan sampan = new Sampan();
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
    }
}
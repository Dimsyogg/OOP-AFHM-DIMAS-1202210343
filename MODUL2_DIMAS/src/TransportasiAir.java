public class TransportasiAir {
    protected int jumlahKursi, biaya ;

    public TransportasiAir (int jumlahKursi, int biaya) {

        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    //method void 
    public void informasi(){
        System.out.println(
            "\n Transportasi Air jenis tidak diketahui dengan kursi berjumlah 4 ditetapkan dengan biaya sebesar "+ biaya+
            "Trasportasi AIr dengan jenis yang tidak di ketahui dedang berlayar"+
            "Trasportasi AIr dengan jenis yang tidak di ketahui dedang berlayar"
        );
    }

    public void berlayar(){
        System.out.println();
    }
    public void berlabuh(){
        System.out.println();
    }
}

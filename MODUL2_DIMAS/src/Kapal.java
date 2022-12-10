public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal (int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin=mesin;


    }

    @Override
    public void informasi(){
        System.out.println(
            "Transportasi jenis sampan memiliki kursi"+jumlahKursi+", menggunakan"
        );

    }
    public void berlayar(){
        System.out.println("transportasi air jenis kapal dengan kursi berjumlah");
    }
    public void berlayar(int kecepatan){
        System.out.println("transportasi air jenis kapal dengan kursi berjumlah");
    }
    public void berlabuh(){
        System.out.println("transportasi air jenis kapal dengan kursi berjumlah");
    }
}

public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya,int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void informasi(){
        System.out.println( "Transportasi jenis sampan memiliki kursi"+jumlahKursi+", menggunakan");
    }
    public void berlayar(){

    }
    public void berlabuh(){

    }
    public void berlabuh (int jangkar){

    }
}
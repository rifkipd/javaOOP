public class Driver extends  Member{

    private String noplat, jenis;



    public Driver(String nik, String notelp, String nama , String noplat , String jenis,double saldo) {
        super(nik, notelp, nama,saldo);
        this.noplat = noplat;
        this.jenis = jenis;
    }

    @Override
    public void display() {
        System.out.println("\nData Driver");
        super.display();
        System.out.println("no plat : "+noplat);
        System.out.println("jenis : "+jenis);

    }
}

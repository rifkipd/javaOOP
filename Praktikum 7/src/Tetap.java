public class Tetap extends Karyawan{
    private Double tuDas;


    Tetap(String nama , Double tuDas,Double gaDas){
        super(nama,gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Tudas : " + tuDas);
    }
}

public class Customer extends Member{

    public Customer(String nik, String notelp, String nama, double saldo) {
        super(nik, notelp, nama, saldo);
    }

    @Override
    public void display() {
        System.out.println("\nData Customer");
        super.display();

    }
}

public class Member {
    protected String nik , notelp, nama ;
    protected double saldo;

    public Member(String nik, String notelp , String nama , double saldo){
        this.nik = nik;
        this.nama = nama;
        this.notelp = notelp;
        this.saldo = saldo;
    }



    public String getNik() {
        return nik;
    }


    public void transaksi(Member other, double biaya) {
        this.saldo = this.saldo + biaya;
        other.saldo = other.saldo - biaya;
    }
    public void display(){
        System.out.println("nama : "+ nama);
        System.out.println("nik : " +nik);
        System.out.println("no.telp : " +notelp);
        System.out.println("saldo : "+ saldo);
    }
}

public class Barang {
    private String idProduk;
    private String nama;
    private Double harga;

    Barang(String idProduk, String nama ,Double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }
    Barang (String idProduk , String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }

    void Display (){
        System.out.println("ID Produk : "+getIdProduk()+" NamaProduk: "+ getNama() + " Harga : "+getHarga());

    }

    public void setNama(String nama ){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public Double getHarga() {
        return harga;
    }

    public String getIdProduk(){
        return idProduk;
    }


}

class  Main{
    public static void main(String[] args) {
        Barang brg1 = new Barang("BRG-001","Tas Gucci");
        brg1.setHarga(1200.0);
        Barang brg2 = new Barang("BRG-002","Printer Epson L355");
        brg2.setHarga(200.0);
        Barang brg3 = new Barang("BRG-003","Tas Koper" ,150.0);
        Barang brg4 = new Barang("BRG-004","Helm" ,20.0);

        brg1.Display();
        brg2.Display();
        brg3.Display();
        brg4.Display();

        double total = brg1.getHarga() + brg3.getHarga()+ brg4.getHarga();
        System.out.println("Total harga = " +total);



    }
}

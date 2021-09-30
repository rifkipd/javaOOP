public class Barang {
    private String idProduk;
    private String nama;
    private Double harga;

    public void setNama(String nama){
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

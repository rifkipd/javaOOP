package soal2;

import java.text.DecimalFormat;

public class Mobil {
    private String merk,tahunKeluaran;
    private Double harga;
    private Integer stok;


    Mobil (String merk , String tahunKeluaran , Integer stok , Double harga){
        this.tahunKeluaran = tahunKeluaran;
        this.merk = merk;
        this.harga = harga;
        this.stok= stok;


    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public Double getHarga() {
        return harga;
    }

    public Integer getStok() {
        return stok;
    }
    public void displayInfo(){
        DecimalFormat df = new DecimalFormat("########.#");
        System.out.println();
        System.out.println("Informasi Mobil" + "\nMerk : " +getMerk() +"\nHarga : " + df.format(getHarga())+"\nTahun Keluaran : "+getTahunKeluaran() + "\nSisa Stok : "+ getStok());
    }
}

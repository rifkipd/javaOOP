package soal1;

public class Data {
    private String noTransaksi;
    private String namaPenjual , alamatPenjual , namaPembeli, alamatPembeli,namaEkspedisi,noResi,dropshipper;
    private Double asuransi ,  ongkosKirim;

    //konstruktor Data Utama
    public Data(String noTransaksi, String namaPenjual,String alamatPenjual,String namaPembeli,String alamatPembeli,Double ongkosKirim,String namaEkspedisi,String noResi){
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;


    }

    //konstruktor data utama + asuransi
    public Data(String noTransaksi, String namaPenjual,String alamatPenjual,String namaPembeli,String alamatPembeli,Double ongkosKirim,String namaEkspedisi,String noResi,Double asuransi){
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.asuransi = asuransi;

    }
    //konstruktor data utama + Dropshipper
    public Data(String noTransaksi, String namaPenjual,String alamatPenjual , String namaPembeli, String alamatPembeli , Double ongkosKirim, String namaEkspedisi, String noResi, String dropshipper ){
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.dropshipper = dropshipper;

    }

    //konstruktor data utama + Asuransi + Dropshipper
    public Data(String noTransaksi, String namaPenjual,String alamatPenjual,String namaPembeli,String alamatPembeli,Double ongkosKirim,String namaEkspedisi,String noResi,Double asuransi,String dropshipper){
        this.noTransaksi = noTransaksi;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.asuransi = asuransi;
        this.dropshipper = dropshipper;

    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public String getNoResi() {
        return noResi;
    }

    public String getDropshipper() {
        return dropshipper;
    }

    public Double getAsuransi() {
        return asuransi;
    }

    public Double getOngkosKirim() {
        return ongkosKirim;
    }

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void display(){

        if(asuransi != null && dropshipper != null){
            //penguranan diskon
            if (ongkosKirim >= 20000.0){
                ongkosKirim -= 5000;
            }
            System.out.println("Asuransi dan Dropship"+"\nNo Transaksi : "+ getNoTransaksi()+"\nNo Resi : "+ getNoResi()  + "\nNama Ekspedisi : " +getNamaEkspedisi() + "\nOngkos Kirim : "
                    +getOngkosKirim() + "\nNama Pengirim : " + getDropshipper() + "\nAlamat Pengirim : " + getAlamatPenjual()
                    + "\nNama Penerima : "+ getNamaPembeli() + "\nAlamat Penerima : " + getAlamatPembeli() + "\nNominal Asuransi : "+getAsuransi()
            );
        }else if (dropshipper != null){
            System.out.println("Dropship"+"\nNo Transaksi : "+ getNoTransaksi()+"\nNo Resi : "+ getNoResi()  + "\nNama Ekspedisi : " +getNamaEkspedisi() + "\nOngkos Kirim : "
                    +getOngkosKirim() + "\nNama Pengirim : " + getDropshipper() + "\nAlamat Pengirim : " + getAlamatPenjual()
                    + "\nNama Penerima : "+ getNamaPembeli() + "\nAlamat Penerima : " + getAlamatPembeli()
            );

        }else if (asuransi != null ){
            //penguranan diskon
            if (ongkosKirim >= 20000.0){
                ongkosKirim -= 5000;
            }
            System.out.println("Asuransi"+"\nNo Transaksi : "+ getNoTransaksi()+"\nNo Resi : "+ getNoResi()  + "\nNama Ekspedisi : " +getNamaEkspedisi() + "\nOngkos Kirim : "
                    +getOngkosKirim() + "\nNama Pengirim : " + getNamaPenjual() + "\nAlamat Pengirim : " + getAlamatPenjual()
                    + "\nNama Penerima : "+ getNamaPembeli() + "\nAlamat Penerima : " + getAlamatPembeli() + "\nNominal Asuransi : "+getAsuransi()
            );
        }else
            System.out.println("Normal"+"\nNo Transaksi : "+ getNoTransaksi()+"\nNo Resi : "+ getNoResi()  + "\nNama Ekspedisi : " +getNamaEkspedisi() + "\nOngkos Kirim : "
                    +getOngkosKirim() + "\nNama Pengirim : " + getNamaPenjual() + "\nAlamat Pengirim : " + getAlamatPenjual()
                    + "\nNama Penerima : "+ getNamaPembeli() + "\nAlamat Penerima : " + getAlamatPembeli()
            );

    }
}

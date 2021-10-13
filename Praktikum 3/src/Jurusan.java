import java.util.*;

public class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList<>();


    public Jurusan(String kode , String nama){
        this.kode = kode;
        this.nama = nama;

    }
    public void addMahasiswa(Mahasiswa m){
        this.mhs.add(m);
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }

    void display(){

        System.out.println("\n"+"Kode : " + this.getKode());
        System.out.println("Nama : " + this.getNama());
        System.out.print("Daftar Mahasiswa : \n");

        for (Mahasiswa i : getMhs()) {

            // Printing the elements of ArrayList
            System.out.println(" " + i.getNim() + " - " + i.getNama());
        }

    }
}


import java.util.ArrayList;


public class Departemen {

    private String nama;
    private ArrayList<Karyawan> kar = new ArrayList<>();


    Departemen(String nama){
        this.nama = nama;


    }

    public void addKaryawan (Karyawan k){
        kar.add(k);
    }

    public void displayAll(){
        System.out.println("Daftar seluruh Karyawan ");
        for (Karyawan data: kar) {
            data.display();


        }
    }

    public void displayTetap(){
        System.out.println("Daftar Karyawan Tetap ");
        for (Karyawan data: kar){
            if (data instanceof Tetap){
                data.display();
            }
        }
    }

    public void displayKontrak(){
        System.out.println("Daftar Karyawan Kontrak ");
        for (Karyawan data: kar) {
            if (data instanceof Kontrak){
                data.display();
            }

        }

    }
}

public class Main {
    public static void main(String[] args) {
        Tetap karT1 = new Tetap("Ujang",500000.0,300000.0);
        Tetap karT2 = new Tetap("Asep",400000.0,250000.0);
        Kontrak karK1 = new Kontrak("Daniel",50,400000.0);
        Kontrak karK2 = new Kontrak("Yusuf",25,250000.0);

        Departemen dep = new Departemen("Departemen");
        dep.addKaryawan(karT1);
        dep.addKaryawan(karT2);
        dep.addKaryawan(karK1);
        dep.addKaryawan(karK2);


        dep.displayAll();

        System.out.println();

        dep.displayTetap();

        System.out.println();

        dep.displayKontrak();





    }
}

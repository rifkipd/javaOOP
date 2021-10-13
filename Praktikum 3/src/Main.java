public class Main {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan jurusan2 = new Jurusan("D3SI","Diploma 3 Sistem Informasi\n");


        Mahasiswa mhs = new Mahasiswa("6701","Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702","Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703","Agus");
        Mahasiswa mhs4 = new Mahasiswa("6301","Ridwan");
        Mahasiswa mhs5= new Mahasiswa("6302","Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303","Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304","Rahmat");


        jurusan.addMahasiswa(mhs);
        jurusan.addMahasiswa(mhs2);
        jurusan.addMahasiswa(mhs3);

        jurusan2.addMahasiswa(mhs4);
        jurusan2.addMahasiswa(mhs5);
        jurusan2.addMahasiswa(mhs6);
        jurusan2.addMahasiswa(mhs7);

        jurusan.display();
        jurusan2.display();

    }
}

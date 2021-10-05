import java.util.ArrayList;


public class Buku {
    private String isbn;
    private String judulBuku;
    private String pengarang;
    private String tahunTerbit;
    private String harga;
    private float rating;


    //constructor Buku
    Buku(String isbn,String judulBuku,String pengarang, String tahunTerbit,String harga ,float rating){
        this.isbn = isbn;
        this.judulBuku= judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }


//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
        //setter dan getter pada program
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public String getHarga() {
        return harga;
    }

    public Float getRating() {
        return rating;
    }


    //method mencari sesuai dengan ISBN
    public void findISBN(String isbn){
        if (this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn +" "+judulBuku+" "+pengarang+" "+tahunTerbit+" "+harga+" "+rating);
        }
    }


    @Override
    public String toString() {
        return ("ISBN:"+this.getIsbn()+
                " Judul : "+ this.getJudulBuku() +
                " Pengarang : "+ this.getPengarang() +
                " Tahun : " + this.getTahunTerbit()) +
                " Harga : " + this.getHarga()+
                " Rating :" + this.getRating();
    }




    public static void main(String[] args) {
        ArrayList<Buku> dataBuku =  new ArrayList<>();

        dataBuku.add(new Buku("0001","Bandung Lautan Api","Tommy ","2000","120000", 9)); //index 0
        dataBuku.add(new Buku("0002","Keajaiban Dunia","Melinda","2011","100000", 8));//index 1
        dataBuku.add(new Buku("0003","Peninggalan Sejarah","Kurniawan","1999","500000", 10));//index 2

        //mencari databuku dengan isbn
        System.out.println("data yang dicari");
        for (Buku newbook:dataBuku){

            newbook.findISBN("0001");
        }
        System.out.println();

        //menampilkan semua data buku
        for (Buku newbook:dataBuku){
            System.out.println(newbook);
        }

        //menampilkan data yang diupdate
        System.out.println();
        dataBuku.get(0).setJudulBuku("Dilan");
        dataBuku.get(0).setPengarang("Pidi Baiq");
        dataBuku.get(0).setTahunTerbit("2020");
        dataBuku.get(0).setHarga("150000");
        dataBuku.get(0).setRating(10F);
        for (Buku newbook:dataBuku){
            System.out.println(newbook);
        }


        // menampilkan data setelah data ada yang dihapus
        dataBuku.remove(0);
        System.out.println();
        for (Buku newbook:dataBuku){
            System.out.println(newbook);
        }


    }
}




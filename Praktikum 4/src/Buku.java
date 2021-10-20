public class Buku {
    private String judul,pengarang;
    private Double harga;

    public Buku(String judul , String pengarang , Double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;

    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public Double getHarga() {
        return harga;
    }

    public void display(){
        System.out.println("Judul :"+getJudul()+" Pengarang :"+getPengarang()+" Harga: "+getHarga());
    }




    public static void main(String[] args) {
        Buku book = new Buku("Harry Potter","J.K. Rowling",300000.0);
        Buku book2 = new Buku("UML","Ivar Jacobson " , 400000.0);

        book.display();
        book2.display();

    }
}



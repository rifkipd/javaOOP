public  class Karyawan {
    protected String nama;
    protected Double gaDas;

    Karyawan(String nama , Double gaDas){
        this.nama = nama;
        this.gaDas = gaDas;

    }

    public void display(){
        System.out.print("Nama : " + nama +" gaDas : " + gaDas);
    }


}

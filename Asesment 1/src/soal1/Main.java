package soal1;

public class Main {
    public static void main(String[] args) {

        Data asuransidandropship = new Data("1","Eiger","Bandung Kopo","Bejo","DayeuhKolot",21000.0,"JNE","N0001",40000.0,"Dropship1");
        Data asuransi = new Data("2","Eiger","Bandung Kopo","Tini","DayeuhKolot",16000.0,"J&T","N0003",40000.0);
        Data normal = new Data("3","Eiger","Bandung Kopo","Bambang","DayeuhKolot",23000.0,"Pos Indonesia","N0004");
        Data dropship = new Data("4","Eiger","Bandung Kopo","Joko","DayeuhKolot",24000.0,"siCepat","N0002","Dropship2");


        System.out.println();
        asuransidandropship.display();
        System.out.println();
        asuransi.display();
        System.out.println();
        normal.display();
        System.out.println();
        dropship.display();

    }
}

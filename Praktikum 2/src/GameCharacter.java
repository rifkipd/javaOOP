public class GameCharacter {
    private String nama;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

    GameCharacter(String nama,int attackHitPoint , int attackKickPoint) {
        this.nama = nama;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public void hit(GameCharacter karB){
        karB.lifePoint -= this.attackHitPoint;
    }

    public void kick(GameCharacter karB){
        karB.lifePoint -= this.attackKickPoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;

    }

    public int getLifePoint() {
        return lifePoint;
    }

    public String getNama() {
        return nama;
    }




    public static void main(String[] args) {
        //1. Buat sebuah objek dengan name: “Raiden”, attackHitPoint: 10, attackKickPoint: 20.
        GameCharacter raiden = new GameCharacter("Raiden", 10,20);
        raiden.setLifePoint(100);


        //2. Buat sebuah objek dengan name: “Sub-Zero”, attackHitPoint: 5, attackKickPoint: 25
        GameCharacter subzero =  new GameCharacter("Sub-Zero",5,25);
        subzero.setLifePoint(100);

        //3. Objek Raiden memulai pertarungan dengan melakukan tendangan pada objek Sub-Zero.
            raiden.kick(subzero);  //subzero -20


        //4. Objek Sub-Zero melakukan perlawanan dengan menendang balik objek Raiden
            subzero.kick(raiden); //raiden -25


        //5. Objek Sub-Zero menyerang Raiden dengan pukulan berturut-turut sebanyak 3x (gunakan perulangan).
        for (int i = 0; i <3 ; i++) {     //raiden -15
            subzero.hit(raiden);
        }


        //6. Pertarungan diakhiri oleh Raiden dengan melakukan tendangan beruntun 4x pada objek SubZero (gunakan perulangan).
        for (int i = 0; i <4 ; i++) {   //subzero -80
            raiden.kick(subzero);
        }


        //7. Tampilkan lifePoint dari objek Raiden dan objek Sub-Zero. Bandingkan kedua lifePoint tersebut.
        //8. Tampilkan status kemenangan dari pertarungan kedua objek. Objek yang menang adalah
        //objek yang memiliki lifePoint tertinggi di akhir pertarungan.
        System.out.println("Raiden : "+raiden.getLifePoint());
        System.out.println("Subzero : "+subzero.getLifePoint());

        if (raiden.getLifePoint() > subzero.getLifePoint()){
            System.out.println(raiden.getNama()+" is Win");
        }else
            System.out.println(subzero.getNama()+" is Win");


    }
}

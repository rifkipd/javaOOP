/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topik13;

/**
 *
 * @author WELD
 */
public class Makanan {
    private String nama,jenis,rating,kalori;
    
    
    public Makanan(String nama,String jenis,String rating,String kalori){
        this.nama = nama;
        this.jenis = jenis;
        this.rating = rating;
        this.kalori = kalori;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getRating(){
        return rating;
    }
    
    public String getKalori(){
        return kalori;
    }
}


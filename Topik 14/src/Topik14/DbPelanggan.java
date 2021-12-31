/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topik14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author WELD
 */
public class DbPelanggan {
    private Connection conn;
    private final Koneksi k = new Koneksi();
    
    //SELECT
    
    public ArrayList<Pelanggan> getPelanggan() throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();      
        
        //langkah 1
        conn = k.getConnection();
        
        //langkah 2
        String kueri = "SELECT * FROM pelanggan";
        PreparedStatement ps = conn.prepareStatement(kueri);
        
        //langkah 3
        ResultSet rs = ps.executeQuery();
        
        //langkah 4
        while(rs.next()){
            String id = rs.getString("member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String jenis = rs.getString("jenis");
            
            Pelanggan p = new Pelanggan(id, nama, jenis, Integer.parseInt(tahun));
            daftar.add(p);
        }
        //langkah 5
        rs.close(); ps.close();conn.close();
        return daftar;
    }
    
    //INSERT
     public boolean insertPelanggan(Pelanggan p) throws SQLException{
        
        //langkah 1
        conn = k.getConnection();
        
        //langkah 2
        String kueri = "INSERT INTO pelanggan(member,nama,jenis,tahun_lahir) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getId()); ps.setString(2, p.getNama());
        ps.setString(3, p.getJenis()); ps.setInt(4, p.getTahunLahir());
        //langkah 3
        int rowAffected = ps.executeUpdate();
        //langkah 4 & 5
        ps.close(); conn.close();
        return rowAffected == 1;
        
    }
    
     //UPDATE
    public boolean updatePelanggan(Pelanggan p) throws SQLException{
        //langkah 1
        conn = k.getConnection();
        
        //langkah 2
        String kueri = "UPDATE pelanggan SET nama=?, jenis=?, tahun_lahir=? WHERE member=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, p.getNama()); ps.setString(2, p.getJenis());
        ps.setInt(3, p.getTahunLahir()); ps.setString(4, p.getId());
        
        //langkah 3
        int rowAffected = ps.executeUpdate();
        
        //langkah 4 & 5
        ps.close(); conn.close();
        return rowAffected == 1;
    }
    
    //DELETE
    public boolean deletePelanggan(String id) throws SQLException{
        
        //langkah 1
        conn = k.getConnection();
        
        //langkah 2
        String kueri = "DELETE FROM pelanggan WHERE member = ?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, id); 
        
        //langkah 3
        int rowAffected = ps.executeUpdate();
        //langkah 4 & 5
        ps.close(); conn.close();
        return rowAffected == 1;
    }
    
    //CARI -- SELECT-WHERE
    public ArrayList<Pelanggan> cariPelanggan(String keyword) throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        
        //langkah 1
        conn = k.getConnection();
        
        //langkah 2
        String kueri = "SELECT * FROM pelanggan WHERE nama LIKE ? OR tahun_lahir=? OR jenis=?";
        PreparedStatement ps = conn.prepareStatement(kueri);
        ps.setString(1, "%"+keyword+"%"); ps.setString(2, keyword);
        ps.setString(3, keyword);  
        
        //langkah 3
        ResultSet rs = ps.executeQuery();
        
        //langkah 4
        while(rs.next()){
            String id = rs.getString("member");
            String nama = rs.getString("nama");
            String tahun = rs.getString("tahun_lahir");
            String jenis = rs.getString("jenis");
            
            Pelanggan p = new Pelanggan(id, nama, jenis, Integer.parseInt(tahun));
            daftar.add(p);
        }
        //langkah 5
        rs.close(); ps.close();conn.close();
        return daftar;
        
    }
    
    
}

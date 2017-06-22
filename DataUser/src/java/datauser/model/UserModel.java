/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datauser.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ARIPH
 */
public class UserModel {
    Date tanggal;
    String id, username, password, nama, alamat, email, telp;
    Koneksi db = null;
       
    public UserModel() {
        db = new Koneksi();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    
    public List tampil() {
        List<UserModel> data = new ArrayList<UserModel>();
        ResultSet rs = null;
 
        try {
            String sql = "select * from user";
            rs = db.ambilData(sql);
            while (rs.next()) {
                UserModel um = new UserModel();
                um.setId(rs.getString("id_user"));
                um.setUsername(rs.getString("username"));
                um.setPassword(rs.getString("password"));
                um.setNama(rs.getString("nama"));
                um.setAlamat(rs.getString("alamat"));
                um.setTanggal(rs.getDate("tanggal"));
                um.setEmail(rs.getString("email"));
                um.setTelp(rs.getString("telp"));
                data.add(um);
 
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
    public List cariID() {
        List<UserModel> data = new ArrayList<UserModel>();
        ResultSet rs = null;
 
        try {
            String sql = "select * from user where id_user='" + id + "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                UserModel um = new UserModel();
                um.setId(rs.getString("id_user"));
                um.setUsername(rs.getString("username"));
                um.setPassword(rs.getString("password"));
                um.setNama(rs.getString("nama"));
                um.setAlamat(rs.getString("alamat"));
                um.setTanggal(rs.getDate("tanggal"));
                um.setEmail(rs.getString("email"));
                um.setTelp(rs.getString("telp"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari ID" + ex);
        }
        return data;

    }
    public int cek(){
        ResultSet rs = null;
        int ada = 0;
        String sql="select * from user where username='" + username + "' and password='" + password + "'";
        rs = db.ambilData(sql);
        
            try {
                while (rs.next()) {
                    
                ada = rs.getInt("id_user");

                }
                db.diskonek(rs);
            } catch (SQLException ex) {
                Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return ada;
    }
    
    public void simpan(){
        String sql="insert into user values(null,'" 
            + username + "','" + password + "','" + nama + "','" +
            alamat + "','" + tanggal + "','" + email + "','" + telp + "')";
        db.simpanData(sql);
    }
    
    public void update(){
        String sql="update user set username='" + username + "', password='" +
                password + "', nama='" + nama + "', alamat='" + 
                alamat + "', tanggal='" + tanggal + "', email='" + email + "', telp='" + 
                telp + "' where id_user='" + id + "'";
        db.simpanData(sql);
        System.out.println(sql);
    }
    
    public void hapus(){
        String sql="delete from user where id_user='" + id + "'";
        db.simpanData(sql);
        System.out.println("");
    }
    
}

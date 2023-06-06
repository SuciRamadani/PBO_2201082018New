/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci160523;

/**
 *
 * @author user
 */
public class BukuAlamat {
     private String nama;
    private String alamat;
    private String notlp;
    private String email;
    
    public BukuAlamat(){ 
        //area inisialisasi kode; 
    } 
    public BukuAlamat(String temp){ 
        this.nama = temp; 
    } 
    public BukuAlamat(String nama, String alamat, String notlp, String email){ 
        this.nama = nama; 
        this.alamat = alamat;
        this.notlp = notlp; 
        this.email = email;
    } 
    
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNotlp(){
        return notlp;
    }
    
    public void setNotlp(String notlp){
        this.notlp = notlp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}

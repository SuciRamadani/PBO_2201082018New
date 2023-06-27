/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci.dao;

import java.util.List;
import Suci.model.Anggota;

/**
 *
 * @author hp
 */
public interface AnggotaInterface {
    public void insert(Anggota anggota) throws Exception;
    public void update(Anggota anggota) throws Exception;
    public void delete(Anggota anggota) throws Exception;
    public Anggota getAnggota(String kode) throws Exception;
    public List<Anggota> getAll() throws Exception;
}

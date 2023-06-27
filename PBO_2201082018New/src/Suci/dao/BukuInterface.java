/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci.dao;

import java.util.List;
import Suci.model.Buku;

/**
 *
 * @author hp
 */
public interface BukuInterface {
    public void insert(Buku buku) throws Exception;
    public void update(Buku buku) throws Exception;
    public void delete(Buku buku) throws Exception;
    public Buku getBuku(String kode) throws Exception;
    public List<Buku> getAll() throws Exception;
}

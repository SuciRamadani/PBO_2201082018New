/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suci.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Suci.dao.AnggotaImpl;
import Suci.dao.AnggotaInterface;
import Suci.model.Anggota;
import Suci.view.FormAnggota;

/**
 *
 * @author Suci
 */
public class AnggotaController {
    FormAnggota view ;
    Anggota model ;
    AnggotaInterface dao;

    public AnggotaController(FormAnggota view) {
            this.view = view;
            dao =  new AnggotaImpl();
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
    }
    
    public void insertForm(){
        try {
            model = new Anggota();
            model.setKodeanggota(view.getTxtKodeAnggota().getText());
            model.setNamaanggota(view.getTxtNamaAnggota().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJeniskelamin(
                view.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Successful Insert");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cari(){
        try {
            String kodeanggota = view.getTxtKodeAnggota().getText();
            model = dao.getAnggota(kodeanggota);
            if(model != null){
                view.getTxtNamaAnggota().setText(model.getNamaanggota());
                view.getTxtAlamat().setText(model.getAlamat());
                view.getCboJenisKelamin().setSelectedItem(model.getJeniskelamin());
            }else{
                JOptionPane.showMessageDialog(view, "Data Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            model = new Anggota();
            model.setKodeanggota(view.getTxtKodeAnggota().getText());
            model.setNamaanggota(view.getTxtNamaAnggota().getText());
            model.setAlamat(view.getTxtAlamat().getText());
            model.setJeniskelamin(
                view.getCboJenisKelamin().getSelectedItem().toString());
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Successful Update");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(){
        try {
            int pil = JOptionPane.showConfirmDialog(view, "Apakah Yakin Dihapus?");
                    if(pil == 0){
                         dao.delete(model);
                         JOptionPane.showMessageDialog(view, "Successful Delete");
                    }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void viewTable(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTabelAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> anggotaList = dao.getAll();
            for (Anggota anggota : anggotaList ){
                Object[] data = {
                anggota.getKodeanggota(),
                anggota.getNamaanggota(),
                anggota.getAlamat(),
                anggota.getJeniskelamin()
            };
                tabelModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import negocio.Carro;
import negocio.GerenciamentoDeCarrosFacade;

/**
 *
 * @author Icaro
 */
public class Controller {
    public static Janela janela;
    GerenciamentoDeCarrosFacade facade = new GerenciamentoDeCarrosFacade();  
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela(new Controller()).setVisible(true);
            }
        });
    }
    
    
    public Controller(){
        janela = new Janela(this);
        facade = new GerenciamentoDeCarrosFacade();        
    }

    void processaPesquisaGeral(DefaultTableModel model) {
        model.setRowCount(0);
        
        for(Carro i: facade.getLista()){
            String placa = i.getPlaca();
            String modelo = i.getModelo();
            int ano = i.getAno();
            String fabricante = i.getFabricante();
            int capacidadeDoTanque = i.getCapacidadeDoTanque();
            double odometro = i.getOdometro();
            String tipo = i.getTipoDeCombustivel();
            
            model.addRow(new Object[]{placa,fabricante, modelo, ano, tipo, odometro});
        }
    } 

    void cadastraVeiculo(String placa, String modelo, int ano, String fabricante, int capacidadeDoTanque, double odometro, String tipoDecombustivel) {
        facade.add(new Carro(placa, modelo, ano, fabricante, capacidadeDoTanque, odometro, tipoDecombustivel));
    }

    void processaPesquisaEspecifica(DefaultTableModel model, String tipoPesq, String arg) {
        model.setRowCount(0);
        
        switch(tipoPesq.toLowerCase()){
            case "combustivel":
                for(Carro i: facade.getLista()){
                    if(i.getTipoDeCombustivel().toLowerCase().equals(arg.toLowerCase())){
                        model.addRow(new Object[]{i.getPlaca(),i.getFabricante(),  i.getModelo(), i.getAno(), i.getTipoDeCombustivel(), i.getOdometro()});
                    }
                }
                break;
                
            case "placa":
                for(Carro i: facade.getLista()){
                    if(i.getPlaca().toLowerCase().equals(arg.toLowerCase())){
                        model.addRow(new Object[]{i.getPlaca(),i.getFabricante(),  i.getModelo(), i.getAno(), i.getTipoDeCombustivel(), i.getOdometro()});
                    }
                }
                break;
                
            case "modelo":
                for(Carro i: facade.getLista()){
                    if(i.getModelo().toLowerCase().equals(arg.toLowerCase())){
                        model.addRow(new Object[]{i.getPlaca(),i.getFabricante(),  i.getModelo(), i.getAno(), i.getTipoDeCombustivel(), i.getOdometro()});
                    }
                }
                break;
                
             case "ano":
                for(Carro i: facade.getLista()){
                    if(i.getAno() == Integer.parseInt(arg)){
                        model.addRow(new Object[]{i.getPlaca(),i.getFabricante(),  i.getModelo(), i.getAno(), i.getTipoDeCombustivel(), i.getOdometro()});
                    }
                }
            break;
            
            case "fabricante":
                for(Carro i: facade.getLista()){
                    if(i.getFabricante().toLowerCase().equals(arg.toLowerCase())){
                        model.addRow(new Object[]{i.getPlaca(),i.getFabricante(),  i.getModelo(), i.getAno(), i.getTipoDeCombustivel(), i.getOdometro()});
                    }
                }
                break;
        }
    }
}      
    


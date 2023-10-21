/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Luisa Santos Silva
 */

//importando javax.swing.JOptionPane
import javax.swing.JOptionPane;

//classe EntradaSaidaDados
public class EntradaSaidaDados {
    
   //metodo que realiza a entrada de dados
    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    //metodo que realiza a saida de dados
    public void saidaDados(String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}//finalizando classe EntradaSaidaDados

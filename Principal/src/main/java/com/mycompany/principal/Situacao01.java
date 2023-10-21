/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Luisa Santos Silva
 */

//importando javax.swing.JOptionPane;
import javax.swing.JOptionPane;

//classe Situacao01
public class Situacao01 {
    
    //método verificarSituacao()
    public void verificarSituacao(double imc) {
        if (imc < 18.5) {
           JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Dentro do Normal");
        } else if (imc > 24.9 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade");
        } else if (imc > 34.9 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade Severa");
        } else if (imc > 39.9) {
            JOptionPane.showMessageDialog(null, "Você está classificado com a situação de Obesidade Mórbida");
        } 
   }//finalizando método verificarSituacao() 
 
}//finalizando classe Situacao01


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Luisa Santos Silva
 */

//classe IMC03
public class IMC03 {
    
   // Atributos da classe IMC03
    private double peso;
    private double altura;
    private double imc;

    public IMC03() {
        this(0, 0, 0);
    }

    public IMC03(double peso, double altura, double imc) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    //métodos construtores
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
     
    //método calcularIMC()
    public double calcularIMC(){
        setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
        return getImc();
    }    
    
    // Método cadastrarDados()
    public void cadastrarDados(double peso, double altura) {
        setPeso(peso);
        setAltura(altura);
    }
    
}//finalizando classe IMC03 

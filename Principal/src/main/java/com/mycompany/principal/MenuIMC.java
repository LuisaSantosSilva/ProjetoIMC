/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Luisa Santos Silva
 */
public class MenuIMC {
    //atributos da classe MenuIMC
    private IMC03 imc;  
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Situacao01 situacao;

    public MenuIMC() {
        this.imc = new IMC03();  
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.situacao = new Situacao01();
    }

    //método executarIMC()
    public void executarIMC() {
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 5);
    }

    //método executarMenuPrincipal()
    public void executarMenuPrincipal() {
    String mensagemMenu = "Selecione uma opção:\n"
        + "1 - Cadastrar Peso e Altura\n"
        + "2 - Consultar Dados Cadastrados\n"
        + "3 - Calcular IMC\n"
        + "4 - Verificar Situação\n"
        + "0 - Sair\n";
    
    String opcao = io.entradaDados(mensagemMenu);
    this.opcao = conversor.stringToInt(opcao);
}

    //método avaliarOpcaoEscolhida()
    public void avaliarOpcaoEscolhida() {
        //estrutura de decisão
        switch (this.opcao) {
            case 1:
                imc.cadastrarDados(conversor.stringToDouble(io.entradaDados("Digite seu peso:")),
                    conversor.stringToDouble(io.entradaDados("Digite sua Altura:")));
                io.saidaDados("Peso e altura cadastrados com sucesso!");
                break;
            case 2:
                    io.saidaDados("Dados Cadastrados:");
                    io.saidaDados("Peso: " + imc.getPeso() + " kg" +
                            "\nAltura: "+ imc.getAltura()+ " m");
                break;
            case 3:
                imc.calcularIMC();
                io.saidaDados("\nIMC Calculado: " + imc.getImc());
                break;
            case 4:
                double imcValor = imc.getImc();
                situacao.verificarSituacao(imcValor);
                break;
            case 0:
                io.saidaDados("Finalizando o Programa...");
                System.exit(0);
                break;
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
        
    }//finalizando método avaliarOpcaoEscolhida()
}//finalizando classe MenuIMC 


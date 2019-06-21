/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fapi.ex02;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {
    public static void main(String[] args){
        CheckImplement check;
        String nome = null;
        Scanner ler = new Scanner(System.in);
        
        try{
          System.out.println("Olá, digite um nome: ");
          nome = ler.nextLine();
          check = new Check();
          check.verificador(nome);
          System.out.println("Você passou desta vez.");
        }catch(NomeInvalidoException e){
            System.out.println("Nome com erro: " + nome);
        }
    }
}

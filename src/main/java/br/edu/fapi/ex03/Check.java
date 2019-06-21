/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fapi.ex03;

/**
 *
 * @author Diego
 */
public class Check implements CheckImplement{

    @Override
    public void verificador(String nome) throws NomeInvalidoException {
        if(nome.startsWith("_")){
            throw new NomeInvalidoException(nome);
        }
    }
    
}

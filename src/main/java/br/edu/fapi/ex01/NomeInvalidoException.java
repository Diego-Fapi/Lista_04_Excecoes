/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fapi.ex01;

/**
 *
 * @author Diego
 */
public class NomeInvalidoException extends Exception{
    String nome;
	
	public NomeInvalidoException() {
            nome = "Diego";
        }
}

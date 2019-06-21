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
public class NomeInvalidoException extends Exception{
        String nome;
	
	public NomeInvalidoException(String nome) {
		super();
	}
}

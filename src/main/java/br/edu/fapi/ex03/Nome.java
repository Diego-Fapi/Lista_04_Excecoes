/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fapi.ex03;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Nome {
    public void lerNome(){
        int x = 1;
	int correto = 0;
	int errado = 0;
        String nome;
        Scanner ler = new Scanner(System.in);
		while (x < 6) {
			System.out.println("Digite o " + x + "° nome: ");
			nome = ler.nextLine();
			Check check = new Check();
			try {
				check.verificador(nome);
				correto++;
			} catch (NomeInvalidoException e) {
				System.out.println("Tá ligado que não pode escrever com _ certo?");
				errado++;
			}
			x++;
		}
                System.out.println("Nomes certos:" + correto);
		System.out.println("Nomes errados:" + errado);
		
    }
}

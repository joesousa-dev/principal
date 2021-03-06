package principal;

import java.util.Scanner;

/**
 * 
 * @author Simone Santos, alterado por Joel Sousa
 * email - joe_sousa@alu.ufc.br
 * Classe Maquina de bilhete, recebe atributos privados pre?o, saldo, total,
 * deficit(Valor que falta) e valor com modificador protected.
 */
public class maquinaBilhete {
	private int preco;
	private int saldo;
	private int total;
	private int deficit;
	protected int valor;
/**
 * 
 * @param custoBilhete ser? o valor cobrado pelo bilhete, passado pelo construtor.
 * 
 */
	public maquinaBilhete(int custoBilhete) {
		preco = custoBilhete;
		saldo = 0;
		total = 0;
	}
/**
 * 
 * @return preco, o valor do bilhete ? retornado nessa fun??o, tipo int.
 */
	public int getPreco() {
		return preco;
	}

/**
 * @return saldo, valor do saldo ? retornado atrav?s desta fun??o.
 */
	public int getSaldo() {
		//System.out.println("# Saldo #");
		return saldo;
	}

/**
 * 
 * Imprime o pre?o do bilhete de acordo com o pre?o aferido, zera o saldo.
 * 
 */
	
	public void imprimeBilhete() {
		System.out.println("# Pre?o por Bilhete #");
		System.out.println("#" + preco + " centavos.#");
		total = saldo + total;
		saldo = 0;
	}
/**
 * 
 * @param quantia como par?metro serve para compra do bilhete.
 */
	public void inserirValores(int quantia) {
		saldo = saldo + quantia;
	}
/**
 * 
 * @param fun??o que recebe valor digitado pelo usu?rio e ela faz a 
 * valida??o ou n?o da compra, de acordo com o saldo do usu?rio e valor do bilhete,
 * cujo saldo ? atualizado a cada transa??o, mostra ainda se tem "troco".
 * @return valor, retorna o valor total de inser??es feitas pelo usu?rio.
 */
	public int validarCompra(int valor) {
		if (saldo < preco) {
			deficit = preco - saldo;
			System.out.println("Falta " + deficit + " para compra");
		} else {
			System.out.println("Compra autorizada, cr?dito de R$" + (saldo - preco));
		}
		return valor;
	}
/**
 * Contrutor feito automaticamente.
 */
	public maquinaBilhete() {
		// TODO Auto-generated constructor stub
	}

}

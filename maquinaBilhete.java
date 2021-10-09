package principal;

import java.util.Scanner;

/**
 * 
 * @author Simone Santos, alterado por Joel Sousa
 * email - joe_sousa@alu.ufc.br
 * Classe Maquina de bilhete, recebe atributos privados preço, saldo, total,
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
 * @param custoBilhete será o valor cobrado pelo bilhete, passado pelo construtor.
 * 
 */
	public maquinaBilhete(int custoBilhete) {
		preco = custoBilhete;
		saldo = 0;
		total = 0;
	}
/**
 * 
 * @return preco, o valor do bilhete é retornado nessa função, tipo int.
 */
	public int getPreco() {
		return preco;
	}

/**
 * @return saldo, valor do saldo é retornado através desta função.
 */
	public int getSaldo() {
		//System.out.println("# Saldo #");
		return saldo;
	}

/**
 * 
 * Imprime o preço do bilhete de acordo com o preço aferido, zera o saldo.
 * 
 */
	
	public void imprimeBilhete() {
		System.out.println("# Preço por Bilhete #");
		System.out.println("#" + preco + " centavos.#");
		total = saldo + total;
		saldo = 0;
	}
/**
 * 
 * @param quantia como parâmetro serve para compra do bilhete.
 */
	public void inserirValores(int quantia) {
		saldo = saldo + quantia;
	}
/**
 * 
 * @param função que recebe valor digitado pelo usuário e ela faz a 
 * validação ou não da compra, de acordo com o saldo do usuário e valor do bilhete,
 * cujo saldo é atualizado a cada transação, mostra ainda se tem "troco".
 * @return valor, retorna o valor total de inserções feitas pelo usuário.
 */
	public int validarCompra(int valor) {
		if (saldo < preco) {
			deficit = preco - saldo;
			System.out.println("Falta " + deficit + " para compra");
		} else {
			System.out.println("Compra autorizada, crédito de R$" + (saldo - preco));
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

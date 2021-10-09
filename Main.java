package principal;

import maquinaBilhete;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		maquinaBilhete m1 = new maquinaBilhete(100);
		Scanner lerValor = new Scanner(System.in);
		m1.imprimeBilhete();
		do {
			System.out.println("Digite o valor");
			num = lerValor.nextInt();
			m1.inserirValores(num);
			m1.validarCompra(num);
		} while (m1.getSaldo() < m1.getPreco());
		System.out.println("Valor total inserido " + m1.getSaldo());
	}
}

package controller;
import util.Teclado;

public class DesvioCondicionalComposto {

	public static void main(String[] args) {
		
		int idade;
		
		idade = Teclado.lerInt("Informe sua idade: ");
		
		if (idade >=18 && idade < 65) {
			System.out.println("Você tem " + idade + " anos. Voto obrigatório!");
		} else if (idade >= 16 || idade >= 65) {
			System.out.println("Você tem " + idade + " anos. Voto opcional!");
		} else 
			System.out.println("Você  tem " + idade + " anos. Não vota!");
		
		
		}
		
	}



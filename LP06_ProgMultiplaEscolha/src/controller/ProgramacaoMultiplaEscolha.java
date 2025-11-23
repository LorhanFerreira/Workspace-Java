package controller;

import util.Teclado;

public class ProgramacaoMultiplaEscolha {

	public static void main(String[] args) {
		/*
		 * Programa que pergunte o nº de matrícula de sócio de um Clube e exiba o mês de
		 * pagamento da anuidade, conforme a seguinte tabela:
		 * 
		 * ------------------------------------
		 * - Final Matrícula | Mês Pagamento
		 * -       0 		 |   Janeiro
		 * -       1	     |	Fevereiro
		 * -       2         |    Março
		 * -       3         |    Abril
		 * -    Outro Final   |    Maio
		 * ------------------------------------    		
		 */									
		 int matricula, ultimo;
		 
		 matricula = Teclado.lerInt("Informe o seu número de matrícula: ");
		 
		 ultimo = matricula %10;
		 System.out.println(ultimo);
		 
		 switch (ultimo) {
		 
		 case 0:
			 System.out.println("Mês de pagamento: Janeiro");
			 break;
			 
		 case 1:
			 System.out.println("Mês de pagamento: Fevereiro");
			 break;
			 
		 case 2:
			 System.out.println("Mês de pagamento: Março");
			 break;
			 
		 case 3:
			 System.out.println("Mês de pagamento: Abril");
			 break;
			 
		 default:
			 System.out.println("Mês de pagamento: Maio");
			 break;
		 
		 }//Fim do Switch
		 
		

	}

}

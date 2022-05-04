package exercicios_prof_ohata;
import java.util.Scanner;

public class calculo_media_fundamental {

	public static void main(String[] args) {
		//Titulo exercicio
		System.out.print("Exercício - Cálculo de média aritmética do fundamental \n\n");
		
		//Declaracao de variaveis
		int RA;
		float nota1, nota2, nota3, media_final;
		
		//Declaracao de Scanner para entrada de dados
		Scanner input = new Scanner(System.in);
				
		//Looping para calcular nota de todos alunos
		do {
		System.out.println("Qual o RA do aluno ? ");
		RA = input.nextInt();
		
		if(RA != 0) {
			//Entrada de dados de RA, nota1, nota2, nota3
			System.out.println("Qual foi a primeira nota do aluno ? ");
			nota1 = input.nextFloat();
			System.out.println("Qual foi a segunda nota do aluno ? ");
			nota2 = input.nextFloat();
			System.out.println("Qual foi a terceira nota do aluno ? ");
			nota3 = input.nextFloat();		
		
		//Atribuindo media aritmetica
		media_final = (nota1 + nota2 + nota3) / 3;
		
		//Confere nota do aluno para saber o seu status
		if(media_final >= 8) {
			System.out.println("Aluno aprovado!!!\n");
		}			
		else if (media_final >= 6) {
				System.out.println("Aluno está de recuperção!\n");
		}
			else {
				System.out.println("Aluno reprovado!\n");
			} 
		}
		}while(RA != 0);
		
		System.out.print("Nehum aluno encontrado, até mais.");
	}

}

package core.garciagiovane.cadastro.aluno;

import java.util.Scanner;

public class Servicos {
	Aluno aluno = new Aluno();
	
	int contador = 0;
	int gerarMatricula = 0;
	
	Scanner leia = new Scanner(System.in);
	
	String nome[] = new String[30];
	int matricula[] = new int[30];
	float nota1[] = new float[30];
	float nota2[] = new float[30];
	float nota3[] = new float[30];
	float media[] = new float[30];
	
	public void cadastrarAluno() {
//		int gerarMatricula = gerarMatricula + 1;
		
		gerarMatricula ++;
		
		aluno.setMatricula(gerarMatricula);
		
		System.out.println("Digite o nome");
		aluno.setNome(leia.next());
		
		nome[contador] = aluno.getNome();		
		matricula[contador] = aluno.getMatricula();
		
		contador++;
	}
	
	public void lancarNotas() {
		System.out.println("Digite a matrícula do aluno");
		int pesquisarMatricula = leia.nextInt();
		
		boolean resposta = false;
		
		for(int i = 0; i < contador; i++) {
			if(matricula[i] == pesquisarMatricula) {
				
				System.out.println("Digite a nota 1");
				aluno.setNota1(leia.nextFloat());
				nota1[i] = aluno.getNota1();
				
				System.out.println("Digite a nota 2");
				aluno.setNota2(leia.nextFloat());
				nota2[i] = aluno.getNota2();
				
				System.out.println("Digite a nota 3");
				aluno.setNota3(leia.nextFloat());
				nota3[i] = aluno.getNota3();
				
				float resultado = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
				aluno.setMedia(resultado);
				media[i] = aluno.getMedia();
				
				resposta = true;
			} 
		}
		if (resposta == false) {
			System.out.println("Matrícula não encontrada!");
		}
	}
	
	public void listarAlunos() {
		for(int i = 0; i < contador; i++) {
			System.out.println("Nome aluno: " + nome[i]
					+ "\nMatrícula: " + matricula[i]
							+ "\nNota 1: " + nota1[i]
									+ "\nNota 2: " + nota2[i]
											+ "\nNota 3: " + nota3[i] + "\n");
		}
	}
	
	public void encerrarSemestre() {
		for(int i = 0; i < contador; i++) {
			if(media[i] >= 7) {
				System.out.println("Nome aluno: " + nome[i]
						+ "\nStatus: Aprovado");
			} else {
				System.out.println("Nome aluno: " + nome[i]
						+ "\nStatus: Reprovado");
			}
		}
	}
}

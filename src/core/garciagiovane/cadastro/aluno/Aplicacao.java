package core.garciagiovane.cadastro.aluno;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Servicos servicos = new Servicos();
		int op = 0;
		
		do {
			System.out.println("Digite a opção desejada"
					+ "\n1 - Cadastrar aluno"
					+ "\n2 - Cadastrar notas"
					+ "\n3 - Encerrar semestre"
					+ "\n4 - Listar alunos");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				servicos.cadastrarAluno();
				break;
			case 2:
				servicos.lancarNotas();
				break;
			case 3:
				servicos.encerrarSemestre();
				break;
			case 4:
				servicos.listarAlunos();
				break;
			case 5:
				System.exit(1);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(op != 0);

	}

}

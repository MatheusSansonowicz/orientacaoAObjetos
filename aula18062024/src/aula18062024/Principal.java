package aula18062024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import desafio.Aluno;

public class Principal {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Pedro", 19);
		
		try {
			FileWriter arquivo = new FileWriter("Alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			escritor.write(aluno1.getNome() + "," + aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + "," + aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + "," + aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo aluno.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader arquivo = new FileReader("Alunos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Alunos lidos no arquivo: ");
			
			String linha;
			
			while((linha = leitor.readLine())!=null) {
				String[] campo = linha.split(",");
				
				String nome = campo[0];
				int idade = Integer.parseInt(campo[1]);
				Aluno aluno = new Aluno(nome, idade);
				System.out.println("Aluno [nome=" + aluno.getNome() + ", idade=" + aluno.getIdade() + "]");
			}
			leitor.close();
			arquivo.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}

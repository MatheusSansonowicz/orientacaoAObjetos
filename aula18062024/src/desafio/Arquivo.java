package desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	
	private FileWriter arqw;
	private BufferedWriter escritor;
	private FileReader arqr;
	private BufferedReader leitor;
	private List<Aluno> listaAluno;
	private String nomeArquivo;
	
	public Arquivo (String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		listaAluno = new ArrayList<>();
	}

	public void gravarArquivo(Aluno aluno1) {
		// TODO Auto-generated method stub
		try {
			arqw = new FileWriter(nomeArquivo+".txt", true);
			escritor = new BufferedWriter(arqw);
			escritor.write(aluno1.getNome() + "," +aluno1.getIdade());
			escritor.newLine();
			escritor.close();
			arqw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> leArquivo(){
		System.out.println("Alunos lidos do arquivo: ");
		try {
			arqr = new FileReader(nomeArquivo+".txt");
			leitor = new BufferedReader(arqr);
			String linha;

			while((linha = leitor.readLine())!=null) {
				String[] campo = linha.split(",");
				
				String nome = campo[0];
				int idade = Integer.parseInt(campo[1]);
				Aluno aluno = new Aluno(nome, idade);
				listaAluno.add(aluno);
			}
			leitor.close();
			arqr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaAluno;
	}

}

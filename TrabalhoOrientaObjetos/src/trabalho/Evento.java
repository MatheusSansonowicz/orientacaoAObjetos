package trabalho;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	protected String nome;
	private List<String> participantes;
	
	public Evento(String nome) {
		this.nome = nome;
		this.participantes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public List<String> getParticipantes() {
		return participantes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setParticipantes(List<String> participantes) {
		this.participantes = participantes;
	}

	public void adicionarParticipacao(String participante) {
		if (!participantes.contains(participante)) {
	    participantes.add(participante);
	    System.out.println(participante + " foi adicionado ao evento " + nome + ".");
	    } else {
	            System.out.println(participante + " já está participando do evento " + nome + ".");
	        }
	    }

	public void cancelarParticipacao(String participante) {
	    if (participantes.contains(participante)) {
	            participantes.remove(participante);
	            System.out.println(participante + " foi removido do evento " + nome + ".");
	        } else {
	            System.out.println(participante + " não está participando do evento " + nome + ".");
	        }
	    }
}

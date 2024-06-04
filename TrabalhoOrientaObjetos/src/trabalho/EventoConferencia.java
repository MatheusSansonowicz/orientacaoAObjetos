package trabalho;

import java.util.List;

public class EventoConferencia extends Evento{
	
	private List<String> participantesConferencia;
	
	public EventoConferencia(String nome) {
		super(nome);
		}

	public EventoConferencia(String nome,List<String> participantes) {
		super(nome);
		this.participantesConferencia = participantes;
	}
	
	public List<String> getParticipantesConferencia() {
		return participantesConferencia;
	}
	@Override
	public void adicionarParticipacao(String participante) {
		if (!participantesConferencia.contains(participante)) {
			participantesConferencia.add(participante);
		    System.out.println(participante + " foi adicionado ao evento " + nome + ".");
		    } else {
		     System.out.println(participante + " já está participando do evento " + nome + ".");
		        }
		    }
	@Override
	public void cancelarParticipacao(String participante) {
		if (!participantesConferencia.contains(participante)) {
			System.out.println(participante+" não está na conferencia");
		}
		else{
			participantesConferencia.remove(participante);
			System.out.println(participante +"Foi removido! Mas deverá pagar uma multa de 50% o valor do ingresso!D");
		}
	}

}

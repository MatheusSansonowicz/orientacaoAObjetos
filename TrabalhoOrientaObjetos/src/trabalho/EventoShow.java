package trabalho;

import java.util.List;

public class EventoShow extends Evento{
	
	private List<String> ingressosVip;
    private List<String> ingressosPista;

	public EventoShow(String nome) {
		super(nome);
	}
	
	public EventoShow(String nome, List<String> ingressosVip, List<String> ingressosPista) {
		super(nome);
		this.ingressosVip = ingressosVip;
		this.ingressosPista = ingressosPista;
	}

	public void adicionarParticipacao(String participante, int tipoIngresso) {
		
		if(ingressosVip.contains(participante) || ingressosPista.contains(participante)) {
			System.out.println(participante + " ja tem ingresso para o evento " + nome + ".");
		}
		else {
			if (tipoIngresso == 1) {
				ingressosVip.add(participante);
                System.out.println(participante + " foi adicionado ao evento " + nome + " com ingresso Vip.");
			}
			else if (tipoIngresso == 2) {
				ingressosPista.add(participante);
                System.out.println(participante + " foi adicionado ao evento " + nome + " com ingresso Pista.");
			}
			else
				System.out.println("Tipo de ingresso não aceito!");
		}
		
	}
	
	public void cancelarParticipacao(String participante) {
		if (ingressosVip.contains(participante)) {
			ingressosVip.remove(participante);
            System.out.println(participante + " foi removido do evento " + nome + " com reembolso parcial (50%) do ingresso VIP.");
			}
		else if (ingressosPista.contains(participante)) {
	        ingressosPista.remove(participante);
	        System.out.println(participante + " foi removido do evento " + nome + " com reembolso total do ingresso para a pista.");
			}
		else {
			System.out.println("Participante não encontrado!");
		}
	}
	

}

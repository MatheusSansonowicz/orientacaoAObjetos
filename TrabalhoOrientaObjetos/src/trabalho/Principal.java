package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<String> palestra = new ArrayList<>();
        palestra.add("João");
        palestra.add("Ana");

        EventoConferencia conferencia = new EventoConferencia("Conferência de Tecnologia", palestra);
        conferencia.adicionarParticipacao("Alice");
        conferencia.cancelarParticipacao("Alice");
        conferencia.cancelarParticipacao("Ana");
        conferencia.cancelarParticipacao("Anao");
        
        List<String> VIPSShow = new ArrayList<String>();
        List<String> pistaShow = new ArrayList<String>();
        EventoShow show = new EventoShow("Show de Rock", VIPSShow, pistaShow);
        show.adicionarParticipacao("Bob", 1);
        show.adicionarParticipacao("Alice", 2);
        //se não houvesse sobreescritas em ambas as classes derivadas, Alice seria barrada por estar já na lista base
        show.cancelarParticipacao("Bob");
        show.cancelarParticipacao("Alice");
	}

}

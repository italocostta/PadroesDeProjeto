import java.util.Arrays;
import java.util.List;

public class Identificado implements State{
    
    private Quiosque contexto;

    public Identificado(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setEstado(new EmEspera(contexto));
    }

    public boolean validarRegistro(String matricula) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar registro no estado de identificado.");
    }

    
    public boolean validarCurso(String curso) throws Exception {
        List<String> cursosDisponiveis = Arrays.asList("ChatGPT em Detalhes", "Blockchain", "IoT", "Realidade Virtual");
        return cursosDisponiveis.contains(curso);
    }

    
    public boolean validarCartao(CartaoCredito card) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar cartão no estado de espera.");
    }

    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Não é possível criar inscrição no estado de espera.");
    }
    
}

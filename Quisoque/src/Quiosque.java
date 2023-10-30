import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Quiosque {

    private State contexto;

    public Quiosque() {
        contexto = new EmEspera(this);
    }

    public void setState(Processando processando) {
        contexto = processando;
    }

    public void validarRegistro(String matricula) throws Exception {
        contexto.validarRegistro(matricula);
    }

    public void validarCurso(String curso) throws Exception {
        contexto.validarCurso(curso);
    }


    public void criarInscricao() throws Exception {
        contexto.criarInscricao();
    }

    public void setAluno(String matricula) {
    }

    public void setState(Identificado identificado) {
    }

    public void setState(Inscrito inscrito) {
    }

    public Object getCurso() {
        return null;
    }

    
}

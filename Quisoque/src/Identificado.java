import java.util.Map;

public class Identificado implements State{

    private Quiosque contexto;

    public Identificado(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setState(new Processando(contexto));
    }

    public boolean validarRegistro(String matricula) {
        throw new UnsupportedOperationException("Usuário já identificado");
    }

    public boolean validarCurso(String curso) throws Exception {
        BancoCursos bancoCursos = new BancoCursos();
        Map<String, Cursos> cursos = bancoCursos.getCursos();
        
        if (cursos.containsKey(curso)) {
            if (cursos.get(curso).getAlunos().size() < cursos.get(curso).getCapacidadeAluno()) {
                mudarEstado();
                return true;
            } else {
                throw new Exception("Curso atingiu a capacidade máxima de alunos");
            }
        } else {
            throw new Exception("Curso não encontrado");
        }
    }

    public boolean validarCartao(CartaoCredito card) throws Exception {
    
        throw new UnsupportedOperationException("Não pode validar cartão no estado emEspera");
    }

    public String criarInscricao() throws Exception {
     
        throw new UnsupportedOperationException("Não pode criar ticket no estado emEspera");
    }

}

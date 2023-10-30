import java.util.List;
import java.util.Map;

public class Quiosque {

    private State state;
    private String student;
    private Cursos course;

    BancoCursos bancoCurso = new BancoCursos();
    BancoEstudantes bancoEstudante = new BancoEstudantes();

    public Quiosque() {
        this.state = new EmEspera(this);
    }

    public void mudarEstado() {
        this.state.mudarEstado();
    }

    public List<Cursos> getCursos() {
    
        return bancoCurso.getCursos().entrySet().stream().map(Map.Entry::getValue).toList();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean validarRegistro(String input) throws Exception {
        return state.validarRegistro(input);
    }

    public boolean validarCartao(CartaoCredito card) throws Exception {
        return state.validarCartao(card);
    }

    public boolean validarCurso(String course) throws Exception {
        return state.validarCurso(course);
    }

    public String criarInscricao() throws Exception {
        return state.criarInscricao();
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return this.student;
    }

    public void setCourse(Cursos course) {
        this.course = course;
    }

    public Cursos getCourse() {
        return this.course;
    }

    public boolean hasAvailableCourse() {
        for(Map.Entry<String, Cursos> curso : bancoCurso.getCursos().entrySet()) {
            if (curso.getValue().getAlunos().size() < curso.getValue().getCapacidadeAluno()) {
                return true;
            }
        }
        return false;
    }

    public void setAluno(String matricula) {
    }
}

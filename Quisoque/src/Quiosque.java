import java.util.List;

class Quiosque {

    private State estado;
    private String aluno;
    private Cursos curso;

    public Quiosque() {
        this.estado = new EmEspera(this);
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public State getEstado() {
        return this.estado;
    }

    public String getAluno() {
        return this.aluno = aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Cursos getCurso() {
        return this.curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public void mudarEstado() {
        this.estado.mudarEstado();
    }

    public boolean validarRegistro(String matricula) throws Exception {
        return estado.validarRegistro(matricula);
    }

    public boolean validarCurso(String curso) throws Exception {
        return estado.validarCurso(curso);
    }

    public boolean validarCartao(CartaoCredito card, Cursos curso) throws Exception {
        return estado.validarCartao(card);
    }

    public String criarInscricao() throws Exception {
        return estado.criarInscricao();
    }
}
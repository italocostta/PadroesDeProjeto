import java.util.List;

class Quiosque {

    private State estado;
    private List<Cursos> cursos;
    private List<CartaoCredito> cartoes;
    private List<Aluno> alunos;

    public Quiosque() {
        this.estado = new EmEspera(this);
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public State getEstado() {
        return estado;
    }

    public void mudarEstado() {
        estado.mudarEstado();
    }

    public boolean validarRegistro(String matricula) throws Exception {
        return estado.validarRegistro(matricula);
    }

    public boolean validarCurso(String course) throws Exception {
        return estado.validarCurso(course);
    }

    public boolean validarCartao(CartaoCredito card, Cursos curso) throws Exception {
        return estado.validarCartao(card, curso);
    }

    public String criarInscricao() throws Exception {
        return estado.criarInscricao();
    }

    public void addCurso(Cursos curso) {
        cursos.add(curso);
    }

    public void addCartao(CartaoCredito cartao) {
        cartoes.add(cartao);
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removeCurso(Cursos curso) {
        cursos.remove(curso);
    }

    public void removeCartao(CartaoCredito cartao) {
        cartoes.remove(cartao);
    }

    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Cursos getCurso(String course) {
        for (Cursos curso : cursos) {
            if (curso.getName().equals(course)) {
                return curso;
            }
        }
        return null;
    }

    public CartaoCredito getCartao(String card) {
        for (CartaoCredito cartao : cartoes) {
            if (cartao.getNumero().equals(card)) {
                return cartao;
            }
        }
        return null;
    }
}
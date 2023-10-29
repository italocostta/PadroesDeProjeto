public class Inscrito implements State {

    private Quiosque contexto;

    public Inscrito(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setEstado(new Finalizado(contexto));
    }

    public boolean validarRegistro(String matricula) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar registro no estado de inscrito.");
    }

    public boolean validarCurso(String course) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar curso no estado de inscrito.");
    }

    
    public boolean validarCartao(CartaoCredito card, Cursos curso) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar cartão no estado de inscrito.");
    }

    public String criarInscricao() throws Exception {
        mudarEstado();
        return "Inscrição criada com sucesso!";
    }
    
}

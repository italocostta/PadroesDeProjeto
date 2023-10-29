public class Finalizado implements State{
    
    private Quiosque contexto;

    public Finalizado(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setEstado(new EmEspera(contexto));
    }

    public boolean validarRegistro(String matricula) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar registro no estado de finalizado.");
    }

    public boolean validarCurso(String course) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar curso no estado de finalizado.");
    }

    public boolean validarCartao(CartaoCredito card, Cursos curso) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar cartão no estado de finalizado.");
    }

    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Não é possível criar inscrição no estado de finalizado.");
    }

}

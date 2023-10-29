public class Processando implements State {
    
    private Quiosque contexto;

    public Processando(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setEstado(new Inscrito(contexto));
    }

    public boolean validarRegistro(String matricula) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar registro no estado de processando.");
    }

    public boolean validarCurso(String course) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar curso no estado de processando.");
    }

    public boolean validarCartao(CartaoCredito card) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar cartão no estado de processando.");
    }

    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Não é possível criar inscrição no estado de processando.");
    }

}

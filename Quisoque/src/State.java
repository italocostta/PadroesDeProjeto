public interface State {
    
    public void mudarEstado();

    public boolean validarRegistro(String matricula) throws Exception;

    public boolean validarCurso(String course) throws Exception;

    public boolean validarCartao(CartaoCredito card, Cursos curso) throws Exception;

    public String criarInscricao() throws Exception;
}

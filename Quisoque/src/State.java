public interface State {
    
    public void mudarEstado();

    public boolean validarRegistro(String matricula) throws Exception;

    public boolean validarCurso(String curso) throws Exception;

    public String criarInscricao() throws Exception;
}

public class EmEspera implements State{
    private Quiosque contexto;

    public EmEspera(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setEstado(new Identificado(contexto));
    }

    public boolean validarRegistro(String matricula) {
        if (matricula != null && !matricula.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarCurso(String course) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar curso no estado de espera.");
    }

    
    public boolean validarCartao(CartaoCredito card) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar cartão no estado de espera.");
    }

    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Não é possível criar inscrição no estado de espera.");
    }
}
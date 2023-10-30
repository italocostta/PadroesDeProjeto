
public class Inscrito implements State{

    private Quiosque contexto;


    public Inscrito(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setState(new EmEspera(contexto));
    }

    public boolean validarRegistro(String input) throws Exception {
        throw new UnsupportedOperationException("Você já inseriu a matrícula");
    }

    public boolean validarCartao(CartaoCredito card) throws Exception {
        throw new UnsupportedOperationException("Não é possível validar o cartão de crédito no estado de finalizado");
    }

    public boolean validarCurso(String course) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateCourse'");
    }


    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Ticket já foi criado");
    }

}

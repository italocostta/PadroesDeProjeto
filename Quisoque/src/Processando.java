
public class Processando implements State{

    private Quiosque contexto;

    public Processando(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setState(new Inscrito(contexto));
    }

    public boolean validarRegistro(String matricula) {
        throw new UnsupportedOperationException("Usuário já identificado");
    }

    public boolean validarCartao(CartaoCredito card) {
        if(card.getCredit() >= 100){
            mudarEstado();
            return true;
        }else{
            return false;
        }
    }

    public boolean validateRegistration(String matricula) {
        throw new UnsupportedOperationException("Não pode validar curso no estado Processando");
    }

    public boolean validarCurso(String course) throws Exception {
        throw new UnsupportedOperationException("Não pode validar curso no estado Processando");
    }

    public String criarInscricao() throws Exception {
        throw new UnsupportedOperationException("Não pode criar ticket no estado Processando");
    }

}

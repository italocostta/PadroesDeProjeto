public class EmEspera implements State {

    private Quiosque contexto;

    public EmEspera(Quiosque contexto) {
        this.contexto = contexto;
    }

    public void mudarEstado() {
        contexto.setState(new Identificado(contexto));
    }

    public boolean validarRegistro(String matricula) {
        BancoEstudantes bancoEstudantes = new BancoEstudantes();
        contexto.setAluno(matricula);

        if (bancoEstudantes.contains(matricula)) {
            mudarEstado();
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean validarCurso(String curso) throws Exception {

        throw new UnsupportedOperationException("Não pode validar curso no estado emEspera");
    }

    public String criarInscricao() throws Exception {
     
        throw new UnsupportedOperationException("Não pode criar ticket no estado emEspera");
    }


}

public class Aluno {

    private String aluno;

    public Aluno(String aluno) {
        this.aluno = aluno;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        if (aluno == null || aluno.isEmpty()) {
            throw new UnsupportedOperationException("Matrícula inválida");
        }
        this.aluno = aluno;
    }
    
}

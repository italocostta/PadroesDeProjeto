import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private String nome;
    private Double valorCurso;
    private int alunosMax = 10;
    private List<String> alunos = new ArrayList<String>();

    public Cursos(String nome, Double valorCurso) {
        this.nome = nome;
        this.valorCurso = valorCurso;
    }

    public String getNome() {
        return nome;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public int getAlunosMax() {
        return alunosMax;
    }


   public boolean addAluno(String aluno) {
        if (alunos.size() < alunosMax) {
            alunos.add(aluno);
            return true;
        } else {
            return false;
        }
    }

}

import java.util.ArrayList;
import java.util.List;

public class Cursos {
    private String name;
    private Double valorCurso;
    private List<String> alunos = new ArrayList<String>();

    public Cursos(String name, Double valorCurso) {
        this.name = name;
        this.valorCurso = valorCurso;
    }

    public String getName() {
        return name;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public boolean addStudent(String aluno) {
        return !alunos.add(aluno);
    }
    
}

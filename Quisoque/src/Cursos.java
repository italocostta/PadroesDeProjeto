import java.util.ArrayList;
import java.util.List;

public class Cursos {

    private String nome;
    private Double preco;
    private int capacidadeAluno = 10;
    private List<String> alunos = new ArrayList<String>();

    public Cursos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getCapacidadeAluno() {
        return capacidadeAluno;
    }

    public boolean addAluno(String aluno) {
        if (alunos.size() < capacidadeAluno) {
            alunos.add(aluno);
            return true;
        }
        return false;
    }

    public List<String> getAlunos() {
        return alunos;
    }
    
}

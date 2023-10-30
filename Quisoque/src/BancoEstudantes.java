import java.util.ArrayList;
import java.util.List;

public class BancoEstudantes {

    private List<String> alunos = new ArrayList<String>();

    BancoEstudantes() {
        alunos.add("20202370005");
        alunos.add("20202370006");
        alunos.add("20202370007");
    }

    public boolean contains(String student) {
        return alunos.contains(student);
    }
}

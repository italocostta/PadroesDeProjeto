import java.util.HashMap;
import java.util.Map;

public class BancoCursos {

    private Map<String, Cursos> cursos;

    BancoCursos () {
        if (cursos == null) {
            cursos = new HashMap<String, Cursos>();
            cursos.put("BLOCKCHAIN", new Cursos("BLOCKCHAIN",90.00));
            cursos.put("GPT", new Cursos("GPT", 100.00));
            cursos.put("VR", new Cursos("VR", 70.00));
            cursos.put("IOT", new Cursos("IOT", 80.00));
        }

    }

    public Cursos getCurso(String name) {
        return cursos.get(name);

    }

    public Map<String, Cursos> getCursos() {
        return cursos;
    }
    
    
}

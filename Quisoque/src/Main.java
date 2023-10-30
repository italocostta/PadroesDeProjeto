import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiosque contexto = new Quiosque();
        double saldo = 0.0; // Saldo inicial do usuário

        while (true) {
            if (!contexto.hasAvailableCourse()) {
                System.out.println("Não há mais cursos disponíveis");
                break;
            }
            if (contexto.getState() instanceof EmEspera) {
                System.out.print("Digite a matrícula do aluno: ");
                String matricula = sc.nextLine();
                try {
                    boolean valid = contexto.validarRegistro(matricula);
                    if (valid) {
                        System.out.println("Matrícula válida");
                    } else {
                        System.out.println("Matrícula inválida");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if (contexto.getState() instanceof Identificado) {
                List<String> availableCourses = new ArrayList<>();
                availableCourses.add("GPT");
                availableCourses.add("BLOCKCHAIN");
                availableCourses.add("IOT");
                availableCourses.add("VR");

                System.out.println("Cursos disponíveis:");
                for (int i = 0; i < availableCourses.size(); i++) {
                    System.out.println((i + 1) + " - " + availableCourses.get(i));
                }

                System.out.print("Escolha o número do curso: ");
                int selectedCourseIndex = sc.nextInt();
                if (selectedCourseIndex < 1 || selectedCourseIndex > availableCourses.size()) {
                    System.out.println("Curso inválido");
                    continue;
                }

                String selectedCourse = availableCourses.get(selectedCourseIndex - 1);

                try {
                    boolean valid = contexto.validarCurso(selectedCourse);
                    if (valid) {
                        System.out.println("Curso escolhido com sucesso: " + selectedCourse);
                    } else {
                        System.out.println("Curso indisponível");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if (contexto.getState() instanceof Inscrito) {
                System.out.print("Digite o valor desejado: ");
                double valorDesejado = sc.nextDouble();
                
                if (valorDesejado > saldo) {
                    System.out.println("Saldo insuficiente. Seu saldo é: " + saldo);
                    continue;
                }

                try {
                    System.out.println("Ticket criado: " + contexto.criarInscricao());
                    saldo -= valorDesejado; // Deduzir o valor do saldo
                    System.out.println("Saldo restante: " + saldo);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else {
                contexto.mudarEstado();
            }
        }
    }
}

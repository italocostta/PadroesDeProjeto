import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quiosque contexto = new Quiosque();

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
                System.out.println("Cursos disponíveis");
                System.out.println("1 - GPT");
                System.out.println("2 - BLOCKCHAIN");
                System.out.println("3 - IOT");
                System.out.println("4 - VR");

                System.out.print("Escolha o curso: ");
                int curso = sc.nextInt();
                try {
                    if (curso > 4) {
                        System.out.println("Curso inválido");
                    } else {
                        boolean valid = false;
                        switch (curso) {
                            case 1:
                                valid = contexto.validarCurso("GPT");
                                break;
                            case 2:
                                valid = contexto.validarCurso("BLOCKCHAIN");
                                break;
                            case 3:
                                valid = contexto.validarCurso("IOT");
                                break;
                            case 4:
                                valid = contexto.validarCurso("VR");
                                break;
                            default:
                                System.out.println("Curso inválido");
                                continue;
                        }

                        if (valid) {
                            System.out.println("Curso escolhido com sucesso");
                        } else {
                            System.out.println("Curso indisponível");
                            continue;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if (contexto.getState() instanceof Processando) {
                sc.nextLine();
            
                CartaoCredito cartao = new CartaoCredito();
                try {
                    boolean valido = contexto.validarCartao(cartao);
                    if (valido) {
                        System.out.println("Cartão validado com sucesso!");
                    } else {
                        System.out.println("Cartão inválido");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if(contexto.getState() instanceof Inscrito) {
                System.out.println("Inscrição finalizada com sucesso!");
                System.out.println("Deseja realizar outra inscrição? (S/N)");
                String opcao = sc.nextLine();
                if (opcao.equals("S")) {
                    contexto.setState(new EmEspera(contexto));
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}

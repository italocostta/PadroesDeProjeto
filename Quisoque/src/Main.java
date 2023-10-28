public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        // Simulação do fluxo de atividades
        kiosk.request(); // EmEspera
        kiosk.setState(new IdentifiedState());
        kiosk.request(); // Identificado
        kiosk.setState(new ProcessingState());
        kiosk.request(); // Processando
        kiosk.setState(new RegisteredState());
        kiosk.request(); // Inscrito
        kiosk.setState(new FinishedState());
        kiosk.request(); // Finalizado
    }
}
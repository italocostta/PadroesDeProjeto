class WaitingState implements State {
    @Override
    public void handle(Kiosk kiosk) {
        // Implementação do estado EmEspera
    }
}

class IdentifiedState implements State {
    @Override
    public void handle(Kiosk kiosk) {
        // Implementação do estado Identificado
    }
}

class ProcessingState implements State {
    @Override
    public void handle(Kiosk kiosk) {
        // Implementação do estado Processando
    }
}

class RegisteredState implements State {
    @Override
    public void handle(Kiosk kiosk) {
        // Implementação do estado Inscrito
    }
}

class FinishedState implements State {
    @Override
    public void handle(Kiosk kiosk) {
        // Implementação do estado Finalizado
    }
}
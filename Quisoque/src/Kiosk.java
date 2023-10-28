class Kiosk {
    private State state;

    public Kiosk() {
        this.state = new WaitingState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
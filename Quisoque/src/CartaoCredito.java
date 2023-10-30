public class CartaoCredito {
    private Double credit = 100.00;

    public CartaoCredito() {}

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit -= credit;
    }
}

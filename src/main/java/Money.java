import java.math.BigDecimal;

public class Money {

    private BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money incremenet(Money value) {
        return new Money(this.amount = this.amount.add(value.amount));
    }

    public void decrement(Money money) {
        this.amount = this.amount.subtract(money.amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount.equals(money.amount);
    }

    @Override
    public int hashCode() {
        return amount.hashCode();
    }
}

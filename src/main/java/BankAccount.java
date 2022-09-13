import java.math.BigDecimal;

public class BankAccount {

    private Money balance;

    public BankAccount(Money balance) {
        this.balance = balance;
    }

    //deposit
    public Money deposit(Money money) {
        return this.balance.incremenet(money);
    }

    //withdrawl
    public void withdrawl(Money money) {
        this.balance.decrement(money);
    }
}


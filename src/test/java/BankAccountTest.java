import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void shouldDeposit() {
        //given
        BankAccount bankAccount = new BankAccount(new Money(new BigDecimal(0)));
        Money amountToIncrement = new Money(new BigDecimal(100));
        //when
        Money currentDeposit = bankAccount.deposit(amountToIncrement);
        //then
        Assertions.assertEquals(amountToIncrement, currentDeposit);
    }


}
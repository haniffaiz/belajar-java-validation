package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.VirtualAccountPaymentGroup;

public class MessageInterpolationTest  extends AbstractValidatorTest{

    @Test
    void testMessage() {

        Payment payment = new Payment();
        payment.setOrderId("21343133245342655345");
        payment.setVirtualAccount("2342");
        payment.setAmount(10L);

        validateWithGroups(payment, VirtualAccountPaymentGroup.class);

    }
}

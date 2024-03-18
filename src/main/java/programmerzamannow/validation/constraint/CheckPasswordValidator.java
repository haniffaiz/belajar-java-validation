package programmerzamannow.validation.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import programmerzamannow.validation.Register;

public class CheckPasswordValidator implements ConstraintValidator<CheckPassword, Register> {

    @Override
    public boolean isValid(Register value, ConstraintValidatorContext constraintValidatorContext) {
        if (value.getPassword() == null || value.getRetypePassword() == null){
            return true;
        }
        return value.getPassword().equals(value.getRetypePassword());
    }
}

package io.github.cainaoliboni.validation.constraintValidator;

import io.github.cainaoliboni.validation.NotEmptyList;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidator implements ConstraintValidator<NotEmptyList, List> {
    @Override
    public boolean isValid(List list,
                           ConstraintValidatorContext constraintValidatorContext) {
        return !CollectionUtils.isEmpty(list);
    }

    @Override
    public void initialize(NotEmptyList constraintAnnotation) {

    }
}

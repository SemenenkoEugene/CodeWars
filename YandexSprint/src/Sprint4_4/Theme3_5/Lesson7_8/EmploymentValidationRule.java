package Sprint4_4.Theme3_5.Lesson7_8;

// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}

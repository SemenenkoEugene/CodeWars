package Sprint4_4.Theme3_5.Lesson7_8;

// Дополните класс для проверки возраста пользователя
public class AgeValidationRule extends ValidationRule<Byte> {

    public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return value >= 18;
    }

}

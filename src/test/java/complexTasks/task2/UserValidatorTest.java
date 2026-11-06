package complexTasks.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
/*Функциональные требования:
Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
Проверка email: Email должен соответствовать стандартному формату электронной почты.
Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.
*/
    private UserValidator validator;
    @BeforeEach
    public void setup(){
        validator = new UserValidator();
    }

    //Управление валидацией:
    public static Stream<Arguments> provideInvalidUser() {
        return Stream.of(Arguments.of(new User("12!@#Sasha", 10, "13> @sas21>USDF@")));
    }
    @ParameterizedTest
    @MethodSource("provideInvalidUser")
    public void validatorPassUserWhenValidationDisabled(User user){
        UserValidator.setValidationEnabled(false);
        try {
            assertDoesNotThrow(() -> validator.validate(user));
        } finally {
            UserValidator.setValidationEnabled(true);
        }
    }











}

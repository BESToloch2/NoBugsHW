package complexTasks.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    private UserValidator validator;
    @BeforeEach
    public void setup(){
        validator = new UserValidator();
        UserValidator.setValidationEnabled(true);
    }

    //Управление валидацией:
    //validationEnabled = false;
    public static Stream<Arguments> provideInvalidUser() {
        return Stream.of(Arguments.of(new User("12!@#Sasha", 10, "13> @sas21>USDF@")));
    }
    @ParameterizedTest
    @MethodSource("provideInvalidUser")
    public void validatorPassUserWhenValidationDisabled(User user){
        UserValidator.setValidationEnabled(false);
            assertDoesNotThrow(() -> validator.validate(user));
    }
    //validationEnabled = true;
    @ParameterizedTest
    @MethodSource("provideInvalidUser")
    public void validatorRejectInvalidUser(User user){
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    //Проверка имени:
    public static Stream<Arguments> provideValidUser(){
                                            //also checking age boundary values
        return Stream.of(Arguments.of(new User("Sasha", 18, "beebeb@gmai.com")),
                Arguments.of(new User("Sasha", 100, "beebeb@gmai.com")));
    }
    @ParameterizedTest
    @MethodSource("provideValidUser")
    public void validatorPassUserWithValidName(User user){
        assertDoesNotThrow(() -> validator.validate(user));
    }
    public static Stream<Arguments> provideUserWithInvalidName(){
        return Stream.of(Arguments.of(new User("", 30, "emailmail@gmail.ua")),
                        Arguments.of(new User("alex", 30, "michael_23@example.net")));
    }
    @ParameterizedTest
    @MethodSource("provideUserWithInvalidName")
    public void validatorRejectUserWithValidName(User user){
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    //Проверка возраста:
    public static Stream<Arguments> provideUserWithInvalidAge(){
        return Stream.of(Arguments.of(new User("Masha", 17, "alex.smith@example.com")),
                Arguments.of(new User("Ira", 101, "sasha1990@example.org")));
    }
    @ParameterizedTest
    @MethodSource("provideUserWithInvalidAge")
    public void validatorRejectUserWithInvalidAge(User user){
        InvalidUserException exception = assertThrows(
                InvalidUserException.class,
                () -> validator.validate(user)
        );
        assertEquals("Age must be between 18 and 100", exception.getMessage());
    }

    //Проверка email:
    public static Stream<Arguments> provideUserWithInvalidEmail(){
                                        // Отсутствует @
        return Stream.of(Arguments.of(new User("Andrey", 44, "alexexample.com")),
                                // Отсутствует доменная зона (.com, .org и т. д.)
                Arguments.of(new User("Pavel", 70, "sasha@example")));
    }
    @ParameterizedTest
    @MethodSource("provideUserWithInvalidEmail")
    public void validatorRejectUserWithInvalidEmail(User user){
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }
}

package complexTasks.task2;

public class UserValidator {
    private static boolean validationEnabled;

    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    public void validate(User user) {
        if (validationEnabled) {
            if (user == null) {
                throw new InvalidUserException(user + " can`t store null value");
            }
            validateAge(user);
            validateName(user);
            validateEmail(user);
        }
    }

    //Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    private void validateName(User user) {
        String name = user.getName();
        if (name == null) {
            throw new InvalidUserException("Name can`t store null value");
        }
        if (name.isEmpty()) {
            throw new InvalidUserException("User name can`t be empty");
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new InvalidUserException("User name must contain only letters");
        }

        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("User name should star with upper case");
        }
    }

    //Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    private void validateAge(User user) {
        int age = user.getAge();
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Age must be between 18 and 100");
        }
    }

    //Проверка email: Email должен соответствовать стандартному формату электронной почты.
    private void validateEmail(User user) {
        String email = user.getEmail();
        if (email == null) {
            throw new InvalidUserException("Email can`t store null value");
        }
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidUserException("Invalid email format");
        }
    }
}
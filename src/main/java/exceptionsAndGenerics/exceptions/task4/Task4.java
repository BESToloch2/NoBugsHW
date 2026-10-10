package exceptionsAndGenerics.exceptions.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    //4. Создание и использование собственного непроверяемого исключения
    //Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.

    public static boolean isEmailValid(String email){
        Pattern pattern = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()){
            throw new InvalidEmailException("Invalid email exception");
        }
        return true;
    }


}

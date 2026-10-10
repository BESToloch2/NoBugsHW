package exceptionsAndGenerics.exceptions.task3;

public class InvalidAgeException extends Exception{
    //3. Создание и использование собственного проверяемого исключения
    //Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.

    public InvalidAgeException(String message){
        super(message);
    }


}

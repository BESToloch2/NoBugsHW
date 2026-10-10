package exceptionsAndGenerics.exceptions.task3;

public class Task3 {

    //3. Создание и использование собственного проверяемого исключения
    //Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.

    public static boolean validAgeCheck(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("invalid age");
        }
        return true;
    }

    public static void main(String[] args) {
        try{System.out.println(validAgeCheck(-2));}
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        try{System.out.println(validAgeCheck(21));}
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        try{System.out.println(validAgeCheck(200));}
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

package junitHW;

public class Task10_IsPhoneNumberValid {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}

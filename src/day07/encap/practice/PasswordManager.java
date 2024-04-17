package day07.encap.practice;

public class PasswordManager {

    //필드
    private String password;

    //생성자
    public  PasswordManager (String password) {
        this.password = password;
    }
    public boolean changePassword(String oldPassword, String newPassword) {
        if (oldPassword != newPassword) {
            return true;
        }
        return false;
    }
}

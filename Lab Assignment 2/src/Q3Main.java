public class Q3Main {
    public static void main(String[] args) {
//        String password = Password.generator(16,5,5);
//        System.out.println("Password: " +password);
//        Password.validator(password);

        String password1 = Password.generator(6,2,1);
        System.out.println("Password1: " +password1);
        Password.validator(password1);

        String password2 = Password.generator(14,4,5);
        System.out.println("Password2: " +password2);
        Password.validator(password2);

        String password3 = Password.generator(9,2,3);
        System.out.println("Password3: " +password3);
        Password.validator(password3);

        String password4 = Password.generator(9,2,2);
        System.out.println("Password4: " +password4);
        Password.validator(password4);

        String password5 = Password.generator(18,5,6);
        System.out.println("Password5: " +password5);
        Password.validator(password5);
    }
}
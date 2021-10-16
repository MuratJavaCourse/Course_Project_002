import java.util.Scanner;

public class CourseAppOne {
    public static void main(String[] args) {

        /*
            **** GET INPUTS ****
            - User Name ***
            - Password ***

            **** USER NAME ****
            - En Az 3 Karekter Olacak ***
            - (?!*) Olmayacak ***

            **** PASSWORD ****
            - Büyük ve Küçük harf olacak ***
            - Özel Karakter içerecek ***
            - rakam içerecek ***
            - En az 8 karakter olacak ***

            -- OLUŞAN EKSİKLİKLER KULLANICIYA BELİRTİLECEK ***
        */

        // VARIABLES
        String username;
        String password;
        char[] usernameDebugging;
        char[] passwordDebugging;

        // CONTROL VARIABLES
        boolean isPasswordTrue = true;
        boolean isUsernameTrue = true;

        // CLASSES
        Scanner input = new Scanner(System.in);

        // USER GET VALUES
        System.out.print("Kullanıcı Adınız..: ");
        username = input.nextLine();

        System.out.print("Şifreniz..: ");
        password = input.next();

        try {
            if (username.length() < 3) {
                System.err.println("Kullanıcı Adınız en az 3 karakter olmalıdır!!!");
            } else {
                usernameDebugging = new char[username.length()];

                for (int i = 0; i < usernameDebugging.length; i++) {
                    if (!((username.charAt(i) > 64 && username.charAt(i) < 91) || (username.charAt(i) > 96 && username.charAt(i) < 123) || (username.charAt(i) > 47 && username.charAt(i) < 58) || username.charAt(i) == 32)) {
                        isUsernameTrue = false;
                    }
                }

                if (!isUsernameTrue)
                    System.err.println("Kullanıcı Adı Hatası: Özel Karakter içeremez");

            }

            if (password.length() < 8) {
                isPasswordTrue = false;
                System.err.println("Şifreniz en az 8 karakter olmalıdır!!!");
            } else {
                passwordDebugging = new char[password.length()];

                for (int i = 0; i < passwordDebugging.length; i++) {
                    if (!((password.charAt(i) > 64 && password.charAt(i) < 91) || (password.charAt(i) > 96 && password.charAt(i) < 123) || (password.charAt(i) > 47 && password.charAt(i) < 58) || (password.charAt(i) > 32 && password.charAt(i) < 48))) {
                        isPasswordTrue = false;
                    }
                }

                if (!isPasswordTrue) {
                    System.err.println("Şifre Hatası: ");
                    System.err.println("- Büyük ve Küçük harf Olmalı!!");
                    System.err.println("- Rakam İçermeli");
                    System.err.println("- Özel karakter bulundurmalı");
                }
            }

            if (isUsernameTrue && isPasswordTrue) {
                System.out.println();
                System.out.println("*********************");
                System.out.println("*** GİRİŞ YAPILDI ***");
                System.out.println("*********************");
            }else{
                System.err.println();
                System.err.println("**************");
                System.err.println("**** HATA ****");
                System.err.println("**************");
            }
        }catch (StringIndexOutOfBoundsException $e){
            System.out.println($e.getMessage());
        }




    }
}

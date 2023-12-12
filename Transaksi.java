import java.util.Scanner;

public class Transaksi implements Login {
    String password = "semogaberkah";
    String captcha = "B8MwS2v";
    String inputCaptcha;
    String inputPassword;

    //method login
    public void login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI SUPER MARKET");
        System.out.println("================================");
        System.out.println("LOG IN");

        System.out.println("Masukkan Password");
        inputPassword = scanner.next();

        while(!inputPassword.equals(password)){
            System.out.println("PASSWORD SALAH\n");
            System.out.println("Masukkan password : ");
            inputPassword = scanner.next();
        }
        
        System.out.println("BERHASIL\n\n");

        System.out.println("Kode captcha = " + captcha);
        System.out.println("Masukkan captcha");
        inputCaptcha = scanner.next();

        while(!inputCaptcha.equalsIgnoreCase(captcha)){
            System.out.println("GAGAL\n");
            System.out.println("Masukkan captcha");
            inputCaptcha = scanner.next();
        }

        System.out.println("BERHASIL\n\n");

    }
}


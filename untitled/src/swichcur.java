import java.util.Scanner;
public class swichcur {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap USD ban muon chuyen: ");
        int USD = scanner.nextInt();
        int VND = USD * rate;
        System.out.println(" VND = "+ VND + " VND" );


    }
}

import java.util.Scanner;

public class timSoChiaHetCho3Va5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so bat ky");
        int n = input.nextInt();
        if (n % 3 == 0){
            System.out.println(n + "chia het cho 3");

        }else {
            System.out.println("khong chia het cho 3 ");
        }

        System.out.println("nhap vao so bat ky");
        int n1 = input.nextInt();
        if (n1 % 5 == 0){
            System.out.println(n1 + "chia het cho 5");
        }else {
            System.out.println("khong chia het cho 5 ");
        }
    }
}

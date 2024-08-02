import java.sql.SQLOutput;
import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai 1 canh cua hinh vuong");
        float side = sc.nextFloat();
        float chuVi = 4 * side;
        System.out.println("chu vi hinh vuong la" +chuVi);
        System.out.println("nhap chieu dai 1 canh hinh vuong");
        double canh = sc.nextDouble();
        double dienTich = canh * canh;;
        System.out.println("dien tich hinh vuong la" + dienTich);

    }
}

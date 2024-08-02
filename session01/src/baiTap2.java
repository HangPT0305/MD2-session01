import java.util.Scanner;

public class baiTap2 {
    public static void main(String[] args) {
        final int TG = 160;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien");
        double monNey = sc.nextDouble();
        double vnd = TG * monNey;
        System.out.println("tong tien la:" + vnd);

    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao diem mon Toan");
        int toan = sc.nextInt();
        System.out.println("nhap vao diem mom Van");
        int van = sc.nextInt();
        System.out.println("nhap vao diem mon Anh");
        int anh = sc.nextInt();
        double diemTb = (toan + anh + van) / 3;
        System.out.println(diemTb);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        Fibonacci fibonacci = new Fibonacci();
        NGiaiThua nGiaiThua = new NGiaiThua();

        System.out.println("**----------------------------------------------------**");

        System.out.println("Nhập số 1 - Chương trình liệt kê n số nguyên tố đầu tiên");
        System.out.println("Nhập số 2 - Chương trình liệt kê các số nguyên tố nhỏ hơn 100");
        System.out.println("Nhập số 3 - Chương trình liệt kê n số fibonacci đầu tiên");
        System.out.println("Nhập số 4 - Chương trình tính n!");

        System.out.println("\nNhập -1 để thoát chương trình");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        soNguyenTo.SoNguyenTo1();
                        break;
                    case 2:
                        soNguyenTo.SoNguyenTo2();
                        break;
                    case 3:
                        fibonacci.fibonacci1();
                        break;
                    case 4:
                        nGiaiThua.nGiaiThua();
                        break;
                    default:
                        System.out.println("Không có bài tập này. Hãy chọn từ 1 -> 4");
                        System.out.println("Nhập -1 để thoát chương trình");
                        break;
                }
            }
        } while (number >= 0);
    }
}

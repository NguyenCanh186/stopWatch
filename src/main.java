import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice;
        var dongho = new stopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. bat dau");
        System.out.println("2. dung");
        System.out.println("3. lay thoi gian");
        System.out.println("4. thoat");
        System.out.println("nhap lua chon cua ban");
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("bat dau");
                    dongho.start();
                    break;
                case 2:
                    System.out.println("dung");
                    dongho.stop();
                    break;
                case 3:
                    System.out.println("lay thoi gian");
                    System.out.println(dongho.dem());
                    break;
            }
        } while (choice != 4);
    }
}

import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nilai = sc.next();

        switch (nilai) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;

            default:
                System.out.println(" invalid grade");
        }
    }
}

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Da: ");
        int num;
        num =new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num; j > 0; j--) {
                if(i*j==num){
                    System.out.println(i+" * "+j);
                }
            }
        }
    }
}

import java.util.Scanner;
public class kitle {
    public static void main(String[] args) {
        double boy;
        int kg;

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen kg gir:");
        kg = input.nextInt();
        System.out.println("lütfen boy gir:");
        boy = input.nextDouble();

        double index = kg / (boy * boy);
        System.out.println("indexiniz :" + index);



    }
}

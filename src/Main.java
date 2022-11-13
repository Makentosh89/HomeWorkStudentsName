import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Заполните массив с именами студентов type String , получить имена от пользователя,
         выведите сколько лет пользователю используя имя.
         */
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();

        String [] name=new String[3];
        int[] age =new int[3];

        int year =0;
        for (int i=0;i< name.length;i++){
            System.out.println("Как вас зовут ? ");
            name[i]=scanner.nextLine();
            System.out.println("Приятно познакомится , "+name[i]);
        }
        for (int i=0;i< age.length;i++){
            System.out.println("В каком году вы родились ?"+name[i]);
            age[i]=scanner.nextInt();
            year=2022-age[i];
            System.out.println(name[i]+",Вам "+year+" лет,год,года");
        }
    }
}

/*
Nim  : 13020220103
Nama : Muh Rafli Rahman
Minggu, 10/03/2024
 */
import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args){
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;

        System.out.print ("Print i dengan WHILE: \n");
        while (i <= N) {
            System.out.println (i);
            i++;
        }
    }
}

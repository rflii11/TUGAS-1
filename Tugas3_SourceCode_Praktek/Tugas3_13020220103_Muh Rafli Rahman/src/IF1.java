/*
Nim  : 13020220103
Nama : Muh Rafli Rahman
Minggu, 10/03/2024
 */
import java.util.Scanner;
public class IF1 {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int a;

        System.out.print("Contoh IF satu kasus \n");
        System.out.print("Ketikkan Suatu Nilai Integer :");
        a = masukan.nextInt();
        if (a >= 0)
            System.out.print("\nNilai a Positif " + a);
    }
}

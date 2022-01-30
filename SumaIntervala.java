//2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].

package Domaci0912;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int m = s.nextInt();

        System.out.print("Unesite drugi broj: ");
        int n = s.nextInt();

        int zbir = 0;

        if( m <= n){
            for(int i = m; i <= n; i++){
                zbir = zbir + i;
            }
        }

        System.out.print("Suma brojeva od " + m + " do " + n + " je " + zbir);

    }
}


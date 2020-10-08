package examenes;

import java.util.Scanner;

public class Examenn3 {
    public static void main(String[] args) {
        int i;
        String[] nombres = new String [5];
        int [] Sem18 = new int [5];
        int [] Sem19 = new int [5];
        int [] anio = new int [5];
        Scanner leer=new Scanner (System.in);
        for(i=0;i<=4;i++)
        {
            System.out.println("Nombre "+i);
            nombres[i]=leer.nextLine();
            System.out.println("2018 ");
            Sem18[i]=leer.nextInt();
            System.out.println("2019 ");
            Sem19[i]=leer.nextInt();
            if(Sem18[i]>Sem19[i])
                anio[i]=Sem18[i];
            else
                anio[i]=Sem19[i];
            System.out.println("  "+anio[i]);
        }
    }
}

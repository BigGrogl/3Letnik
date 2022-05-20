import java.util.Scanner;

public class Nal2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] tabela = new int[100];
        for(int i = 0; i < 100; i++){
            tabela[i] = sc.nextInt();
        }
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int temp = 0;
        temp = tabela[pos1];
        tabela[pos1] = tabela[pos2];
        tabela[pos2] = temp;
    }
    public static double povprecnaVrednost(int[] tabela){
        double vsota = 0.0;
        for(int i = 0; i < tabela.length; i++){
            vsota+=tabela[i];
        }
        vsota = vsota / tabela.length;
        return vsota;
    }
    public static void izpisNadpovprecnihStevil(int[] tabela){
        double povprecje = povprecnaVrednost(tabela);
        for(int i = 0; i < tabela.length; i++){
            if(tabela[i]>povprecje){
                System.out.println(tabela[i]);
            }
        }
    }
    public static int obrniStevilo(int input){
        int kontra = 0;
        int temp = input;
        while(temp>0){
            kontra=temp%10;
            kontra=kontra*10;
            temp = temp / 10;
        }
        return kontra;
    }
}

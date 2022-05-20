public class Nal1{
    public static void main(String[] args){
        int tabela[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        izpisPrastevil(tabela);
    }
    public static Boolean jePrastevilo(int input){
        return null;
        //NEVEM A SM PREVEC RETARDRAN AL KUA
    }
    public static void izpisPrastevil(int[] tabela){
        for(int i = 0; i < tabela.length; i++){
            if(jePrastevilo(tabela[i])==true){
                System.out.println(i);
            }
        }
    }
    public static int najmansaStevka(int input){
        int min = 10;
        while(input>0){
            if(input%10<min){
                min=input%10;
            }
            input = input/10;
        }
        return min;
    }
}

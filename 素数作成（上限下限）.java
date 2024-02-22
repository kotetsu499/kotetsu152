import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        float jougen;
        float prime = 101;
        int warukazu = 2;
        System.out.println("下限を入力...(二以下不可)");
        Scanner sc = new Scanner(System.in);
        prime = sc.nextInt();
        System.out.println("上限を入力...");
        Scanner lol = new Scanner(System.in);
        jougen = lol.nextInt();
        do{
            if(prime % warukazu == 0){
            prime++;
            warukazu = 2;
        }else{
            if(warukazu == prime -1){
                System.out.println(prime+"       "+prime / jougen *100+"％が完了");
                prime ++;
                warukazu = 2;
            }else{
                warukazu++;
            }
        }
    }while(jougen > prime);
}
}


        

        

        
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int i =1;
            System.out.println("摂氏華氏変換機 7777と入力してプログラムを終了。");
            System.out.println("摂氏~華氏~摂氏");
        
        do{
           
            Scanner scan = new Scanner(System.in);
            double num = scan.nextInt();
            if (num == 7777){
                System.exit(0);
            }else{

            
            double sessi = (num-32)*9/5;
            double kasi = num * 1.8 +32;
            System.out.println("摂氏"+num +"度は、華氏"+ kasi + "度です");
            System.out.println("華氏"+num+"度は、摂氏"+sessi+"度です");
            }
       
        
        }while(i==1);
    }
}

    


    


    

    




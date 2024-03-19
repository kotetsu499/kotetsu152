import java.util.*;
public class 素数確認改善版 {
    public static void main(String[] args) throws Exception {
        double prime;
        double waru = 2;
        int Finish = 0;
        do{
        Finish = 0;
        waru = 2;
        Scanner sc = new Scanner(System.in);
        prime = sc.nextInt();
        double 平方根 = Math.sqrt(prime);
        if(prime%2==0){
            System.out.println("素数ではありません");
            Finish = 1;
        }
        if (prime%5==0) {
            if (prime != 5) {
               System.out.println("素数ではありません"); 
               Finish = 1;
            }
        }
        if (Finish == 0) {
            do{
            
            if (prime>waru) {
                if (prime % waru == 0) {
                    System.out.println("素数ではありません");
                    Finish = 1;
                }else{
                    if (平方根<waru) {
                        System.out.println("素数です");
                        Finish = 1;
                    }else{
                        waru++;
                    }
                }
            }else{
                System.out.println("素数です");//おそらく一生読まれない行
                Finish = 1;
            }
        }while(Finish == 0);
        }else{
        }
        
        }while(true);
            
        }
    }

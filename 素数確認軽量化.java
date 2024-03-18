import java.util.*;

public class 素数確認軽量化 {
    public static void main(String[] args) throws Exception {
        double prime = 101;
        double waru = 2;
        int IsPrime = 0;//0は計算途中、1は計算が終了したことを示す

        do{
            waru =2;
            IsPrime = 0;
            Scanner sc = new Scanner(System.in);
            prime = sc.nextInt();
            //偶数確認(2は考慮していない)
            if(prime%2 == 0){
                System.out.println("素数ではありません(偶数)");
                IsPrime = 1;
            }
            //偶数確認終了
            //5の段確認(5の段だと素数じゃない)
                if(prime%5 == 0){
                System.out.println("素数ではありません(五の段)");
                IsPrime = 1;
            }
            //5の段確認終了
            do{
                //waru が　primeの半分まで来ていないかを確認する。(半分まで来ていたら素数ではないので)
                if(waru==prime/2+0.5){
                    System.out.println("素数ですねえ");
                    IsPrime = 1;
                }
                //半分確認終了
            if (prime!=waru) {
                if (prime%waru==0) {
                    if(IsPrime == 1){
                    }else{
                        System.out.println("素数ではありません");
                        IsPrime = 1;
                    }
            }else{
                waru++;
            }
        }else{
            System.out.println("素数です");
            IsPrime = 1;
        }
        }while(IsPrime == 0);

        }while(true);
    }
}


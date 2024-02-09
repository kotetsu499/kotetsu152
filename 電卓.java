import java.util.*;

public class 電卓 {
    public static void main(String[] args) throws Exception {
        int first;
        int second;
        int enzansi;
        int CanIC;
        int result = 0;
        int loop = 0;

        do{
            loop = 0;
        System.out.println("数値を入力してください...（整数）");
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextInt();
        System.out.println("演算子を入力してください(1.+ 2.- 3.* 4./)");
        Scanner hello = new Scanner(System.in);
        enzansi = hello.nextInt();
        System.out.println("数値を入力してください...（整数）");
        Scanner what = new Scanner(System.in);
        second = what.nextInt();

        if(first%1!=0){
            System.out.println("最初に入力した値、"+first+"が正しくありません");
            CanIC = 0;
        }else{
            CanIC = 1;
        }
        if(second%1!=0){
            System.out.println("次に入力した値、"+second+"が正しくありません");
            CanIC = 0;
        }else{
            CanIC = 1;
        }
        switch(enzansi){
            case 1:
            result = first + second;
            break;
            case 2:
            result = first - second;
            break;
            case 3:
            result = first * second;
            break;
            case 4:
            result = first / second;
            break;
            default:
            System.out.println("演算子が正しくありません(1~4)");
            CanIC = 0;
        }
            if(CanIC == 1){
                System.out.println("結果:"+result);
                do{
                    System.out.println("");
                    loop++;
                }while(loop <5);
            }else{
                System.out.println("もう一度やり直してください");
            }

        }while(true);

        
        }

        }


    


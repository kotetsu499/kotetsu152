import java.util.*;

public class 素数作成 {
    public static void main(String[] args) throws Exception {
        int warukazu=2;
        int prime= 3;
        int kurikaesikanou;
        int kurikaesita=0;
        double paa = 100;
        System.out.println("作りたい素数の数を入力");
        Scanner sc = new Scanner(System.in);
        kurikaesikanou = sc.nextInt();
    do{
        prime=prime*-1;
        do{
            if(prime%warukazu==0){
                if(prime!=warukazu){
                    prime++;
                    warukazu=2;
                }else{
                    System.out.println(prime+"は素数です");
                    prime++;
                    warukazu=2;
                    kurikaesita++;
                    prime=prime*-1;
                if(kurikaesikanou==kurikaesita){
                    System.out.println(kurikaesikanou+"個の素数の作成が終わりました");
                }else{
                    paa = ((double) kurikaesita / kurikaesikanou) * 100;
                    System.out.println("                    "+paa + "％が作成されました");  
                    }
                }
        }else{
            warukazu++;
        }
            }while(prime>=warukazu);
    }while(kurikaesikanou>kurikaesita);
        }
    }
    
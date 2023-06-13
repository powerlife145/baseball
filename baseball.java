import java.util.*;
public class baseball {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bak1 = (int)(Math.random()*8)+1; //0.0~1.0

        int ship1=0;
        int ill1 =0;

        while(true){
            ship1 = (int)(Math.random()*8)+1;
            if(bak1 != ship1) break;
        }

        //dlf
        while(true){
            ill1 = (int)(Math.random()*8)+1;
            if(bak1 != ill1 && ship1 != ill1) break;
        }


        System.out.println("답:" + bak1 + ship1 + ill1);

        int cnt=0;

        while(true){
            cnt++;
            int strike =0 ;
            int ball=0;

            int num = sc.nextInt(); // 사용자가 입력한 값
            System.out.println(cnt+"번째 시도 : " + num);

            int bak = num/100; //937 /100
            int ship = (num%100)/10;
            int ill = num%10;

            if(ill1==ill && ship1 == ship && bak ==bak1){
                System.out.println("3S");
                System.out.println(cnt+"번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }

            if(bak==bak1)strike++;
            if(ship==ship1)strike++;
            if(ill == ill1)strike++;


            if(bak!=bak1 && ((bak ==ship1) || (bak ==ill1) ))ball++;
            if(ship!=ship1 && ((ship ==bak1) || (ship ==ill1) ))ball++;
            if(ill!=ill1 && ((ill ==bak1) || (ill ==ship1) ))ball++;


            System.out.println("S : " + strike +"B : " + ball );

            if(strike==0 && ball==0){
                System.out.println("out");
            }else if(strike==0 && ball !=0 ){
                System.out.println(ball+"B");
            }else if(ball==0 && strike !=0 ) {
                System.out.println(strike+"S");
            }else{System.out.println(ball+"B"+strike+"S");}
        }
    }
}
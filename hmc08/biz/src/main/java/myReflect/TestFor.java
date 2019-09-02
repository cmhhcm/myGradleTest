package myReflect;

/**
 * Author:meice Huang
 * Time: 2019-08-20 14:48
 */
public class TestFor {
    public static void main(String[] args) {
        for(int i=0;i<=5 ;i++){
            boolean isHit  = false;
            for(int j=1;j<=2;j++){
                if(i == j ){
                    isHit = true;
                    break;
                }
            }
            if(!isHit){
                System.out.println("执行增加操作");
            }

        }
    }
}

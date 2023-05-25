package aa;

public class xxoo {
    static int a= 1;
    static volatile int b3 =0;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
new Thread(new Runnable() {
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            if(b3 == 2)continue;
            b3 =1;
            if(b3 != 1) {continue;}
            a++;
            System.out.println(a+"-------------");
            b3=2;
            
        } 
    }
}).start();

new Thread(new Runnable() {
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            if(b3 == 1)continue;
            b3 =2;
            if(b3 != 2){continue;}
            a++;
            System.out.println(a+">>>>>>");
            b3=1;
        }
    }
}).start();
    }

}

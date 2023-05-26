package aa;

public class xxoo {
    static int a= 1;
    static volatile int b =0;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
new Thread(new Runnable() {
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            if (b < 0) continue;
            b = b +2;
            if(b > 1) {
              a++;
              System.out.println(a+"-------------");
              b = -1;
            }
        } 
    }
}).start();

new Thread(new Runnable() {
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            if (b > 1) continue;
            b = b -1;
            if(b < 0){
              a++;
              System.out.println(a+">>>>>>");
              b = 1;
            }
        }
    }
}).start();
    }

}


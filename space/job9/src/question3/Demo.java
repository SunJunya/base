package question3;

import java.util.Calendar;

public class Demo{
    public static void main(String args[]){
        Seller s =new Seller();
        Calendar d=Calendar.getInstance();
        int start=d.get(Calendar.SECOND),now;
        String s1="zhao",s2="qian",s3="sun",s4="li",s5="wang";
        Buyer zhao,qian,sun,li,wang;
        zhao=new Buyer(s1,20,s);
        qian=new Buyer(s2,20,s);
        sun=new Buyer(s3,5,s);
        li=new Buyer(s4,10,s);
        wang=new Buyer(s5,5,s);
        try {
        	zhao.start();
            Thread.sleep(1000);
            qian.start();
            Thread.sleep(1000);
            sun.start();
            Thread.sleep(1000);
            li.start();
            Thread.sleep(1000);
            wang.start();
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        while (true){
            if(Thread.activeCount()==1){
                System.out.println("所有顾客都已买完票");
                System.exit(0);
            }
            d=Calendar.getInstance();
            now=d.get(Calendar.SECOND);
            if(Math.abs(now-start)>=10){
                System.out.println("还有"+(Thread.activeCount()-1)+"个顾客没有完成");
                System.exit(0);
            }
        }
    }
}
class Seller{         //负责卖票的类
    int fiveNumber=1,tenNumber=0,twentyNumber=0;
    public synchronized void sell(int receiveMoney){
        String s=Thread.currentThread().getName();
        if(receiveMoney==5){
            fiveNumber=fiveNumber+1;
            System.out.println(s+"给售票员5元钱,售票员卖给"+s+"一张票,不必找赎");
        }
        else if(receiveMoney==10){
            while(fiveNumber<1){
                try{  System.out.println(s+"给售票员10元钱");
                    System.out.println("售票员请"+s+"靠边等一会");
                    wait();  //如果线程占有CPU期间执行了wait()，就进入中断状态
                    System.out.println(s+"结束等待,继续买票");
                }
                catch(InterruptedException e){}
            }
            fiveNumber=fiveNumber-1;
            tenNumber=tenNumber+1;
            System.out.println(s+"给售票员10元钱,售票员卖给"+s+"一张票,找赎5元");
        }
        else if(receiveMoney==20){
            while(fiveNumber<1||tenNumber<1){
                try{  System.out.println(s+"给售票员20元钱");
                    System.out.println("售票员请"+s+"靠边等一会");
                    wait();  //如果线程占有CPU期间执行了wait()，就进入中断状态
                    System.out.println(s+"结束等待,继续买票");
                }
                catch(InterruptedException e){}
            }
            fiveNumber=fiveNumber-1;
            tenNumber=tenNumber-1;
            twentyNumber=twentyNumber+1;
            System.out.println(s+"给售票员20元钱,售票员卖给"+s+"一张票,找赎15元");
        }
        notifyAll();
    }
}

class Buyer extends Thread{
    Seller s;
    String name;
    int n;
          Buyer(String name,int n,Seller s){
              this.name=name;
              this.n=n;
               this.s=s;
               super.setName(name);
          }
          public  void run(){
              s.sell(n);
          }
}
class Tjoin extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
try{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
Tjoin t1=new Tjoin();
Tjoin t2=new Tjoin();
Tjoin t3=new Tjoin();
t1.start();
try{
t1.join();
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();
t3.start();
}
}


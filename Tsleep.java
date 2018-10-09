class Tsleep extends Thread
{
public void run()
{
System.out.println("running");
}
public static void main(String args[])
{
Tsleep t1=new Tsleep();
t1.start();
}
}

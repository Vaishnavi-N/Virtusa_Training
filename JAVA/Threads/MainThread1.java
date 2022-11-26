import java.util.*;
class UserThreadPriority extends Thread
{
    Scanner sc=new Scanner(System.in);
    static String k;
    static char c;
    int dc=0,cc=0;
    public void run()
    {
        if("ThreadA".equals(this.getName()))
        {
            dc=k.indexOf(c);
            System.out.print(this.getName()+":"+dc+" ");
        }
        else if("ThreadB".equals(this.getName()))
        {
            cc=k.lastIndexOf(c);
            System.out.print(this.getName()+":"+cc+" ");
        }
    }
}
public class MainThread1
{
    public static void main(String args[])
    {
        UserThreadPriority threadobj1=new UserThreadPriority();
        UserThreadPriority threadobj2=new UserThreadPriority();
        threadobj1.setName("ThreadA");
        threadobj2.setName("ThreadB");
        Scanner sc=new Scanner(System.in);
        UserThreadPriority.k=sc.nextLine();
        UserThreadPriority.c=sc.next().charAt(0);
        threadobj1.start();
        threadobj2.start();
    }
}

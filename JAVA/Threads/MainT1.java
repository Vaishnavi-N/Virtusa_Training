import java.io.*;
import java.util.*;
class CharacterThread extends Thread{
    static String k;
    int uc;
    int lc;
    
    public void run(){
        for(int i=0;i<k.length();i++){
            char ch=k.charAt(i);
            if(ch>='A'&&ch<='Z')
            uc++;
            else if(ch>='a'&&ch<='z')
            lc++;
        }
        if("ThreadA".equals(this.getName())){
            System.out.print("ThreadA:"+uc+" ");
        }
        else if("ThreadB".equals(this.getName())){
           System.out.print("ThreadB:"+lc+" ");
        }
    }
}
class MainT1{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        CharacterThread threadobj1 = new CharacterThread();
        CharacterThread threadobj2 = new CharacterThread();
        threadobj1.setName("ThreadA");
        threadobj2.setName("ThreadB");
        String v=sc.nextLine();
        CharacterThread.k=v;
        threadobj1.start();
        threadobj2.start();
    }
}



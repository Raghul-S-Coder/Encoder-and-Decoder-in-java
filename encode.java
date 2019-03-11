import java.util.*;
public class encode{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        List<Character> lc=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        List<Character> lc1=new ArrayList<>();
        List<String> ls1=new ArrayList<>();
        List<Character> lc2=new ArrayList<>();
        List<String> ls2=new ArrayList<>();
        for(char a='a';a<='z';a++)
        {
            ls.add(Character.toString(a));
            lc.add(a);
        }
        lc1.add('a');
        ls1.add("a");
        for(char a='z';a>'a';a--)
        {
            lc1.add(a);
            ls1.add(Character.toString(a));
        }
        lc2.add('z');
        ls2.add("z");
        for(char a='a';a<'z';a++)
        {
            ls2.add(Character.toString(a));
            lc2.add(a);
        }
        System.out.println("Enter the level to encode ");
        System.out.println(" normal - 1");
        System.out.println(" medium - 2");
        System.out.println(" hard - 3");
        int level=s.nextInt();
        s.nextLine();
        
        String n="";
        //Starting
        if(level==1)
        {
        System.out.println("Enter the message...");
        String g=s.nextLine();
            n="";
         for (int j=0;j<g.length();j++)
         {
            int h=0;
            char c=g.charAt(j);
            for(int k=0;k<lc.size();k++)
            {
                if(c==lc.get(k))
                {
                    break;
                }
                else
                {
                    h++;
                }
            }
            int h1=25-h;
            n=n+ls.get(h1);
         }
        n="@"+n;   
            System.out.println(n);
      }
      else if(level==2)
      {
          System.out.println("Enter the message...");
        String g=s.nextLine();
          n="";
          
         for(int j=0;j<g.length();j++)
         {
             int h=0;
             char c=g.charAt(j);
             for(int k=0;k<lc1.size();k++)
             {
                 if(c==lc1.get(k))
                 {
                     break;
                 }
                 else
                 {
                     h++;
                 }
             }
             int h1=25-h;
             n=n+ls1.get(h1);
         }
         n="#"+n;
          System.out.println(n);
      }
        
        else if(level==3)
          {
            System.out.println("Enter the message...");
        String g=s.nextLine();
            n="";
         for (int j=0;j<g.length();j++)
         {
            int h=0;
            char c=g.charAt(j);
            for(int k=0;k<lc2.size();k++)
            {
                if(c==lc2.get(k))
                {
                    break;
                }
                else
                {
                    h++;
                }
            }
            int h1=25-h;
            n=n+ls2.get(h1);
         }
        n="$"+n;   
            System.out.println(n);
      }
        else
        {
            System.out.print("Enter the valid level to proceed...");
        }
        
    }
}
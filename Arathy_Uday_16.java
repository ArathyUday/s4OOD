import java.io.*;
public class HollowDiamond
{
 public static void main(String [] arguments)throws IOException
   {
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader (read);
    int m;
    System.out.print("Enter the number of lines required: ");
    System.out.println();
    m=Integer.parseInt(in.readLine());
    if(m%2!=0)
      m=m+1;
    for(int i = m/2; i >= 1; i--)
     {
      for(int j = 1; j <= m; j++)
       {
        if(j == i || (m - i) == j)
            {
            System.out.print("1");  
            }
        else 
           {
            System.out.print(' ');
           }
        }
     System.out.println();
    }
    for(int i =2; i <= m/2; i++)
     {
      for(int j = 1; j <= m; j++)
       {
        if(j == i || (m - i) == j)
         {
            System.out.print("1");   
         }
        else
         {
            System.out.print(' ');
         }
 }
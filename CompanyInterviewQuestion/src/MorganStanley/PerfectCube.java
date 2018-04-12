package MorganStanley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectCube
{
        public static void main(String args[])throws IOException
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter a no : ");
                
                int i=Integer.parseInt(br.readLine());
                int j,k,c1=0;
                j=i/2;
                int c=0;
                for(k=2;k<=j;k++)
                {
                        if(i%k==0)
                        {
                                //System.out.println(k);
                                if((k*k*k)==i)
                                {
                                        c1=1;       
                                        break;
                                }
                        }
                }
                if(c1==1)
                {
                        System.out.println("Perfect CUBE");
                }
                else
                {
                        System.out.println("Not a Perfect CUBE");
                }
        }
}
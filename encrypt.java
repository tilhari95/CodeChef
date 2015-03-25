import java.io.*;

class encrypt
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		String s=br.readLine();
		char ss[]=s.toCharArray();
		int j=s.length()-1; 
		for(int i=0;i<s.length();i++)
		{
			if(ss[i]==' ')
				i++;
			ss[i]=(char)(ss[i]+ss[j]);
			if(ss[i]>90)
				if(ss[i]-65 >90)
					ss[i]=(char)(ss[i]-90);
				else
					ss[i]=(char)(ss[i]-65);

			if(i+1==j)
				j=0;
			else if(j>i)
			{
				j--;
				if(ss[j]==' ')
					j--;
			}
			else
			{
				j++;
				if(ss[j]==' ')
					j++;
			}
			
		}
		for(int i=0;i<s.length();i++)
			System.out.println(ss[i]);		
	}
}
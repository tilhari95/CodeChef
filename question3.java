import java.io.*;
class question3
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		String s=br.readLine();
		String ss[]=s.split(" ");
		String ss1[]=s.split(" ");
		int count=0;
		for(int i=0;i<ss.length;i++)
		{
			for(int j=0;j<ss.length-1;j++)
			{
				if(ss[j].charAt(0)>ss[j+1].charAt(0))
				{
					String t=ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=t;
				}
				if(ss[j].charAt(0)==ss[j+1].charAt(0))
				{
					if(ss[j].charAt(1)>ss[j+1].charAt(1))
				{
					String t=ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=t;
				}
				if(ss[j].charAt(1)==ss[j+1].charAt(1))
				{
					if(ss[j].charAt(2)>ss[j+1].charAt(2))
				{
					String t=ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=t;
				}
				
				}
				if(ss[j].charAt(2)==ss[j+1].charAt(2))
				{
					if(ss[j].charAt(3)>ss[j+1].charAt(3))
				{
					String t=ss[j];
					ss[j]=ss[j+1];
					ss[j+1]=t;
				}
				
				}

				}
			}

		}
		for(String a:ss)
			System.out.println(a);
		System.out.println();
		
		char mm=ss[ss.length-1].charAt(0);
		char m=ss[0].charAt(0);
		
		for(int i=0;i<ss.length-1;i++)
		{
				char c[]=ss[i].toCharArray();
				char d[]=ss[i+1].toCharArray();
				char t=c[0];
				c[0]=d[0];
				d[0]=t;
				if(i==ss.length-1)
					d[0]=m;
				ss[i]="";
				ss[i+1]="";
				for(char cc:c)
					ss[i]=ss[i]+cc;
				for(char dd:d)
					ss[i+1]=ss[i+1]+dd;	
		}
		System.out.println(s);
		for(int j=0;j<ss1.length;j++)
		{
			for(int i=0;i<ss.length;i++)
				if(ss[i].equals(ss1[j]))
				{
					ss[i]="";
					count++;
					break;
				}
		}
		System.out.println(count);
	}
}
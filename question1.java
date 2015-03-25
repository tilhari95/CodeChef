import java.io.*;
import java.lang.*;
class question1
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		String s=br.readLine();
		String a[]=s.split(" ");
		int t=Integer.parseInt(a[0]);
		int no=Integer.parseInt(a[1]);
		for(int i=1;i<=t;i++)
		{
			int maxa=0,maxb=0,mina=0,minb=0,fa=-1,fb=-1;
			for(int j=1;j<=no;j++)
			{
				String ss=br.readLine();
				String b[]=ss.split(" ");
				int n=Integer.parseInt(b[1]);
				char c=b[0].charAt(5);
				if(c=='1')
				{
					if(fa==-1)
					{
						
						fa=1;
						maxa=n;
						mina=n;
					}
					else
					{
						
						if(mina>n)
							mina=n;
						if(maxa<n)
							maxa=n;
					}

				}
				if(c=='2')
				{
					if(fb==-1)
					{
						
						fb=1;
						minb=n;
						maxb=n;
					}
					else
					{
						
						if(minb>n)
							minb=n;
						if(maxb<n)
							maxb=n;
					}

				}
				
			}
				System.out.println("Group1 Diff : "+(maxa-mina));
				System.out.println("Group2 Diff : "+(maxb-minb));
		}

	}
}
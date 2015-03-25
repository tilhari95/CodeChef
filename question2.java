import java.io.*;
class question2
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int testcase=Integer.parseInt(br.readLine());
		int n=0;
		

		for(int tc=0;tc<testcase;tc++)
		{
			n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			int b[]=new int[n];
			for(int k=0;k<n;k++)
				a[k]=Integer.parseInt(br.readLine());

			for(int i=0;i<n;i++)//bubble sort
			{
				for(int j=0;j<n-1;j++)
				{
					if(a[j]>=a[j+1])
					{
						int t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
			}
			int i=0,j=0,t=n-1;
			while(j<=t)
			{
				b[i]=a[t];
				i++;
				b[i]=a[j];
				i++;
				j++;
				t--;				
			}
			for(int no:b)
				System.out.print(no);
	}
	}
}
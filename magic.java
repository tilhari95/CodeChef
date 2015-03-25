import java.io.*;
class magic
{
public static void main(String args[])throws IOException
{
int a[]=new int[8];
int c=0,p;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
int t=Integer.parseInt(br.readLine());
for(int j=1;j<=t;j++)
{
c=0;
p=0;
int r1=Integer.parseInt(br.readLine());
String s1=br.readLine();
String s2=br.readLine();
String s3=br.readLine();
String s4=br.readLine();
switch(r1)
{
case 1:
a[0]=Integer.parseInt(Character.toString(s1.charAt(0)));
a[1]=Integer.parseInt(Character.toString(s1.charAt(2)));
a[2]=Integer.parseInt(Character.toString(s1.charAt(4)));
a[3]=Integer.parseInt(Character.toString(s1.charAt(6)));
break;
case 2:
a[0]=Integer.parseInt(Character.toString(s2.charAt(0)));
a[1]=Integer.parseInt(Character.toString(s2.charAt(2)));
a[2]=Integer.parseInt(Character.toString(s2.charAt(4)));
a[3]=Integer.parseInt(Character.toString(s2.charAt(6)));
break;
case 3:
a[0]=Integer.parseInt(Character.toString(s3.charAt(0)));
a[1]=Integer.parseInt(Character.toString(s3.charAt(2)));
a[2]=Integer.parseInt(Character.toString(s3.charAt(4)));
a[3]=Integer.parseInt(Character.toString(s3.charAt(6)));
break;
case 4:
a[0]=Integer.parseInt(Character.toString(s4.charAt(0)));
a[1]=Integer.parseInt(Character.toString(s4.charAt(2)));
a[2]=Integer.parseInt(Character.toString(s4.charAt(4)));
a[3]=Integer.parseInt(Character.toString(s4.charAt(6)));
break;
}
int r2=Integer.parseInt(br.readLine());
String sn1=br.readLine();
String sn2=br.readLine();
String sn3=br.readLine();
String sn4=br.readLine();
switch(r2)
{
case 1:
a[4]=Integer.parseInt(Character.toString(sn1.charAt(0)));
a[5]=Integer.parseInt(Character.toString(sn1.charAt(2)));
a[6]=Integer.parseInt(Character.toString(sn1.charAt(4)));
a[7]=Integer.parseInt(Character.toString(sn1.charAt(6)));
break;
case 2:
a[4]=Integer.parseInt(Character.toString(sn2.charAt(0)));
a[5]=Integer.parseInt(Character.toString(sn2.charAt(2)));
a[6]=Integer.parseInt(Character.toString(sn2.charAt(4)));
a[7]=Integer.parseInt(Character.toString(sn2.charAt(6)));
break;
case 3:
a[4]=Integer.parseInt(Character.toString(sn3.charAt(0)));
a[5]=Integer.parseInt(Character.toString(sn3.charAt(2)));
a[6]=Integer.parseInt(Character.toString(sn3.charAt(4)));
a[7]=Integer.parseInt(Character.toString(sn3.charAt(6)));
break;
case 4:
a[4]=Integer.parseInt(Character.toString(sn4.charAt(0)));
a[5]=Integer.parseInt(Character.toString(sn4.charAt(2)));
a[6]=Integer.parseInt(Character.toString(sn4.charAt(4)));
a[7]=Integer.parseInt(Character.toString(sn4.charAt(6)));
break;
}

for(int x=0;x<4;x++)
for(int y=4;y<8;y++)
if(a[x]==a[y])
{
p=a[x];
c++;
}

if(c==1)
System.out.println("Case #"+t+": "+p);
else if(c==0)
System.out.println("Case #"+t+": "+"Volunteer cheated!");
else
System.out.println("case #"+t+": "+"Bad magician!");

}
}
}
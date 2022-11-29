import java.util.Scanner;
import java.io.*;
public class Filedemo {

public static void main(String[] args)  {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
File fi=new File("sample.txt");
try
{
//File fi=new File("sample.txt");

if(fi.createNewFile())
{
System.out.println("File Created");
}
else
{
System.out.println("File creation Failed");
}

String content;
System.out.println("Enter the content for the file");
content=sc.nextLine();
FileOutputStream FO=new FileOutputStream(fi);
FO.write(content.getBytes());
FO.flush();
FO.close();
System.out.println("Content saved in the file");
}
catch(FileNotFoundException e) {

e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}


try
{
FileInputStream IP=new FileInputStream(fi);
/*int text;
while((text=IP.read())!=-1)
{
System.out.print((char)text);
}*/
int len=(int)fi.length();
byte[] Bytes=new byte[len];
IP.read(Bytes);
String str=new String(Bytes);

System.out.println("Content="+str);

IP.close();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
File fil=new File("New-Sample.txt");
try
{
//File fi=new File("sample.txt");

if(fi.createNewFile())
{
System.out.println("File Created");
}
else
{
System.out.println("File creation Failed");
}

//try
//{

FileInputStream IP=new FileInputStream(fi);
FileOutputStream NOP=new FileOutputStream(fil);
//FileInputStream NOP=new FileInputStream(fi);
int len=(int)fi.length();
byte[] Bytes=new byte[len];
IP.read(Bytes);
for(int i=0;i<len;i++)
{
NOP.write(Bytes[i]);
}
System.out.println("File copied");
int text;
IP.close();
NOP.close();
/*while((text=NOP1.read())!=-1)
{
System.out.print((char)text);
}*/
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
try
{

FileInputStream NOP=new FileInputStream(fil);
int text;
System.out.print("Content of new file-  ");
while((text=NOP.read())!=-1)
{
System.out.print((char)text);
}
NOP.close();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}


}
}

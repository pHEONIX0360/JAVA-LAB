import java.util.Scanner;
import java.io.*;
public class FileSample
{
public static void main(String[] args)  
{
Scanner sc=new Scanner(System.in);
File f1=new File("sample10.txt");
try
{
if(f1.createNewFile())
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
      FileOutputStream FO=new FileOutputStream(f1);
      FO.write(content.getBytes());
      FO.flush();
      FO.close();
      System.out.println("Content saved in the file");
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
FileInputStream IP=new FileInputStream(f1);
int len=(int)f1.length();
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
File file=new File("New-Sample10.txt");
try
{
if(f1.createNewFile())
{
System.out.println("File Created");
}
else
{
System.out.println("File creation Failed");
}
FileInputStream IP=new FileInputStream(f1);
FileOutputStream NOP=new FileOutputStream(file);
int len=(int)f1.length();
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

FileInputStream NOP=new FileInputStream(file);
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

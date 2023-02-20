import java.util.*;
class MatrixMulti
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,r1,c1,r2,c2;
        System.out.println("Enter the no of rows of Matrix A");
        r1=sc.nextInt();
        System.out.println("Enter the no of columns of Matrix A");
        c1=sc.nextInt();
        System.out.println("Enter the no of rows of Matrix b");
        r2=sc.nextInt();
        System.out.println("Enter the no of columns of Matrix b");
        c2=sc.nextInt();
        if(r1!=c2)
        {
            System.out.println("Matrix multiplication not possible");
        }
        else
        {
            int A[][]=new int[r1][c1];
            int B[][]=new int[r2][c2];
            int C[][]=new int [r1][c2];
        
            System.out.println("Read Matix A");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    
                        A[i][j]=sc.nextInt();
                    }}
                    System.out.println("ENTER THE  MATRIX B");
                    for(i=0;i<r2;i++)
                    {
                        for(j=0;j<c2;j++)
                        {
                            B[i][j]=sc.nextInt();
                            
                        }
                    }
                    //C[i][j]=[0][0];
                    for(i=0;i<r1;i++)
                    {
                        for(j=0;j<c2;j++)
                        {
                            C[i][j]=0;
                            for(k=0;k<c1;k++){
                            C[i][j]=C[i][j]+A[i][k]*B[k][j];
                        }
                    }
                    }
                    System.out.println(" Resultant Matrix is");
                    for(i=0;i<r1;i++){
                        for(j=0;j<c2;j++)
                        {
                            System.out.println(C[i][j]+"\t");
                        }
                    }
                //System.out.println();
            }
        }
        
    }

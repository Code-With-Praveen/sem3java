import java.util.*;
public class array{
public static void main(String[] args)
{
int[] arr;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements :");
int n=sc.nextInt();
System.out.print("Enter the elements :");
arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int max=arr[0];
for(int j=0;j<n;j++)
{
if(arr[j]>max)
{
max= arr[j];
}
}
System.out.print("maximum element is :"+ max);
}
}
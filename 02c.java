import java.util.*;
public class SwitchExample{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the operator :");
char operator = sc.next().charAt(0);
System.out.print("Enter the value of a :");
int a = sc.nextInt();
System.out.print("Enter the value of b :");
int b = sc.nextInt();
int result=0;
switch(operator)
{
case '+':
result = a+b;
System.out.print("Sum is :"+ result);
break;
case '-':
result = a-b;
System.out.print("Sum is :"+ result);
break;
case '*':
result = a*b;
System.out.print("Sum is :"+ result);
break;
case '/':
result = a/b;
System.out.print("Sum is :"+ result);
break;
default:
System.out.print("Enter the valid operator !!!");
}
}
}
public class ShortCircuit{

public static void main(String args[])
{
int denom = 0;
int num = 100;
if(denom != 0 & num / denom > 10) //with denom != 0 && num / denom the java.lang.ArithmeticException would not have been encountered / by zero
System.out.println("num/denom>10");
else
System.out.println("num/denom<10 or denum = 0");


}

}
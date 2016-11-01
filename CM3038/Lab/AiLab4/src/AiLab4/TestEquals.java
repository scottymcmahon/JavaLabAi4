package cm3038.lab03.sq8solution;

public class TestEquals {
public static void main(String[] arg)
{
int num1[][]={{0,1,2},{3,4,5},{6,7,8}};
int num2[][]={{0,1,2},{3,4,5},{6,7,8}};	//same values as num1
int num3[][]={{8,7,6},{5,4,3},{2,1,0}};	//different from num1 and num2

Sq8State s1=new Sq8State(num1);
Sq8State s2=new Sq8State(num2);
Sq8State s3=new Sq8State(num3);

System.out.println("State 1 equals State 2: "+s1.equals(s2));		//should be true (as arrays have the same values)
System.out.println("State 2 equals State 3: "+s2.equals(s3));		//should be false (as arrays have different values)
} //end method
} //end class

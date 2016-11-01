package cm3038.lab03.sq8solution;

public class TestSuccessor {
public static void main(String[] arg)
{
int num[][]={{8,7,6},{5,0,4},{3,2,1}};
Sq8State s=new Sq8State(num);

System.out.println("State:\n"+s.toString());
System.out.println("All action-state:\n"+s.successor().toString());
} //end method
} //end class

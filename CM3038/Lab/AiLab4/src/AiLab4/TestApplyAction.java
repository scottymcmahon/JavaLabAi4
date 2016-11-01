package cm3038.lab03.sq8solution;

public class TestApplyAction {

public static void main(String[] arg)
{
int num[][]={{8,7,6},{5,4,3},{2,1,0}};
Sq8State s=new Sq8State(num);
Sq8Action action=new Sq8Action(3,1,2,2,2);	//move tile 3 from row 1,column 2 to row 2,column 2 (i.e. downward)
System.out.println(s.toString());

System.out.println(action.toString()+"\n");

Sq8State next=s.applyAction(action);
System.out.println(next.toString());
} //end method
} //end class

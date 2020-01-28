package ctsdemo8;

public class ConstructorExample2 {
	String playername;
	int dob,age,hundreds,fifties;
ConstructorExample2()
{
this.playername	= "teja";
this.age=22;
this.dob=15071998;
this.hundreds=18;
this.fifties=28;
}
public static void main(String[] args) 
{
	ConstructorExample2 obj =new ConstructorExample2();
	System.out.println(obj.playername+" "+obj.age+" "+obj.dob+" "+obj.hundreds+" "+obj.fifties );
}
}

package ctsdemo8;

public class ConstructorExample3
{
	String playername	= "teja";
	int age=22;
	int dob=15071998;
	int hundreds=18;
	int fifties=28;
ConstructorExample3(String n, int a, int d, int h, int f)
{
	this.playername = n;
     this.age=a;
     this.dob=d;
     this.hundreds = h;
     this.fifties = f;
}
public static void main(String[] args) 
{
	ConstructorExample3 obj =new ConstructorExample3("teja",22,15071998,18,28);
	System.out.println(obj.playername+" "+obj.age+" "+obj.dob+" "+obj.hundreds+" "+obj.fifties);
}
}
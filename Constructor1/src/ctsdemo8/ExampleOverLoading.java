package ctsdemo8;
 class ConstructorExample {
		int age=23;
		String name;
		ConstructorExample()
		{
			this.name="teja";
			this.age=22;	
		}
		ConstructorExample(String n, int a)
		{
			this.name=n;
		     this.age=a;
		}
		public static void main(String[] args) 
		{
			ConstructorExample obj1 =new ConstructorExample();
			ConstructorExample obj2 =new ConstructorExample("ram",22);
			System.out.println(obj1.name+" "+obj1.age); 
			System.out.println(obj2.name+" "+obj2.age);
			}
	}


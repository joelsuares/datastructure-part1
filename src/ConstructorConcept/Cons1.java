package ConstructorConcept;

public class Cons1 {
	
	//class var
	String name;
	int age;
	
	Cons1(String name,int age){
		this.name=name;//this.classvar=localvar
		this.age=age;
	};
	
	public Cons1(){
		System.out.println("Default constro");
	}
	public Cons1(int a){
		System.out.println("1 constro");
	}
	public Cons1(int a,int b){
		System.out.println("2 constro");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons1 obj=new Cons1();
		Cons1 obj1=new Cons1(3);
		Cons1 obj2=new Cons1(3,5);
		Cons1 obj3=new Cons1("Joel",24);
		System.out.println(obj3.age);
		System.out.println(obj3.name);
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

}

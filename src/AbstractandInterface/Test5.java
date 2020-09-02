package AbstractandInterface;

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class b implements A {
	public void c() {
		System.out.println("i am c");
	}
}

class M extends b {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj=new M();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		
	}

}

package study;

public class JQ {
	public class Parent {}
	public class Child extends Parent { }
	public class Test {
		public void printMe(Parent parent) {
			System.out.println("PPPPPPP");
		}
		public void printMe(Child child) {
			System.out.println("child");
		}
	}
	public static void main(String[] args) {
		Test t = new JQ().new Test();
		t.printMe(null);
	}

}

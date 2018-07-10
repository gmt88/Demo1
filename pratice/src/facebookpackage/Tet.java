package facebookpackage;

public class Tet {

	int rollno;
	String name;

	void marks(int i, String n) {
		rollno = i;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name);
	}
}

class Gowthami2 {
	public static void main(String args[]) {
		Tet s1 = new Tet();
		s1.marks(100, "gowthami");
		s1.display();
	}
}

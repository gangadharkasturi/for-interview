import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorTest {
	public static void main(String arg[]) {
		List<Student> list = new ArrayList<Student>(); // List of Student Type
		list.add(new Student("Nishan", 538, 'A', 14.24)); // Adding Elements to
															// list
		list.add(new Student("Ram", 513, 'A', 47.87));
		list.add(new Student("Sanath", 583, 'B', 87.78));
		list.add(new Student("Amar", 504, 'A', 21.14));
		list.add(new Student("Shiva", 506, 'A', 2.7));
		list.add(new Student("Bobby", 589, 'B', 88.888));
		/*Collections.sort(list, new Comparator<Student>() { // Comparator in
															// Collections sort

			public int compare(Student a1, Student a2) { // Compare method
				return a1.name.compareTo(a2.name); // LINE A
			}
		});*/
		Collections.sort(list,new StudentPocketMoneyComparator());
		for (int i = 0; i < list.size(); i++) {
			Student a = list.get(i); // Assigning list element to Student object
			System.out.println(a.name + " " + a.rollno + " " + a.section+" "+a.pocketMoney);
		}

	}
}

class Student {

	String name;
	int rollno;
	char section;
	double pocketMoney;

	public Student(String name, int rollno, char section, double pocketMoney) {
		this.name = name;
		this.rollno = rollno;
		this.section = section;
		this.pocketMoney = pocketMoney;
	}
}

class StudentPocketMoneyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.pocketMoney-o2.pocketMoney);
	}
	
}
package object;

class Student { 
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) //재정의한 equals() 메서드는 학생의 학번이 같으면 true
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee and studentLee2 is same address");
		else
			System.out.println("studentLee and studentLee2 is not same address");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee and studentLee2 is equals");
		else
			System.out.println("studentLee and studentLee2 is not equals");
		
		
		if(studentLee == studentSang)
			System.out.println("studentLee and studentSang is same address");
		else
			System.out.println("studentLee and studentSang is not same address");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee and studentSang is equals");
		else
			System.out.println("studentLEe and studentSang is not equals");
		
		System.out.println("studentLee's hashCode:" + studentLee.hashCode() );
		System.out.println("studentSang's hashCode:" + studentSang.hashCode() );
		
		System.out.println("studentLee's real address:" + System.identityHashCode(studentLee));
		System.out.println("studentSang's real address:" + System.identityHashCode(studentSang));
	}
}

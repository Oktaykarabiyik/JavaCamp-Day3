
public class Student extends User {
 private String school;
 private String studentNumber;
 
 public Student() {
	 
 }
 public Student(String school,String StudentNumber) {
	 this.school=school;
	 this.studentNumber=StudentNumber;
	 
 }
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}

}

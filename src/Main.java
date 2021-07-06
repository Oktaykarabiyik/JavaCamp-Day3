
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student oktaykarabiyik=new Student();
         Instructor engindemirog=new Instructor();
         oktaykarabiyik.setId(1);
         oktaykarabiyik.setName("Oktay");
         oktaykarabiyik.setSurName("Karabiyik");
         oktaykarabiyik.seteMail("oktaykarabiyik@gmail.com");
         oktaykarabiyik.setPassword("123456");
         oktaykarabiyik.setSchool("Kocaeli University");
         oktaykarabiyik.setStudentNumber("190201");
         engindemirog.setExperienceYear("12");
         engindemirog.seteMail("engindemirog@gmail.com");
         engindemirog.setId(2);
         engindemirog.setName("Engin");
         engindemirog.setSurName("Demirog");
         engindemirog.setPassword("147852");
         
         StudentManager studentManager=new StudentManager();
         studentManager.add(oktaykarabiyik);
         studentManager.delete(oktaykarabiyik);
         InstructorManager Instructormanager=new InstructorManager();
         Instructormanager.add(engindemirog);
         Instructormanager.delete(engindemirog);
	}    

}

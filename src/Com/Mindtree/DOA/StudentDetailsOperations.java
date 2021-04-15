package Com.Mindtree.DOA;

import java.sql.ResultSet;

import Com.Mindtree.Model.Student;

public interface StudentDetailsOperations {
public abstract String insertStudent(Student st);
public boolean validate(Student student);
public boolean studentCheck(String userName, String password);
public ResultSet showStudent();
public String deleteStudent(String str);
}

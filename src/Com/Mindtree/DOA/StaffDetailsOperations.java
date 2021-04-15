package Com.Mindtree.DOA;

import java.sql.ResultSet;

import Com.Mindtree.Model.Staff;

public interface StaffDetailsOperations {
abstract String insertStaff(Staff staff);
public boolean staffCheck(String name,String password);
public ResultSet showStaff();
public String deleteStaff(String name);
}

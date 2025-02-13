package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementHW {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdcb:mysql://localhost:3360/batch204","root","786313");
		Statement s=c.createStatement();
		s.executeUpdate("insert into car (model_no,car_name,comp_name) values(201,'Varna','Hyndai')");
		s.executeUpdate("insert into students (id,name,city) values (3,'vikram','nagpur')");
		s.executeUpdate("insert into employee (emp_id,emp_name,empt_depart) values (3,'rohan','support')");
		s.executeUpdate("insert into product (p_name,p_id,p_comp) values ('iphone 16',16,'Apple')");
		s.executeUpdate("insert into city (city_name,pincode,state) values ('Amravati',444601,'Maharashtra')");

		System.out.println("Data is Inserted Successfully...");
		c.close();
		
	}
	public void deleteDate() throws Exception	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","786313");
		Statement s=c.createStatement();
		s.executeUpdate("delete from car where car_name='swift'");
		s.executeUpdate("delete from student where id=1");
		s.executeUpdate("delete from employee where emp_id=123");
		s.executeUpdate("delete from product where p_id=12");
		s.executeUpdate("delete from city where city_name=Delhi'");
		System.out.println("Data Deleted Successfully..");
		c.close();
		
		
		
	}
	public void updateDate() throws Exception ()	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","786313");
		Statement s=c.createStatement();
		s.executeUpdate("delete car set car_name='baleno' where car_name='alcazar'");
		s.executeUpdate("delete student set id=2 where id=101");
		s.executeUpdate("delete employee set emp_name='ram' where emp_name=amit");
		s.executeUpdate("delete product set P_name=iphone 13 where p_id=13");
		s.executeUpdate("delete city set city_name='Nagpur' where city_name=Pune'");
		System.out.println("Data Updated Successfully..");
		c.close();
		
		
		
	}
	public void showData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","786313");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("Select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		ResultSet rf=s.executeQuery("Select * from employee");
		while(rf.next()) {
			System.out.println(rf.getInt(1)+" "+rf.getString(2)+" "+rf.getString(3));
		}
		ResultSet ra=s.executeQuery("Select * from city");
		while(ra.next()) {
			System.out.println(ra.getInt(2)+" "+ra.getString(1)+" "+ra.getString(3));
		}
		ResultSet rk=s.executeQuery("Select * from car");
		while(rk.next()) {
			System.out.println(rk.getInt(1)+" "+rk.getString(2)+" "+rk.getString(3));
		}
		ResultSet rc=s.executeQuery("Select * from product");
		while(rc.next()) {
			System.out.println(rc.getInt(2)+" "+rc.getString(1)+" "+rc.getString(3));
		}
	}
}

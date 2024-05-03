package crud;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Book  extends Dbcode{
int insert(int Book_id,String Title,String Author,String Genre,int Publication_Year,int Quantity) throws SQLException{
	String q="insert into Book values(?,?,?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(q);
	pst.setInt(1,Book_id);
	pst.setString(2,Title);
	pst.setString(3,Author);
	pst.setString(4,Genre);
	pst.setInt(5,Publication_Year);
	pst.setInt(6,Quantity);
	int res=pst.executeUpdate();
	return res;
}
int update(String Title,int Quantity)throws SQLException{
	String q="update Book set Quantity=? where Title=?";
	PreparedStatement pst=con.prepareStatement(q);
	pst.setString(2,Title);
	pst.setInt(1,Quantity);
	int res=pst.executeUpdate();
	return res;
}
int delete(int Book_id)throws SQLException {
	String q="delete from Book where Book_id=?";
	PreparedStatement pst=con.prepareStatement(q);
	pst.setInt(1,Book_id);
	int res=pst.executeUpdate();
	return res;	
}
void select()throws SQLException{
	String q="select * from Book";
	PreparedStatement pst=con.prepareStatement(q);
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		int Book_id =rs.getInt(1);
		String Title=rs.getString(2);
		String Author=rs.getString(3);
		String Genre=rs.getString(4);
		int Publication_Year=rs.getInt(5);
		int Quantity=rs.getInt(6);
		System.out.println(Book_id+"\t"+Title+"\t"+Author+"\t"+Genre+"\t"+Publication_Year+"\t "+Quantity);
	}
}
}

package resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao3 {  
private JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
  
public List<Employee> getAllEmployees(){  
 return template.query("select * from employee",new ResultSetExtractor<List<Employee>>(){  
    public List<Employee> extractData(ResultSet rs) throws SQLException,  
            DataAccessException {  
      
        List<Employee> list=new ArrayList<Employee>();  
        while(rs.next()){  
        Employee e=new Employee();  
        e.setId(rs.getInt(1));  
        e.setName(rs.getString(2));  
        e.setMailId(rs.getString(3));  
        list.add(e);  
        }  
        return list;  
        }  
    });  
  }  
}  
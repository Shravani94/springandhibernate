package namedParameterJdbdTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao4 {  
NamedParameterJdbcTemplate template;  
  
public EmployeeDao4(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
public  void save (Employee e){  
String query="insert into employee values (:id,:name,:salary)";  
  
Map<String,Object> map=new HashMap<String,Object>();  
map.put("id",e.getId());  
map.put("name",e.getName());  
map.put("salary",e.getMailId());  
  
template.execute(query,map,new PreparedStatementCallback() {  
    public Object doInPreparedStatement(PreparedStatement ps)  
            throws SQLException, DataAccessException {  
        return ps.executeUpdate();  
    }  
});  
}  
}  
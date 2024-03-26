package com.genpact.custommapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.genpact.pojo.Request;



public class RequestRowMapper implements RowMapper<Request>{

	@Override
	public Request mapRow(ResultSet rs, int rowNum) 
			throws SQLException {
		
		Request pr = new Request();
		
		pr.setRequestID(rs.getInt("requestID"));
		pr.setUserID(rs.getString("userID"));
		pr.setCourseID(rs.getInt("courseID"));
		pr.setInstituteID(rs.getInt("instituteID"));
		pr.setRequestDate(rs.getDate("requestDate"));
		pr.setStatus(rs.getInt("status"));
		
		return pr;
	}
}

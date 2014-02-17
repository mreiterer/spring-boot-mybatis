package at.ebssoftware.ebs.timesheet.mybatis.mapper;

import at.ebssoftware.ebs.timesheet.model.User;

public interface UserMapper {
	
	User selectByPrimaryKey(String ID);
}
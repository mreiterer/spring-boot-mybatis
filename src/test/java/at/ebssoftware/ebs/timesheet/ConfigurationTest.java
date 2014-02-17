package at.ebssoftware.ebs.timesheet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import at.ebssoftware.ebs.timesheet.configuration.TomcatPoolDataSourceProperties;
import at.ebssoftware.ebs.timesheet.model.User;
import at.ebssoftware.ebs.timesheet.mybatis.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class })
public class ConfigurationTest {

	@Autowired
	TomcatPoolDataSourceProperties dataSourceProperties;

	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testMapperScanWithSpringBoot() {

		Assert.assertNotNull(dataSourceProperties);
		Assert.assertEquals("org.hsqldb.jdbcDriver", dataSourceProperties.getDriverClassName());
		
		Assert.assertNotNull(userMapper);
	}

}

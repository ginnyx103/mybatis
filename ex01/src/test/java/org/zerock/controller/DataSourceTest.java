package org.zerock.controller;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataSourceTest {
	
	@Inject
	private DataSource ds; 
	
	@Test
	public void testConnection() throws Exception {
		try (Connection con = ds.getConnection()){			// jre 1.7 이상 아니면 오류남.
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

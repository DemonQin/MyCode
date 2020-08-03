package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTest {
    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate= (JdbcTemplate) ac.getBean("JdbcTemplate");
        Integer total=jdbcTemplate.queryForObject("select count(*) from tb_user",Integer.class);
        System.out.println("总记录-->"+total);
    }
}

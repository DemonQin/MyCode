import com.shsxt.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class TestUser {
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = {"classpath:spring.xml"})
    public static class TestSpringMybatis {
        @Autowired
        private UserService userService;

        @Test
        public void testQueryUserById() {
            System.err.println(userService.queryUserById(1));
        }

        @Test
        public void testSaveUser(){
            userService.saveUser("jiangjie","xiaoliu");
        }
    }
}
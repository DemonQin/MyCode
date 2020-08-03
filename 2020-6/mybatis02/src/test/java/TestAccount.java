import com.shsxt.dao.AccountMapper;
import com.shsxt.vo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

public class TestAccount {
    private SqlSessionFactory factory;

    @Before
    public void init() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() {
        System.out.println("lala");
        SqlSession session = factory.openSession();
        AccountMapper sessionMapper = session.getMapper(AccountMapper.class);
        System.out.println(sessionMapper.queryAccountByid(14));
        session.close();
    }

    @Test
    public void test02() {
        System.out.println("lala");
        SqlSession session = factory.openSession(true);
        AccountMapper sessionMapper = session.getMapper(AccountMapper.class);
        for (int i = 0; i < 49; i++) {
            sessionMapper.saveAccount(new Account("test", "1", BigDecimal.valueOf(1000l), "test", new Date(), new Date(), 20));
        }
//        sessionMapper.saveAccount(new Account("test", "1", BigDecimal.valueOf(1000l), "test", new Date(), new Date(), 20));
        session.close();
    }

    @Test
    public void test03() {
        System.out.println("lala");
        SqlSession session = factory.openSession(true);
        AccountMapper sessionMapper = session.getMapper(AccountMapper.class);
        System.out.println(sessionMapper.deleteAccountById(2));
        session.close();
    }

    @Test
    public void test04() {
        System.out.println("lala");
        SqlSession session = factory.openSession(true);
        AccountMapper sessionMapper = session.getMapper(AccountMapper.class);
        sessionMapper.deleteAll();
        session.close();
    }
}

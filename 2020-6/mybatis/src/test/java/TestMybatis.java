import com.shsxt.vo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {

    @Test
    public void test() {
        /**
         * 1.加载全局配置
         * 2.实例化SqlSessionFactory
         * 3.获取SqlSession 会话
         * 4.执行查询
         * 5.关闭会话
         */
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = build.openSession();
            User selectOne = session.selectOne("com.shsxt.mapper.UserMapper.queryUserById02", 1);
            System.out.println(selectOne);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

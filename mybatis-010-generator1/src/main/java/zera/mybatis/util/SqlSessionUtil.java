package zera.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtil {
    private SqlSessionUtil() {
    }

    private static SqlSessionFactory sqlSessionFactory;

    static {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession openSession(){

        //一个SqlSessionFactory对象 对应一个environment 对应一个数据库
        //没必要每一次 都新建一个对象 毕竟你只有一个数据库
//        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSessionFactory.openSession();

    }
}

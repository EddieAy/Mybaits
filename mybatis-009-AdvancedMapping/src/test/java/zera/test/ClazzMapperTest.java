package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.ClazzMapper;
import zera.pojo.Clazz;
import zera.util.SqlSessionUtil;

public class ClazzMapperTest {

    @Test
    public void testSelectByCollection(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectByCollection(1002);
        System.out.println(clazz);
        sqlSession.close();
    }

    @Test
    public void testSelectByClazzDis(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectByClazzDis(1001);
        System.out.println(clazz);
        sqlSession.close();
    }

}

package zera;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mybatis.mapper.CarMapper;
import zera.mybatis.pojo.Car;
import zera.mybatis.util.SqlSessionUtil;

public class CarMapperTest {
    @Test
    public void testSelectByPrimaryKey(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car car = carMapper.selectByPrimaryKey(1L);
        System.out.println(car);
        sqlSession.close();
    }
}

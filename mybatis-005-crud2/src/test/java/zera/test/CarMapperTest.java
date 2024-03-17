package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.CarMapper;
import zera.pojo.Car;
import zera.util.SqlSessionUtil;

import java.util.List;

public class CarMapperTest {

    @Test
    public void testInsertCarUseGeneratedKeys(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car c1 = new Car(null, "423", "BMW", 32.0, "2010-10-1", "foil");
        mapper.insertCarUseGeneratedKeys(c1);
        System.out.println(c1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        int count = mapper.insert(new Car(null, "6954", "BYD2", 3.0, "2000-10-1", "elec"));
        System.out.println(count);

        sqlSession.commit();
    };

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        int count = mapper.deleteById(13L);
        System.out.println(count);
        sqlSession.commit();
    };

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(19L, "6954", "CT5", 31.0, "2020-10-1", "elec");
        int count = mapper.update(car);
        System.out.println(count);
        sqlSession.commit();
    };

    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        Car car = mapper.selectById(16L);
        System.out.println(car);
        sqlSession.commit();
    };

    @Test
    public void testSelectByCarType(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = mapper.selectByCarType("elec");
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.commit();
    }
//    public void testSelectAll();

}

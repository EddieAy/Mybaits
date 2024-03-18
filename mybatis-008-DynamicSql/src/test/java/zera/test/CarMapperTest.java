package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.CarMapper;
import zera.pojo.Car;
import zera.util.SqlSessionUtil;

import java.util.Arrays;
import java.util.List;

public class CarMapperTest {

    @Test
    public void testSelectByMultiCondition(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectByMultiCondition("m",3.0);
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectByMultiConditionWithWhere(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectByMultiConditionWithWhere(null,3.0);
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectByMultiConditionWithTrim(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectByMultiConditionWithTrim("",null);
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.close();
    }

    @Test
    public void testUpdateBySet(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car car = new Car(16L,null,null,145.6,null,null);
        int count = carMapper.updateBySet(car);
        System.out.println("update :" + count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByChoose(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        List<Car> cars = carMapper.selectByChoose("m",100.0);
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.close();
    }

    @Test
    public void testDeleteBatchByForEach(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Long[] ids = new Long[]{7L,8L,9L};
        int count = carMapper.deleteBatchByForEach(ids);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertBatchByForEach(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
        Car c1 = new Car(null,"107","Ferrari",400,"2014-01-01","foil");
        Car c2 = new Car(null,"108","Ferrari",400,"2014-01-01","foil");
        Car c3 = new Car(null,"109","Ferrari",400,"2014-01-01","foil");
        List<Car> cars = Arrays.asList(c1,c2,c3);
        int count = carMapper.insertBatchByForEach(cars);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

}

package zera;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.pojo.Car;
import zera.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CarMapperTest {
    @Test
    public void testInsertCar(){
        SqlSession sqlSession = SqlSessionUtil.openSession();

        Map<String, Object> map = new HashMap<>();
        map.put("carNum","114");
        map.put("brand","Maybach");
        map.put("guidePrice","452");
        map.put("produceTime","2022-01-01");
        map.put("carType","foil");


        int count = sqlSession.insert("insertCar",map);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertCarByPojo(){
        SqlSession sqlSession = SqlSessionUtil.openSession();

        Car car = new Car(null,"12312","BYD",30.1,"2020-10-01","elec");

        int count = sqlSession.insert("insertCar",car);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();

        int count = sqlSession.delete("deleteById", 15);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateCar(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Car car = new Car(14L,"6452","XiaoMi",19.8,"2021-01-01","elec");
        int count = sqlSession.update("updateCar",car);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Object car = sqlSession.selectOne("selectById",1);
        System.out.println(car);
        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        List<Car> cars = sqlSession.selectList("selectAll");
        for (Car car:cars){
            System.out.println(car);
        }
        sqlSession.close();
    }
}

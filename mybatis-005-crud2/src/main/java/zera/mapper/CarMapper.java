package zera.mapper;

import zera.pojo.Car;

import java.util.List;

public interface CarMapper {
    int insert(Car car);

    int deleteById(Long id);

    int update(Car car);

    Car selectById(Long id);

    List<Car> selectAll();

    List<Car> selectByCarType(String carType);
}

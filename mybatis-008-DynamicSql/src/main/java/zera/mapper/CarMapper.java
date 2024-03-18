package zera.mapper;

import org.apache.ibatis.annotations.Param;
import zera.pojo.Car;

import java.util.List;

public interface CarMapper {
    List<Car> selectByMultiCondition(@Param("brand") String brand, @Param("price") Double guidePrice);
    List<Car> selectByMultiConditionWithWhere(@Param("brand") String brand, @Param("price") Double guidePrice);
    List<Car> selectByMultiConditionWithTrim(@Param("brand") String brand, @Param("price") Double guidePrice);

    int updateBySet(Car car);

    List<Car> selectByChoose(@Param("brand") String brand, @Param("price") Double guidePrice);

    int deleteBatchByForEach(@Param("ids")Long[] ids);

    int insertBatchByForEach(@Param("cars")List<Car> cars);


}

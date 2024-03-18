package zera.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import zera.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {


    List<Student> selectAllByCamelCase();


    List<Student> selectAllByResultMap();


    @MapKey("id")
    Map<Long,Map<String,Object>> selectAllMapMap();
    List<Student> selectByNameAndSex(String name, Character sex);

    List<Student> selectByNameAndSex2(@Param("name") String name, @Param("sex") Character sex);

    List<Map<String,Object>> selectAllListMap();

}

package zera.mapper;

import org.apache.ibatis.annotations.Param;
import zera.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectByNameAndSex(String name, Character sex);

    List<Student> selectByNameAndSex2(@Param("name") String name, @Param("sex") Character sex);

}

package zera.mapper;

import zera.pojo.Student;

import java.util.List;

public interface StudentMapper {

    Student selectById(Integer id);

    Student selectByIdCache(Integer id);
    Student selectByAssociation(Integer id);

    Student selectByStudentId2(Integer id);

    List<Student> selectByClassId(Integer classId);

}

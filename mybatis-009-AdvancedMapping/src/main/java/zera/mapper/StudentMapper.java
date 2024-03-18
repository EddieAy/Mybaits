package zera.mapper;

import zera.pojo.Student;

public interface StudentMapper {

    Student selectById(Integer id);
    Student selectByAssociation(Integer id);

}

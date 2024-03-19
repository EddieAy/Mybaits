package zera.mapper;

import zera.pojo.Clazz;

public interface ClazzMapper {

    Clazz selectByClassId(Integer classId);

    Clazz selectByCollection(Integer classId);

    Clazz selectByClazzDis(Integer classId);
}

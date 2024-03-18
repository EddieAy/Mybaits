package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.StudentMapper;
import zera.pojo.Student;
import zera.util.SqlSessionUtil;

public class StudentMapperTest {

    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectById(1);
        System.out.println(student);
        System.out.println(
                student.getStuId()
        );
        System.out.println(student.getStuName());
        System.out.println(student.getClazz().getClassId());
        System.out.println(student.getClazz().getClassName());
        sqlSession.close();
    }

    @Test
    public void testSelectByAssociation(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectById(1);
        System.out.println(student);
        System.out.println(
                student.getStuId()
        );
        System.out.println(student.getStuName());
        System.out.println(student.getClazz().getClassId());
        System.out.println(student.getClazz().getClassName());
        sqlSession.close();
    }
}

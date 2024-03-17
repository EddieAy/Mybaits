package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.StudentMapper;
import zera.pojo.Student;
import zera.util.SqlSessionUtil;

import java.util.List;

public class StudentMapperTest {

    @Test
    public void testSelectByNameAndSex2(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.selectByNameAndSex2("jack", 'm');
        for (Student s:students){
            System.out.println(s);
        }
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testSelectByNameAndSex(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.selectByNameAndSex("jack", 'm');
        for (Student s:students){
            System.out.println(s);
        }
        sqlSession.commit();
        sqlSession.close();
    }

}

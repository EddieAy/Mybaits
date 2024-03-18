package zera.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zera.mapper.StudentMapper;
import zera.pojo.Student;
import zera.util.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class StudentMapperTest {

    @Test
    public void testSelectAllByCamelCase(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> res = studentMapper.selectAllByCamelCase();
        for (Student s:res){
            System.out.println(s);
        }
        sqlSession.close();
    }
    @Test
    public void testSelectAllByResultMap(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> res = studentMapper.selectAllByResultMap();
        for (Student s:res){
            System.out.println(s);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectAllMapMap(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Map<Long,Map<String,Object>> res = studentMapper.selectAllMapMap();
        System.out.println(res);
        sqlSession.close();
    }
    @Test
    public void testSelectAllListMap(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Map<String,Object>> res = studentMapper.selectAllListMap();
        for (Map<String,Object> map:res){
            System.out.println(map);
        }
        sqlSession.close();
    }

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

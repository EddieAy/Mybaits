package zera.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import zera.mapper.StudentMapper;
import zera.pojo.Student;
import zera.util.SqlSessionUtil;

import java.io.IOException;

public class StudentMapperTest {

    @Test
    public void testSelectById(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectByAssociation(1);
        System.out.println(student);

        Student student2 = studentMapper.selectByAssociation(1);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void testSelectByIdCache() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession1 = sqlSessionFactory.openSession();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession1.getMapper(StudentMapper.class);
        StudentMapper studentMapper2 = sqlSession2.getMapper(StudentMapper.class);

        Student student1 = studentMapper.selectByAssociation(1);
        System.out.println(student1);
        sqlSession1.close();


        Student student2 = studentMapper2.selectByAssociation(1);
        System.out.println(student2);

        sqlSession2.close();
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

    @Test
    public void selectByStudentId2(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectByStudentId2(1);
        System.out.println(student.getStuName());

        System.out.println(student.getClazz().getClassName());
        sqlSession.close();
    }

}

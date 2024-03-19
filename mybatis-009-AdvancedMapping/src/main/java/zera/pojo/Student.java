package zera.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuId;
    private String stuName;

    private Clazz clazz;

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student() {
    }

    public Student(Integer stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

}

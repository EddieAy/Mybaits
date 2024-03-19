package zera.pojo;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable {
    private Integer classId;
    private String className;

    private List<Student> stus;

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", stus=" + stus +
                '}';
    }

    public Clazz() {
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

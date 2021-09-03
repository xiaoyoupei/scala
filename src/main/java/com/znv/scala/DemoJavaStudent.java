package com.znv.scala;

/**
 * @author xiaoyoupei
 * @date 2021-09-02 10:25
 * @Description：
 */
public class DemoJavaStudent {
    private String id;
    private String name;
    private Integer age;

    public DemoJavaStudent(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoJavaStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

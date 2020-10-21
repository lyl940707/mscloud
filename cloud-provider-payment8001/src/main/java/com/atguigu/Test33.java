package com.atguigu;

import java.util.*;
import java.util.stream.Collectors;

public class Test33 {
    public static void main(String[] args) {
        List<Map<String,Object>> result=new ArrayList<>();
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("liyulong",new Chengji("yuwen",100)));
        students.add(new Student("liyulong",new Chengji("shuxue",12)));
        students.add(new Student("liyulong",new Chengji("wuli",123)));
        students.add(new Student("qushishun",new Chengji("yuwen",11)));
        students.add(new Student("qushishun",new Chengji("shuxue",5)));
        students.add(new Student("qushishun",new Chengji("wuli",8)));
        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(collect);
        Map<String,Object> map;
        for(String key :collect.keySet()){
            List<Chengji> c=new ArrayList();
            map=new HashMap<>();
            map.put("name",key);
            for(Student student:collect.get(key)) {
                Chengji chengji = new Chengji();
                chengji.setType(student.getChengji().getType());
                chengji.setScore(student.getChengji().getScore());
                c.add(chengji);
            }
            map.put("list02",c);
            result.add(map);
        }
        System.out.println(result);
    }

}
class Chengji{
    String type;
    int score;

    public Chengji() {
    }

    public Chengji(String type, int score) {
        this.type = type;
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Chengji{" +
                "type='" + type + '\'' +
                ", score=" + score +
                '}';
    }
}
class Student{
    String name;
 Chengji chengji;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chengji=" + chengji +
                '}';
    }

    public Student(String name, Chengji chengji) {
        this.name = name;
        this.chengji = chengji;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chengji getChengji() {
        return chengji;
    }

    public void setChengji(Chengji chengji) {
        this.chengji = chengji;
    }
}
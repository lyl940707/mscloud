package com.atguigu;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class domian {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F', 100));
        personList.add(new Person("Tom", 24, "美国", 'M', 90));
        personList.add(new Person("Harley", 22, "英国", 'F', 96));
        personList.add(new Person("向天笑", 20, "中国", 'M', 98));
        personList.add(new Person("李康", 25, "中国", 'M', 20));
        personList.add(new Person("小梅", 20, "中国", 'F', 49));
        personList.add(new Person("何雪", 21, "中国", 'F', 37));
        personList.add(new Person("何雪1", 23, "中国", 'F', 39));
//        Stream<Person> s = personList.stream();
//        Map<String, Integer> collect = s.collect(Collectors.toMap(e -> e.getName(), e -> e.getAge()));
//        System.out.println(collect);
//        personList.stream().forEach(e->{
//            System.out.println(e.getName());
//        });
//        System.out.println(personList.stream().max((e1,e2)->e2.getScore()-e1.getScore()));
//        System.out.println(personList.stream().min(Comparator.comparing(Person::getAge)));
//        personList.stream().sorted(Comparator.comparing(person -> person.getScore())).forEach(e->{
//            System.out.println(e.toString());
//        });
        System.out.println(personList.stream().map(e->e.getAge()).collect(Collectors.toList()));
        System.out.println(1);
    }


}

class Person implements Comparable<Person> {

    private String name;
    private Integer age;
    private String country;
    private char sex;
    private int score;


    public Person() {

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

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getScore() {
        return score;
    }

    public Person setScore(int score) {
        this.score = score;
        return this;
    }

    public Person(String name, Integer age, String country, char sex, int score) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", sex=" + sex +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public int compareTo(Person o) {
        return o.getScore() - this.getScore();
    }

}
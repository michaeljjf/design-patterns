package com.jiangjf.dp.builder;

import java.math.BigDecimal;

/**
 * @author jiangjf
 * @date 2022/4/9
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private BigDecimal score;
    private BigDecimal weight;
    private Location loc;

    private Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", weight=" + weight +
                ", loc=" + loc +
                '}';
    }

    static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        public PersonBuilder score(BigDecimal score) {
            person.score = score;
            return this;
        }

        public PersonBuilder weight(BigDecimal weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder loc(String city, String address) {
            person.loc = new Location(city, address);
            return this;
        }

        public Person build() {
            return person;
        }

    }
}

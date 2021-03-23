package com.kishore.kamal.funcionalInterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerPredicateExample {

    private static Predicate<Person> ageGreateThan18 = p -> p.getAge() >= 18;

    private static Consumer<Person> print = p -> System.out.println(p.getName()+" : " + p.getAge());

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for(int i = 0; i < 10 ; i++){
            personList.add(new Person(i + 10 , String.valueOf(i)));
        }
        System.out.println(personList);
        System.out.println("---------------------");
        personList = personList.stream().filter(p -> ageGreateThan18.test(p)).collect(Collectors.toList());
        System.out.println(personList);
        System.out.println("---------------------");
        personList.forEach(p -> {
            if(ageGreateThan18.test(p)){
                print.accept(p);
            }
        });



    }

    private static class Person{
        int age;
        String name;

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

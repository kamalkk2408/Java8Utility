package com.kishore.kamal.optionals;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
       Optional<String> name = getName(null);
        System.out.println(name.isPresent() ? name: "Name not present");

        Optional<String> name1 = getName("kamal");
        System.out.println(name1.isPresent() ? name1: "Name not present");

//        Optional<String> name2 = getName();
//        System.out.println(name2.isPresent() ? name2: "Name not present");

    }

    static Optional<String> getName(String name){
      return Optional.ofNullable(name);
    }
}

# Java8Utility
1. stream().distinct();
2. stream().collect();
- Lambda : (input) -> (body)
- Advantages: 
    - Functional Interface : 
        1. @FunctionalInterface : optional though
        2. Interface contains only one abstract function
        3. They can have only one functionality to exhibit
        4. Lambda expressions can be used to represent the instance of a functional interface
        5. Runnable, ActionListener, Comparable are some of the examples of functional Interfaces
        6. Can contain default and static methods
        7. Pillar Interfaces in Java8
            1. Consumer
                1. accept()
                2. default method : andThen(Consumer<>)
                3. chaining of consumers can be done using c1.andThen(c2).accept(x)
                4. Doesn't Return a data
                5. BiConsumer: 
                    1. BiConsumer<Integer, Integer> con1 = (a,b) -> System.out.println(a + b);
            2. Predicate
                1. always returns true/false(boolean)
                    1. test()
                    2. or
                    3. and
                    4. negate
                    5. Predicate < Integer> lessThan = a -> (a >= 50);
                    6. lessThan(p1).and(p2).or(p3).test(150);
                    7. BiPredicate
                        1. BiPredicate<Integer, String > p = (height, gender) -> ();
                    8. Predicate & Bi-Predicate are siblings in a way.
            3. Function
                1. Inteterface Function<T,R> 
                    1. We can assign an object to a function type and pass it. 
                    2. Its a feature introduced in java 8.
                    3. T is input & R is the output
                    4. Function<String, String> f1 = name -> name.toUpperCase();
                    5. Methods : 
                        1. apply()
                        2. f1.andThen(f2).apply("java");
                        3. fi.compose(f2).apply("java");
                    6. BiFunction: 
                        1. BiFunction<T,U, R>    : T & U are input argument & R is output.
                        2. It extends function interface
                        3. BiFunction<String, String, String> f = (a, b) -> (a +" : "+ b);
                        4. BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> f;
                    7. UnaryOperator<T> :
                        1. input/output type is T
                        2. It extends Function Interface
                    8. BinaryOperator<T,T>
                        1. maxBy & minBy methods & You need to have comparator if you want to use it .
                        2. Extends Bi Function
                        3. Comparator<Integer> comp = (a,b) -> a.compareTo(b);
                            BinaryOperator<Integer> bo = BinaryOperator.maxBy(comp);
                            bo.apply(199,190);
                    
            4. Supplier<T>: 
                1. T get() : it will return the data. 
                2. 
        8.
         
    
        
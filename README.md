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
                    

            3. Function
            4. Supplier
        8.
         
    
        
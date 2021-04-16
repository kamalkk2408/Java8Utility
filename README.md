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
        8. Method-Reference : It is a feature introduced in Java8, used for refering to lambda expression.
            1. Types of Method Reference : 
                1. Reference to Static method
                    1. ClassName :: method name
                    2. For Eg: Integer::compare
                2. Reference to an instance method.
                3. Reference to a constructor
        9. Local Variables : 
            1. Lambdas's are allowed to use local variable but not allowed for modification{Effectively Final}
            2. Concurrency Operation are effective in that way
            3. Class Level variable or instance variable are allowed to modify
            4. Effectively Final
        10. Streams : Sequence of Data Elements
            1. Can be performed either Sequentially or Parallel.
            2. Do not support indexed access
            3. Lazy access supports
            4. Designed for Lambdass
            5. Stream API: 
                1. Streams don't change the original data structure, they only provide the result as per the pipelined methods.
                2. Each intermediate operation is lazily executed and returns a stream as a result.
                3. APIs : 
                    1. map()
                        1. Transform one type to another type
                        2. Not related to Map   Collection
                        3. stream().map()
                    2. flatMap()
                        1. Transform one type to another type.
                        2. Used to flatten a stream of collection
                        3. Apply one-to-many transformation to the elements.
                        4. Creates a new Stream once flatten the elements
                        5. stream().flatMap(List::stream)
                    3. mapToint(i ->(i)).sum()//count()
                    4. .reduce(a, (a,b ) -> a* b) : first parameter is initial value & second is bifunction
                    5. Colllectors.maxBy()
                    6. Collectors.minBy()
                    7. .limit(2)
                    8. .skip(2)
                    9. .allMatch()
                    10. .anyMatch()
                    11. .findFirst()
                    12. findAny()
                    13. sorted(Comparator.comparing(Person::getName).reversed)
                    14. distinct()
                    15. count()
                    16. filter()
            6. About Computation on Data.
            7. Internal Iteration using forEach
            8. Only one Iteration on Stream is possible
            9. peek() is used for debugging as we can access single element in this method
        11. Factory Method's
            1. Stream.iterate
                1. Generates Infinite sequence
                2. i/p : Supplier
            2. Stream.generate
                1. i/p (initialValue, UnaryOperator)
            3. Stream.of
                1. 
        12. Numeric Stream
            1.Types : 
                1.IntStream -> primitive int 
                    1. Boxing and unboxing doesn't happen in this case
                    2. IntStream iStream = IntSream.rangeClosed(1,6);
                    3.iStream.sum();
                2. LongStream : for long dataType
            2.Factory Methods: 
                1. IntStream.range(x, y) : y is not included in this case
                2. IntStream.rangeClosed(x,y) : y is included in this case
                3. max(), min(), average()
                4. boxed() & mapToInt(Integer::intValue)
                5. mapToDouble(x -> x)
                6. mapToLong(x -> x)
                7. mapToObject(x -> x)
        13. Terminal Operation
            1. Join
                1. Collectors.joining()
                2. Collectors.joining("-")
                2. Collectrs.joining("-", "[","]");
            2. mapping()
                1. collect(mapping(Person::getName, Collectors.toList()));
                2. we can skip map using above syntax
            3. count()
                1. collect(Collectors.counting())
            4. summingInt()
                1. Collectors.summingInt(Person::getKids)
            5. averagingInt()
                1. Collectors.averagingInt(Person::getHeight)
            6. GroupingBy:
                1. Collectors.groupBy(Person::getGender);
                2. Collectors.groupingBy(a -> "bbb".compareTo(a) >0 ?"Greater": "Smaller")
            7. Multilevel Grouping : 
                1. collect(Collectors.groupingBy(Person::getName, groupingBy()));
                2. collect(Collectors.groupingBy(Person::getName, sumingInt()));
                3. collect(Collectors.groupingBy(Person::getName, HashMap::new , Collectors.toList()));
            8. PartitioningBy: 
                1.will always return map with key as boolean && based on a predicate
                2. partitionBy(predicate)
                3. partitionBy(predicate, Collectors)
                
                
                            
             
                
                
        
                
        
         
    
        
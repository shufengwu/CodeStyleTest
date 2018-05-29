package com.delta.exception;

public class OptionalTest {
    public static void main(String[] args) {
        /**
         * of
         */
        //Optional<String> s1 = Optional.of("delta");
        //传入参数为null会报NPE
        //Optional<String> s2 = Optional.of(null);
        //System.out.println(s1.get());


        /**
         * ofNullable
         */

        /*try{
            Optional<String> s3 = Optional.ofNullable(null);
            System.out.println(s3.get());
        }catch (NoSuchElementException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }*/


        /**
         * isPresent
         */
        /*Optional<String> s4 = Optional.ofNullable(null);
        if(s4.isPresent()){
            System.out.println("present");
        }else{
            System.out.println("absence");
        }*/

        /**
         * get
         */
        /*Optional<String> s5 = Optional.ofNullable(null);
        try{
            System.out.println(s5.get());
        }catch (NoSuchElementException nsee){
            System.out.println(nsee.getMessage());
        }*/

        /**
         * ifPresent
         */
        //Optional<String> s6 = Optional.ofNullable("wsf");
        /*Optional<String> s6 = Optional.ofNullable(null);
        s6.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s+" hehe");
            }
        });*/

        /**
         * orElse
         */
        //Optional<String> s7 = Optional.ofNullable(null);
        /*Optional<String> s7 = Optional.ofNullable("wsf");
        System.out.println(s7.orElse("default value"));
*/
        /**
         * orElseGet
         */
        //Optional<String> s8 = Optional.ofNullable("wsf");
        /*Optional<String> s8 = Optional.ofNullable(null);
        System.out.println(s8.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "default value";
            }
        }));*/

        /**
         * orElseThrow
         */
        /*Optional<String> s9 = Optional.ofNullable(null);
        try{
            s9.orElseThrow(new Supplier<ValueAbsentException>() {
                @Override
                public ValueAbsentException get() {
                    return new ValueAbsentException("无值");
                }
            });
        }catch (Exception t){
            System.out.println(t.getMessage());
            t.getMessage();
        }*/

        /**
         * map
         */
        /*Optional<String> s10 = Optional.ofNullable("wsf");
        String upperName = s10.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).orElse("no value");
        System.out.println(upperName);

        *//**
         * flatMap
         *//*
        upperName = s10.flatMap(new Function<String, Optional<String>>() {
            @Override
            public Optional<String> apply(String s) {
                return Optional.of(s.toUpperCase());
            }
        }).orElse("no value");
        System.out.println(upperName);*/


        /**
         * filter
         */
        /*Optional<String> s11 = Optional.ofNullable("wsfwsfwsf");
        //filter方法检查给定的Option值是否满足某些条件。
        //如果满足则返回同一个Option实例，否则返回空Optional。
        Optional<String> longName = s11.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>=6;
            }
        });
        System.out.println(longName.orElse("The name is less than 6 characters"));//输出Sanaulla

        //另一个例子是Optional值不满足filter指定的条件。
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>=6;
            }
        });
        //输出：name长度不足6字符
        System.out.println(shortName.orElse("The name is less than 6 characters"));*/

        /**
         * map级联
         */
        /*Optional<String> s12 = Optional.ofNullable("wsfwsfwsf");
        String res = s12.map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println("substring");
                return s.substring(0, 6);
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println("toUpperCase");
                return s.toUpperCase();
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println("toLowerCase");
                return s.toLowerCase();
            }
        }).orElse("no value");
        System.out.println(res);*/

    }
}

class ValueAbsentException extends Exception {
    String msg;

    public ValueAbsentException() {
        super();
    }

    public ValueAbsentException(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return "no value " + msg;
    }
}

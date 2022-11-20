package io.codelex.generics.practice.exercise1;

public class ListTest {

    public static void main(String[] args) {
        GenericList<Object> generic = new GenericList<>();
        generic.add(0, 1);
        generic.add(1, "Java");
        generic.add(2, 3);
        System.out.println(generic.get(0));
        System.out.println(generic.get(1));
        System.out.println(generic.get(2));

        MyList mine = new MyList();
        mine.add(0, 1);
        mine.add(1, 2);
        mine.add(2, "java");
        System.out.println(mine.get(0));
        System.out.println(mine.get(1));
        System.out.println(mine.get(2));

        MyStringImpleList stringList = new MyStringImpleList();

        stringList.add(0, "java 8");
        stringList.add(1, 55);
        stringList.add(2, 5.55);

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList.get(2));

        MyIntImpleList intList = new MyIntImpleList();
        try {
            intList.add(0, "java 8");
            intList.add(1, 55);
            intList.add(2, 5.55);

            System.out.println(intList.get(0));
            System.out.println(intList.get(1));
            System.out.println(intList.get(2));

        } catch (ClassCastException e) {
            System.out.println("This kind of list only accepts params that can be cast to Integer");
        }

    }


}

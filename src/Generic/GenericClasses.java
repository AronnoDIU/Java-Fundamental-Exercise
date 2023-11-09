package Generic;

// User defined Generic classes
public class GenericClasses {
    public static void main(String[] args) {

        GenericTest<Integer> genericTest1 = new GenericTest<>(10);
        System.out.println(genericTest1.getObj());

        GenericTest<String> genericTest2 = new GenericTest<>("Yeasir");
        System.out.println(genericTest2.getObj());

        GenericTest<Boolean> genericTest3 = new GenericTest<>(true);
        System.out.println(genericTest3.getObj());

        GenericTest<Double> genericTest4 = new GenericTest<>(10.5);
        System.out.println(genericTest4.getObj());

        GenericTest<Float> genericTest5 = new GenericTest<>(10.5f);
        System.out.println(genericTest5.getObj());

        GenericTest<Character> genericTest6 = new GenericTest<>('A');
        System.out.println(genericTest6.getObj());
    }
}

class GenericTest<T> {
    T obj; // An object of type T is created.

    GenericTest(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

/*Expected Output:

10
Yeasir
true
10.5
10.5
A

* */
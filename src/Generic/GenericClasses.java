package Generic;

// User defined Generic classes
public class GenericClasses {
    public static void main(String[] args) {

        GenericTest<Integer> genericTest1 = new GenericTest<>(10);
        System.out.println("Integer Type : " + genericTest1.getObj());

        GenericTest<String> genericTest2 = new GenericTest<>("Yeasir Arafat Aronno");
        System.out.println("String Type : " + genericTest2.getObj());

        GenericTest<Boolean> genericTest3 = new GenericTest<>(true);
        System.out.println("Boolean Type : " + genericTest3.getObj());

        GenericTest<Double> genericTest4 = new GenericTest<>(10.5);
        System.out.println("Double Type : " + genericTest4.getObj());

        GenericTest<Float> genericTest5 = new GenericTest<>(10.5f);
        System.out.println("Float Type : " + genericTest5.getObj());

        GenericTest<Character> genericTest6 = new GenericTest<>('A');
        System.out.println("Character Type : " + genericTest6.getObj());
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

Integer Type : 10
String Type : Yeasir Arafat Aronno
Boolean Type : true
Double Type : 10.5
Float Type : 10.5
Character Type : A

* */
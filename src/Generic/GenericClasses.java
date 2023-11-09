package Generic;

// User defined Generic classes
public class GenericClasses {
    public static void main(String[] args) {

        GenericTest<Integer> gt = new GenericTest<>(10);
        System.out.println(gt.getObj());

        GenericTest<String> gt1 = new GenericTest<>("Yeasir");
        System.out.println(gt1.getObj());

        GenericTest<Boolean> gt2 = new GenericTest<>(true);
        System.out.println(gt2.getObj());

        GenericTest<Double> gt3 = new GenericTest<>(10.5);
        System.out.println(gt3.getObj());

        GenericTest<Float> gt4 = new GenericTest<>(10.5f);
        System.out.println(gt4.getObj());

        GenericTest<Character> gt5 = new GenericTest<>('A');
        System.out.println(gt5.getObj());
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
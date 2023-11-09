package Generic;

// User defined Generic classes
public class GenericClasses {
    public static void main(String[] args) {

        GSingleType<Integer> GSingleType1 = new GSingleType<>(10);
        System.out.println("Integer Type : " + GSingleType1.getObject());

        GSingleType<String> GSingleType2 = new GSingleType<>("Yeasir Arafat Aronno");
        System.out.println("String Type : " + GSingleType2.getObject());

        GSingleType<Boolean> GSingleType3 = new GSingleType<>(true);
        System.out.println("Boolean Type : " + GSingleType3.getObject());

        GSingleType<Double> GSingleType4 = new GSingleType<>(10.5);
        System.out.println("Double Type : " + GSingleType4.getObject());

        GSingleType<Float> GSingleType5 = new GSingleType<>(10.5f);
        System.out.println("Float Type : " + GSingleType5.getObject());

        GSingleType<Character> GSingleType6 = new GSingleType<>('A');
        System.out.println("Character Type : " + GSingleType6.getObject());
    }
}

class GSingleType<T> {
    T object; // An object of type T is created.

    GSingleType(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}

// We can also pass multiple Type parameters in Generic classes.
// Multiple type parameters in Java Generics.
class GMultiType<T, U, V> {
    T objectT;
    U objectU;
    V objectV;

    GMultiType(T objectT, U objectU, V objectV) {
        this.objectT = objectT;
        this.objectU = objectU;
        this.objectV = objectV;
    }

    public T getObj1() {
        return objectT;

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
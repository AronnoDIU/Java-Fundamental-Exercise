package Generic;

// User defined Generic classes
public class GenericClasses {
    public static void main(String[] args) {

    }
}

class GenericTest<T>{
    T obj;
    GenericTest(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}
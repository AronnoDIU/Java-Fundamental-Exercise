package WrapperClasses;

public class CustomWrapper {
    public static void main(String[] args) {
        TestCustomWrapper testCustomWrapper = new TestCustomWrapper(10);
        System.out.println(testCustomWrapper);
    }
}

class TestCustomWrapper {
    private int i;

    TestCustomWrapper() {
    }

    TestCustomWrapper(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }

    public void setValue(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

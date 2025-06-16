package generic.test.ex1;

public class Pair <T1, T2>{
    public T1 key;
    public T2 value;

    public T1 getFirst() {
        return key;
    }

    public void setFirst(T1 key) {
        this.key = key;
    }

    public T2 getSeconds() {
        return value;
    }

    public void setSeconds(T2 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

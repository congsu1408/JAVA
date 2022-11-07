package J07017;

public class Pair<T, S> {
    T first;
    S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public boolean isPrime() {
        int n = (Integer) this.second;
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        int m = (Integer) this.first;
        if (m < 2) return false;
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) return false;
        }
        return m > 1 && n > 1;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }
}

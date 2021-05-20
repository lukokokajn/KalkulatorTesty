public class Logic {
    public int scitani(int a, int b) {
        return a + b;
    }

    public int odcitani(int a, int b) {
        return a - b;
    }

    public int nasobeni(int a, int b) {
        return a * b;
    }

    public int deleni(int a, int b) {
        return a / b;
    }

    public int mocnina(int a) {
        return a * a;
    }

    public int factorial(int a) {
        int num = 1;
        for (int i = 2; i <= a; i++) {
            num = num * i;
        }
        return num;
    }
}
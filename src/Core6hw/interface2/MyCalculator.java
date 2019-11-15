package Core6hw.interface2;

import Core6hw.interface1.Numerable;

public class MyCalculator implements Numerable {
    public MyCalculator (){};

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        return x-y;
    }

    @Override
    public int mult(int x, int y) {
        return x*y;
    }

    @Override
    public int dev(int x, int y) {
        return x/y;
    }

}

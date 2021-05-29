package fazia.fazia.utils;

public class InitialiseWeightsNormal implements IInitialiseWeights {

    @Override
    public double[] initWeights(int size) {
        double[] array = new double[size];
        if (size > 0) {
            for (int i = 0; i <= size; i++) {
                array[i] = Math.random();
            }
        } else {
            array = new double[0];
        }
        return array;
    }
}

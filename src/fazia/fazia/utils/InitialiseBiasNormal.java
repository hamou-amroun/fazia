package fazia.fazia.utils;

public class InitialiseBiasNormal implements IInitialiseBias {

    @Override
    public double initBias() {
        return Math.random();
    }
}

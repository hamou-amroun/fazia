package fazia.fazia.losses;

public abstract class ILoss {

    public abstract double[] loss(double[] y, double[] yPredit);
}

package fazia.fazia.models;

public interface IModel {

    public double[] forward(double[] input);

    public double backward(double[] output, double[] predicted);

    public void learn();
}

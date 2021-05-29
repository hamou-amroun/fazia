package fazia.fazia.Layers;

public interface ILayer {


    public double[] forward(double[] inputs);

    public double[] backward(double[] dy);

}

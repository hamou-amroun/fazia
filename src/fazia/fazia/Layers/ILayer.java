package fazia.fazia.Layers;

import fazia.fazia.neurons.INeuron;

import java.util.ArrayList;

public abstract class ILayer extends ArrayList<INeuron> {


    public abstract double[] forward(double[] inputs);

    public abstract double[] backward(double[] dy);

}

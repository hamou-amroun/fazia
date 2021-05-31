package fazia.fazia.models;

import fazia.fazia.Layers.LayerLinear;
import fazia.fazia.losses.ILoss;

public class MLP implements IModel {

    private LayerLinear[] layers;
    private ILoss lossFunction;
    public double loss;
    public double[] input;
    public double[] output;
    public double[] predicted;

    @Override
    public double[] forward(double[] input) {
        for (int i = 0; i < layers.length; i++)
            input = layers[i].forward(input); //Appel la méthode forward de layer
        return input;
    }

    @Override
    public double backward(double[] output, double[] predicted) {
        double[] loss = this.lossFunction.loss(output, predicted) ;
        double[] dy = loss ;
        for (int i = layers.length - 1 ; i >= 0; i -- )
            dy = layers[i].backward(dy); //Appel la méthode backward de layer
        return getLoss(loss) ;
    }

    @Override
    public void learn() {
        //  La méthode learn combinera les deux passes
        //avant et arrières nécessaires à l’apprentissage du MLP et sauvegardera l’erreur observée (attribut
        //loss)
    }

    public double getLoss(double[] dy) {
        double loss = 0.0;
        for (int i = 0; i < dy.length; i++)
            loss += dy[i];
        return loss /= dy.length;
    }

    public static int getMaxIndice(double[] t) {
        int max = -1;
        double maxValue = -Double.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > maxValue) {
                maxValue = t[i];
                max = i;
            }
        }
        return max;
    }
}

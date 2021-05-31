package fazia.fazia.neurons;

import fazia.fazia.transfertFunctions.ITransfertFunction;
import fazia.fazia.utils.IInitialiseBias;
import fazia.fazia.utils.IInitialiseWeights;

public class NeuronLinear implements INeuron {

    //  représentant les poids associés à ce neurone
    private double[] w;

    // sauvegardant l’entrée reçue par la méthode forward et yt
    //sauvegardant la sortie générée y (double) par forward,
    private double[] xt;


    // sauvegardant la sortie générée y (double) par forward,
    private double yt;

    // pour le biais
    private double b;

    // pour le taux d’apprentissage
    private double lr;


    // nécessaire dans les algorithmes des méthodes
    //forward et backward de NeuronLinear.
    private ITransfertFunction tf;


    public NeuronLinear(double lr,
                        int inputSize,
                        IInitialiseWeights initW,
                        IInitialiseBias initB,
                        ITransfertFunction tf) {
        this.w = initW.initWeights(inputSize);
        this.b = initB.initBias();
        this.lr = lr;
        this.tf = tf;
    }

    @Override
    public double forward(double[] input) {
        // Redéfinissez également les deux méthodes forward et backward définies dans INeuron dont
        //vous trouverez le pseudo-code dans la présentation du projet en début de sujet (section II).
        this.xt = input ;
        double output = 0.0 ;
        for (int i = 0; i < input.length; i++)
            output += this.w[i] * input[i] ; // (Figure 1)
        this.yt = this.tf.ft(output + this.b); // (Figure 1)
        return this.yt ;
    }

    @Override
    public double[] backward(double dy, double[] dxt) {
        double dxty = this.tf.dft(this.yt) * dy;
        for (int i = 0; i < w.length; i++) {
            dxt[i] += this.w[i] * dxty ;
            this.w[i] += this.xt[i] * dxty * this.lr ;
        }
        this.b += dy * this.lr ;
        return dxt ;
    }

    @Override
    public int getWSize() {
        return this.w.length;
    }
}

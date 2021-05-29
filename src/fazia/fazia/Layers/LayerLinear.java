package fazia.fazia.Layers;

import com.amroun.fazia.neurons.INeuron;
import com.amroun.fazia.neurons.NeuronLinear;
import com.amroun.fazia.transfertFunctions.ITransfertFunction;
import com.amroun.fazia.utils.IInitialiseBias;
import com.amroun.fazia.utils.IInitialiseWeights;

public class LayerLinear extends ILayer {


    // Ecrire un constructeur permettant d’ajouter les n ( nombre de sorites) neurones (NeuronLinear) dans
    //la liste
    public LayerLinear(int inputSize, int outputSize, double lr,
                       IInitialiseWeights initWeights,
                       IInitialiseBias initBias,
                       ITransfertFunction tf) {

    }


    // redéfinirez les deux
    //méthodes forward et backward en vous aidant des algorithmes de la section II)
    @Override
    public double[] forward(double[] inputs) {
        double[] out = new double[this.size()];
        int pos = 0;
        for (NeuronLinear neuron) //Boucle for à modifier …
            out[pos++] = neuron.forward(inputs); //Appel la méthode forward de neurone
        return out;
    }

    @Override
    public double[] backward(double[] dy) {
        int pos = 0;
        double[] dxt = new double[this.get(0).getWSize()];
        for (INeuron neuron)
            dxt = neuron.backward(dy[pos++], dxt);//Appel la méthode backward de neurone
        return dxt;
    }
}

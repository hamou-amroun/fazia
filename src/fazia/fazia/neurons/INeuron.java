package fazia.fazia.neurons;

public interface INeuron {


    // la méthode forward qui retourne un double représentant la sortie du neurone et prend en
    // paramètre un tableau de double contenant les valeurs d’entrée;
    public double forward(double[] inputs);

    // backward retournant l’accumulation du gradient de l’entrée (tableau de double) et prenant en paramètre ce
    //gradient (tableau de double)
    public double[] backward(double[] inputs);

    //  retournant la taille de w.
    public int getWSize();
}

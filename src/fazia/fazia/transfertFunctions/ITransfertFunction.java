package fazia.fazia.transfertFunctions;

public abstract class  ITransfertFunction {

    public abstract double ft(double v);
    public abstract double dft(double v);

    public double ftt(double v) {return (1 / (1 + Math.exp(-v))) ;}
    public double dftt(double v) {return (v * ( 1 - v ) ) ;}

}

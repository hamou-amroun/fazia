package fazia.fazia.transfertFunctions;

public class TransfertFunctionTanh extends ITransfertFunction {

    @Override
    public double ft(double v) {
        double e = Math.exp(v);
        double me = Math.exp(-v);
        return ((e - me) / (e + me));
    }

    @Override
    public double dft(double v) {
        return (1 - v * v);
    }

}

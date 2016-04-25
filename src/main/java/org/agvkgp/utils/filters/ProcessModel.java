public interface ProcessModel {
    public DoubleMatrix stateTransitionMatrix();
    public DoubleMatrix controlMatrix();
    public DoubleMatrix processNoise();
}

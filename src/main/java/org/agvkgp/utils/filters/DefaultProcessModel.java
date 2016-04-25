public class DefaultProcessModel {
    private final DoubleMatrix stateTransitionMatrix;
    private final DoubleMatrix controlMatrix;
    private final DoubleMatrix processNoise;

    public DefaultProcessModel(final DoubleMatrix stateTransitionMatrixP, final DoubleMatrix controlMatrixP, final DoubleMatrix processNoiseP) {
        this.stateTransitionMatrix = stateTransitionMatrixP;
        this.controlMatrix = controlMatrixP;
        this.processNoise = processNoiseP;
    }

    public DoubleMatrix stateTransitionMatrix() {
        return this.stateTransitionMatrix;
    }

    public DoubleMatrix controlMatrix() {
        return this.controlMatrix;
    }

    public DoubleMatrix processNoise() {
        return this.processNoise;
    }
}

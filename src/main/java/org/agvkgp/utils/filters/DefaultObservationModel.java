public class DefaultObservationModel {
    private final DoubleMatrix measurmentMatrix;
    private final DoubleMatrix measurmentNoise;

    public DefaultObservationModel(final DoubleMatrix measurmentMatrixP, final DoubleMatrix measurmentNoiseP) {
        this.measurmentMatrix = measurmentMatrixP;
        this.measurmentNoise = measurmentNoiseP;
    }

    public DoubleMatrix measurmentMatrix() {
        return this.measurmentMatrix;
    }

    public DoubleMatrix measurmentNoise() {
        return this.measurmentNoise;
    }
}

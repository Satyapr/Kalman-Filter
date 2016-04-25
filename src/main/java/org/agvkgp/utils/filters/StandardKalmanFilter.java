public class StandardKalmanFilter extends KalmanFilter {
    private final ProcessModel processModel;
    private final ObservationModel observationModel;
    private DoubleVector stateEstimate;
    private DoubleVector errorCovarience;

    public StandardKalmanFilter(final ProcessModel processModelP, final ObservationModel observationModelP) {
        this.processModel = processModelP;
        this.observationModel = observationModelP;
    }

    public DoubleVector stateEstimate() {
        return this.stateEstimate;
    }

    public ProcessModel processModel() {
        return this.processModel;
    }

    public ObservationModel observationModel() {
        return this.observationModel;
    }

    public void predict(final DoubleVector u) {
        final DoubleMatrix stateTransitionMatrix = this.processModel.stateTransitionMatrix();
        final DoubleMatrix controlMatrix = this.processModel.controlMatrix();

        this.stateEstimate = stateTransitionMatrix
                        .multiply(stateEstimate)
                        .add(controlMatrix.multiply(u));

        this.errorCovarience = stateTransitionMatrix
                                .multiply(errorCovarience)
                                .multiply(stateTransitionMatrix
                                    .transpose())
                                .add(processModel.processNoise());
    }

    public void update(final DoubleVector z) {
        final DoubleMatrix measurmentMatrix = this.observationModel.measurmentMatrix();
        final DoubleMatrix measurmentMatrixT = measurmentMatrix.transpose();

        final DoubleVector innovation = z.subtract(measurmentMatrix.multiply(this.stateEstimate));

        final DoubleMatrix innovationCovarience = measurmentMatrix
                                                .multiply(this.errorCovarience)
                                                .multiply(measurmentMatrixT)
                                                .add(observationModel.measurmentNoise());

        final DoubleMatrix kalmanGain = this.errorCovarience
                                        .subtract(measurmentMatrixT
                                            .multiply(innovationCovarience.inverse()));

        final DoubleMatrix identity = MatrixUtils.doubleIdentityMatrix(kalmanGain.rowDimension());

        this.stateEstimate = this.stateEstimate.add(kalmanGain.multiply(innovation));

        this.errorCovarience = identity.subtract(kalmanGain.multiply(measurmentMatrix))
                                 .multiply(this.errorCovarience);
    }
}

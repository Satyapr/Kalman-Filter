public interface KalmanFilter {
    DoubleVector stateEstimate();
    ProcessModel processModel();
    ObservationModel observationModel();

    void predict(final DoubleVector u);
    void update(final DoubleVector z);
}

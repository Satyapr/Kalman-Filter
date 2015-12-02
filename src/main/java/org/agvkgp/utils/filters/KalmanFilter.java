public abstract class KalmanFilter {
	// protected KalmanFilter(final ProcessModel processModelP, final ObservationModel observationModelP);
	
	public abstract DoubleVector getStateEstimate();
	public abstract ProcessModel getProcessModel();
	public abstract ObservationModel getObservationModel();
	
	public abstract void predict(final DoubleVector u);
	public abstract void update(final DoubleVector z);

	public static KalmanFilter create(final ProcessModel processModelP, final ObservationModel observationModelP) {
		return new StandardKalmanFilter(processModelP, observationModelP);
	}
}
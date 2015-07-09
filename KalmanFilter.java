public abstract class KalmanFilter {
	protected KalmanFilter(final ProcessModel processModelP, final ObservationModel observationModelP);
	
	public RealVector getStateEstimation();
	public ProcessModel getProcessModel();
	public ObservationModel getObservationModel();
	
	public void predict();
	public void update(RealVector z);


	public static KalmanFilter create(final ProcessModel processModelP, final ObservationModel observationModelP);
}
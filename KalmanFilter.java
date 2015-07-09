public class KalManFilter {

	final ProcessModel processModel;
	final ObservationModel observationModel;
	protected KalManFilter(final ProcessModel processModel, final ObservationModel observationModel) {
		this.processModel = processModel;
		this.observationModel = observationModel;
	}
	public RealVector predict() {
		
	}
	public void update(RealVector z);
}
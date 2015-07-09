public class DefaultObservationModel {
	private final DoubleMatrix measurmentMatrix;
	private final DoubleMatrix measurmentNoise;
	
	public DefaultObservationModel(final DoubleMatrix measurmentMatrixP, final DoubleMatrix measurmentNoiseP) {
		this.measurmentMatrix = measurmentMatrixP;
		this.measurmentNoise = measurmentNoiseP;
	}

	public DoubleMatrix getMeasurmentMatrix() {
		return this.measurmentMatrix;
	}

	public DoubleMatrix getMeasurmentNoise() {
		return this.measurmentNoise;
	}
}
public class DefaultProcessModel {
	private final DoubleMatrix stateTransitionMatrix;
	private final DoubleMatrix controlMatrix;
	private final DoubleMatrix processNoise;

	public DefaultProcessModel(final DoubleMatrix stateTransitionMatrixP, final DoubleMatrix controlMatrixP, final DoubleMatrix processNoiseP) {
		this.stateTransitionMatrix = stateTransitionMatrixP;
		this.controlMatrix = controlMatrixP;
		this.processNoise = processNoiseP;
	}

	public DoubleMatrix getStateTransitionMatrix() {
		return this.stateTransitionMatrix;
	}

	public DoubleMatrix getControlMatrix() {
		return this.controlMatrix;
	}

	public DoubleMatrix getProcessNoise() {
		return this.processNoise;
	}
}
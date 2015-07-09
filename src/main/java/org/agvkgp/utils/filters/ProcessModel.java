public interface ProcessModel {
	public DoubleMatrix getStateTransitionMatrix();
	public DoubleMatrix getControlMatrix();
	public DoubleMatrix getProcessNoise();

	public DoubleMatrix getInitialErrorCovarience();
	public DoubleVector getInitialStateEstimate();
}
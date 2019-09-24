package edu.kit.ipd.sdq.kamp.propagation;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;

/**
 * Sub-classes should implement a model-specific change propagation algorithm.
 */
public interface AbstractChangePropagationAnalysis<T extends AbstractArchitectureVersion<?>> {

	void runChangePropagationAnalysis(T version);
	
}

package edu.kit.ipd.sdq.kamp.architecture;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

/**
 * References the in-memory representations of all relevant model files. Should be 
 * extended to add further attributes for further models.
 */
public abstract class AbstractArchitectureVersion<T extends AbstractModificationRepository<?, ?>> {
	
	private String name;
	private T modificationMarkRepository;

	protected AbstractArchitectureVersion(String name, T modificationMarkRepository) {
		this.setName(name);
		this.setModificationMarkRepository(modificationMarkRepository);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getModificationMarkRepository() {
		return modificationMarkRepository;
	}

	public void setModificationMarkRepository(T modificationMarkRepository) {
		this.modificationMarkRepository = modificationMarkRepository;
	}
	
}

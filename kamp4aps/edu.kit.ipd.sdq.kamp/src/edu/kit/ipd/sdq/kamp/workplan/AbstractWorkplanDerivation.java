package edu.kit.ipd.sdq.kamp.workplan;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.workplan.Activity;

/**
 * Calculates the work plan for an architecture, considering modifications detected 
 * by the {@link AbstractChangePropagationAnalysis} (which should be run before 
 * determining the work plan) as well as added and removed architecture elements
 * (differences between base and target version of the model files).
 */
public abstract class AbstractWorkplanDerivation<T extends AbstractArchitectureVersion<?>> {
	
	/**
	 * Main method for determining the work plan. You should 
	 * <ul><li>use {@link #calculateDiffModel(EObject, EObject)}
	 * and {@link #deriveAddAndRemoveActivities(List)} for each relevant
	 * architecture model file to define add/remove activities.</li>
	 * <li>use the modificationmarks model of the change propagation, accessible
	 * via {@link AbstractArchitectureVersion#getModificationMarkRepository()}, to
	 * create modification activities.</li></ul>
	 */
	public abstract List<Activity> deriveWorkplan(T baseVersion, T targetVersion);
	
	/**
	 * Processes a single model difference. You can use {@link #detectionRuleAdded(Diff, Class)} 
	 * and {@link #detectionRuleDeleted(Diff, Class)} to find out the kind of change.
	 * For getting the class parameter, you could iterate through the classes defined 
	 * by {@link AbstractActivityElementType#getElementClass()}, so you also know which 
	 * kind of element was added/removed and create a suitable {@link Activity}. The
	 * activity should be added to the <code>workplan</code> parameter.
	 */
	protected abstract void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan);

	/**
	 * Finds the differences between two EObjects (one could represent the top-level 
	 * element of an "old" (= base, source) model, the other one of a slightly 
	 * changed (= new, target) model with added and removed elements).
	 */
	public static List<Diff> calculateDiffModel(EObject source, EObject target) {
		IComparisonScope scope = new DefaultComparisonScope(target, source, null);
		Comparison comparison = EMFCompare.builder().build().compare(scope);

		List<Diff> differences = comparison.getDifferences();
				
		return differences;
	}
	
	/**
	 * Goes through all detected model differences and adds activities to the 
	 * work plan, using {@link #checkForDifferencesAndAddToWorkplan(Diff, List)}.
	 */
	protected List<Activity> deriveAddAndRemoveActivities(List<Diff> diff) {
		List<Activity> workplan = new ArrayList<Activity>();	
		for (Diff diffElement : diff) {
			this.checkForDifferencesAndAddToWorkplan(diffElement, workplan);			
		}
		return workplan;
	}

	/**
	 * Finds out if the element affected by the diff has the given class or a sub-class.
	 */
	public static boolean isChangedElementInstanceOfClass(Diff diffElements, Class<?> targetElementType) {
		if (targetElementType.isInstance(((ReferenceChange)diffElements).getValue()))  {
			return true;	
		} else {
			return false;
		}
	}
	
	/**
	 * Finds out if an element of a certain class (or sub-class) was added.
	 */
	public static boolean detectionRuleAdded(Diff diffElements, Class<?> modelElementClass) {
		if (diffElements instanceof ReferenceChange && diffElements.getKind() == DifferenceKind.ADD 
				&& isChangedElementInstanceOfClass(diffElements, modelElementClass)) {
			return true;
		} else {
			return false;
		}	
	}
	
	/**
	 * Finds out if an element of a certain class (or sub-class) was deleted.
	 */
	public static boolean detectionRuleDeleted(Diff diffElements, Class<?> modelElementClass) {
		if (diffElements instanceof ReferenceChange && diffElements.getKind() == DifferenceKind.DELETE 
				&& isChangedElementInstanceOfClass(diffElements, modelElementClass)) {
			return true;
		} else {
			return false;
		}
	}

}
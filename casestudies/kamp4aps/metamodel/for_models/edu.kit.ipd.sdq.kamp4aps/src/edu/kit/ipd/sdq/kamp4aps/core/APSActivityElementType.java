package edu.kit.ipd.sdq.kamp4aps.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.CalibrationConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ComponentStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.Drawing;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.HMIConfiguration;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.InterfaceStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.ModuleStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureStockList;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TestCase;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * This class represents the elements an activity can affect.
 * We distinct between aPS related elements and annotation related
 * activities. APS related activities are caused by architectural
 * changes in the system under analysis also known as structural
 * changes. While annotation related activities are caused by changes 
 * in the non-structural part of the system.
 * 
 * @author Sandro Koch
 * @see AbstractActivityElementType
 */
public enum APSActivityElementType implements AbstractActivityElementType {
	//aPS related
	COMPONENT(Component.class),
	MODULE(Module.class),
	STRUCTURE(Structure.class),
	INTERFACE(Interface.class),
	
	// annotation-related
	TESTCASE(TestCase.class),
	MAINTENEANCE_DOCUMENTATION(MainteneanceDocumentation.class),
	OPERATOR_INSTRUCTIONS(OperatorInstructions.class),
	TRAINING_DOCUMENTATION_INTERNAL(TrainingDocIntern.class),
	TRAINING_DOCUMENTATION_EXTERNAL(TrainingDocExternal.class),
	DRAWING(Drawing.class),
	HMI_CONFIG(HMIConfiguration.class),
	CALIBRATION_CONFIG(CalibrationConfiguration.class),
	
	COMPONENT_STOCKLIST(ComponentStockList.class),
	MODULE_STOCKLIST(ModuleStockList.class),
	INTERFACE_STOCKLIST(InterfaceStockList.class),
	STRUCTURE_STOCKLIST(StructureStockList.class),

	PROGRAM_TYPE(Program.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private APSActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public static APSActivityElementType[] topLevelAPSActivityElementTypes() {	
		return new APSActivityElementType[]{COMPONENT, MODULE, INTERFACE, STRUCTURE};
	}

}

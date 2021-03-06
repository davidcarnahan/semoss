package prerna.ui.swing.custom;

import aurelienribon.ui.components.AruiFunctions;
import aurelienribon.ui.components.AruiRules;
import aurelienribon.ui.components.Button;
import aurelienribon.ui.components.TabPanel;
import aurelienribon.ui.css.Style;

public class CustomAruiStyle {
	public static void init() {
		Style.registerRule(AruiRules.FOREGROUND_MOUSEOVER);
		Style.registerRule(AruiRules.FOREGROUND_MOUSEDOWN);
		Style.registerRule(AruiRules.FOREGROUND_SELECTED);
		Style.registerRule(AruiRules.FOREGROUND_UNSELECTED);
		Style.registerRule(AruiRules.STROKE);
		Style.registerRule(AruiRules.STROKE_MOUSEOVER);
		Style.registerRule(AruiRules.STROKE_MOUSEDOWN);
		Style.registerRule(AruiRules.STROKE_SELECTED);
		Style.registerRule(AruiRules.STROKE_UNSELECTED);
		Style.registerRule(AruiRules.FILL);
		Style.registerRule(AruiRules.FILL_MOUSEOVER);
		Style.registerRule(AruiRules.FILL_MOUSEDOWN);
		Style.registerRule(AruiRules.FILL_SELECTED);
		Style.registerRule(AruiRules.FILL_UNSELECTED);
		Style.registerRule(AruiRules.CORNERRADIUS);

		Style.registerFunction(AruiFunctions.GROUPBORDER);

		Style.registerProcessor(Button.PROCESSOR);
		Style.registerProcessor(TabPanel.PROCESSOR);
		Style.registerProcessor(ToggleButton.PROCESSOR);
		Style.registerProcessor(CustomButton.PROCESSOR);
	}
}

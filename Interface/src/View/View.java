package View;

import Model.Model;

public class View {
	private Model model;

	public View(final Model model) {
		this.setModel(model);

	}

	@SuppressWarnings("static-access")
	public void Display() throws Exception {

		final Window window = new Window();

		window.FrameCreation();
		window.PlusButton();
		window.MinusButton();
		window.AttentionCondensation();
		window.TempExt();
		window.TempModulePeltier();
		window.TempIntern();
		window.TempChoseByUser();
		window.textFieldTempModulePeltier();
		window.FieldTempDesire();
		window.FieldTempFridge();
		window.FieldTempExtern();
		window.frame.setVisible(true);
	}

	public void setModel(final Model model) {
		this.model = model;
	}

}

package View;

import Model.Model;

public class View {
    private Model model;

    public View(Model model) {
        this.setModel(model);

    }


	protected Model model;

	public View(final Model model) {
		this.setModel(this.model);
	}

	public void Display() throws Exception {
		try {
			final Window window = new Window();
			window.initialize();
			window.frame.setVisible(true);
		} catch (final Exception e) {
			e.printStackTrace();

		}

	}

	public int InputIemperature() {
		return 0;
	}

	public void Button() {

	}

	public void Label() {

	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(final Model model) {
		this.model = model;
	}

}

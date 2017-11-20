package View;

public class View {

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

}

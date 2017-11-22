package Main;

import Model.Model;
import View.View;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(final String[] args) throws Exception {

		final Model model = new Model();

		final View view = new View(model);
		view.Start();

	}

}

package View;

import Model.Model;

public class View {
    private Model model;

    public View(Model model) {
        this.setModel(model);

    }

    public void Display() throws Exception {
        try {
            final Window window = new Window();

            window.FrameCreation();
            window.frame.setVisible(true);
            window.PlusButton();
            window.LessButton();

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

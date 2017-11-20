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

    protected Model getModel() {
        return this.model;
    }

    protected void setModel(Model model) {
        this.model = model;
    }

}

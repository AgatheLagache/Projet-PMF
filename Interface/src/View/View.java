package View;

import Model.Model;

public class View {
    private Model model;

    public View(Model model) {
        this.setModel(model);

    }

    public void Display() throws Exception {

        final Window window = new Window();

        window.FrameCreation();
        window.frame.setVisible(true);
        window.PlusButton();
        window.LessButton();
    }

    public void setModel(final Model model) {
        this.model = model;
    }

}

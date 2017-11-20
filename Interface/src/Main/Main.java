package Main;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {

    public static void main(final String[] args) throws Exception {

        final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller();

        view.Display();

    }

}
package Main;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {

    public static void main(final String[] args) throws Exception {

        final View view = new View();
        final Controller controller = new Controller();
        final Model model = new Model();

        view.Display();

    }

}
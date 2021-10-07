package g44422;

import g44422.controller.Controller;
import g44422.model.Yahtzee;
import g44422.model.YahtzeeException;
import g44422.view.YahtzeeView;

public class Main {
    public static void main(String args[]) throws YahtzeeException {
        YahtzeeView vue = new YahtzeeView();
        Yahtzee game = new Yahtzee();
        Controller controller = new Controller(vue, game);
        controller.play();
    }
}

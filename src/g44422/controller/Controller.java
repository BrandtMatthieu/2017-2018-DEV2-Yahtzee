package g44422.controller;

import g44422.model.Yahtzee;
import g44422.model.YahtzeeException;
import g44422.view.YahtzeeView;

public class Controller {

    YahtzeeView yahtzeeView;
    Yahtzee game;

    public Controller(YahtzeeView view, Yahtzee game) {
        this.yahtzeeView = view;
        this.game = game;
    }

    public void play() throws YahtzeeException {
        while(game.isOver()) {
            yahtzeeView.displayTour(game.getNbMoves());
            yahtzeeView.displayScore(game.getScore());
            game.roll();
            yahtzeeView.displayActives(game.getActives());
            yahtzeeView.displayAsides(game.getAsides());
            while(yahtzeeView.askAside() && game.getActives().size() > 0) {
                game.putAside(yahtzeeView.askAsideIndex(game.getActives().size()));
                yahtzeeView.displayActives(game.getActives());
                yahtzeeView.displayAsides(game.getAsides());
            }
            game.nextMove();
        }
        game.putAllAside();
        yahtzeeView.displayEnd(game.getScore(), game.getActives(), game.getAsides());
    }
}

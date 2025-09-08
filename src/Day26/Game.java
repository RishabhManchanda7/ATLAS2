package Day26;

public class Game {
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy){
        this.gameStrategy = gameStrategy;
    }

    public void start(){
        if(gameStrategy==null){
            System.out.println("Select a game level");
        } else{
            gameStrategy.play();
        }
    }
}
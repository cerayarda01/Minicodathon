package GameplayObjects;

public class GameManager {

    static public boolean gameLoopEnabled;
    static public boolean gameEventLock;
    static public GameRenderer mainRenderer;


    static public Player playerMain;


    private String gameSeed;

    static public int timeUnits;


    static public void main(String[] args) throws Exception {
        new GameManager();
    }


    public GameManager() throws  Exception{
        timeUnits=0;
        gameLoopEnabled=true;
        gameEventLock=false;




        mainRenderer=new GameRenderer();



        //initialize Controls.


        //initialize Player.

        playerMain=new Player();

        playerMain.setInt(12);
        playerMain.setLuc(8);
        playerMain.setStr(8);
        playerMain.setWis(8);

        //initialize Seed.







        while(gameLoopEnabled){

            gameEventLock=false;

            Thread.sleep(80);



            mainRenderer.Tick();
            gameEventLock=true;
            timeUnits++;
        }










    }


    public String getGameSeed() {
        return gameSeed;
    }

    public void setGameSeed(String gameSeed) {
        this.gameSeed = gameSeed;
    }
}

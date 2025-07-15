package GameplayObjects;

public class GameManager {

    static public boolean gameLoopEnabled;
    static public boolean gameEventLock;
    static public GameRenderer mainRenderer;



    private String gameSeed;

    static public int timeUnits;


    public GameManager() throws  Exception{
        timeUnits=0;
        gameLoopEnabled=true;
        gameEventLock=false;


        mainRenderer=new GameRenderer();



        //initialize Controls.


        //initialize Player.


        //initialize Seed.






        while(gameLoopEnabled){

            gameEventLock=false;

            Thread.sleep(80);



            mainRenderer.Tick();
            gameEventLock=true;
            timeUnits++;
        }










    }


}

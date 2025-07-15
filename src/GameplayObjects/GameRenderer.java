package GameplayObjects;



import enigma.core.Enigma;


public class GameRenderer {


    public enigma.console.Console Con;






    public GameRenderer(){
        Con= Enigma.getConsole("Labyrinth",640,360,10);
    }

    public void clear(){



        for(int i=0;i<640;i++){
            for(int j=0;j<360;j++){
                Con.getTextWindow().output(i,j,' ');
            }
        }




    }


    public void Tick(){

    }
}

package GameplayObjects;



import enigma.core.Enigma;


public class GameRenderer {


    public enigma.console.Console Con;




    public GameRenderer(){
        Con= Enigma.getConsole("Labyrinth",640,360,2);
    }

    public void clear(){

        Con.getTextWindow().setCursorPosition(0,0);

        for(int i=0;i<640;i++){
            for(int j=0;j<360;j++){
                Con.getTextWindow().output(i,j,' ');
            }
        }

        Con.getTextWindow().setCursorPosition(0,0);


    }



    public void Tick(){

    }
}

package DataStructures;

public class DSTest {

    static public void main(String args[]){
        SingleLinkedList A=new SingleLinkedList();



        A.addNode(5);


        A.removeNode(2);



        SingleLinkedList.Node T=A.getHead();

        while(T!=null){
            System.out.println(T.getData());
            T=T.getLink();
        }

    }
}

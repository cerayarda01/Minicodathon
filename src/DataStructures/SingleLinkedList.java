package DataStructures;

public class SingleLinkedList {

    private Node head;


    public SingleLinkedList(){
        head=null;
    }






    public void addNode(Object Data) {  //add new node to the tail.

        Node NN = new Node(Data);
        if (head == null) {
            head = NN;
        } else {
            Node Tmp = head;
            while (Tmp.getLink() != null) {
                Tmp = Tmp.getLink();
            }
            Tmp.setLink(NN);
        }

    }



    public int size(){
        int i=0;

        Node Tmp=head;
        while(Tmp!=null){
            i++;
            Tmp=Tmp.getLink();
        }
        return i;
    }

    public void removeNode(int index){

        if(index>=size()){
            removeNode();
        }
        else if(index<=0){
            if(head.getLink()!=null){
                head=head.getLink();
            }
            else{
                head=null;
            }

        }
        else if(head!=null){
            Node Tmp=head;
            int i=0;
            while(i!=index-1){
                Tmp=Tmp.getLink();
                i++;
            }
            Tmp.setLink(Tmp.getLink().getLink());
        }
    }

    public void removeNode(){  //removes node from the tail.

        if(head==null){

        }
        else if(head.getLink()==null){
            head=null;
        }
        else{
            Node Tmp=head;
            while(Tmp.getLink().getLink()!=null){
                Tmp=Tmp.getLink();
            }
            Tmp.setLink(null);
        }

    }



    static public class Node{

        private Object Data;

        private Node Link;


       public Node(Object Data){
            this.Data=Data;
            Link=null;
        }


        public Object getData() {
            return Data;
        }

        public void setData(Object data) {
            Data = data;
        }

        public Node getLink() {
            return Link;
        }

        public void setLink(Node link) {
            Link = link;
        }




    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}

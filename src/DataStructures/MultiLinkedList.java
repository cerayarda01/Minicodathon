package DataStructures;

public class MultiLinkedList {

    private ParentNode head;



    public ParentNode getHead() {
        return head;
    }

    public void setHead(ParentNode head) {
        this.head = head;
    }

    static public class ParentNode{
        private SingleLinkedList childList;
        private ParentNode nextParent;
        private Object metaData;

        public ParentNode(SingleLinkedList childList,Object metaData) {
            this.childList=childList;
            this.metaData=metaData;
            nextParent=null;
        }

        public ParentNode(SingleLinkedList childList) {
            this.childList=childList;
            nextParent=null;
            metaData=null;
        }


        public SingleLinkedList getChildList() {
            return childList;
        }

        public void setChildList(SingleLinkedList childList) {
            this.childList = childList;
        }

        public Object getMetaData() {
            return metaData;
        }

        public void setMetaData(Object metaData) {
            this.metaData = metaData;
        }

        public ParentNode getNextParent() {
            return nextParent;
        }

        public void setNextParent(ParentNode nextParent) {
            this.nextParent = nextParent;
        }
    }
}

package study.algorithm;


/**
 * @program: java study
 * @description: reverseLinkList
 * @author: Kelly.Xing
 * @create: 2019-09-11 18:42
 **/
public class LinkTableReverse {
    class Node {
        private Object data;
        private Node nextNode;

        public Node(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

}

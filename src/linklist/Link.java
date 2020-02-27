package linklist;

class Link {
    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public void removeNode(Node previous , String data){
            if (data.equals(this.data)) {
                previous.next = this.next ;
            } else {
                this.next.removeNode(this,data);
            }
        }

        public boolean containsNode(String data) {
            if (data.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(data);
                } else {
                    return false ;
                }
            }
        }
        public String getNode(int index) {
            if(Link.this.foot ++ == index){
                return this.data ;
            }else {
                return this.next.getNode(index);
            }
        }
        public void setNode(int index,String data){
            if(Link.this.foot++ == index){
                this.data = data ;
            }else {
                this.next.setNode(index,data);
            }
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if(this.next != null) {
                this.next.toArrayNode();
            }
        }
    }

    public boolean contains(String data) {
        if (data == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    private Node root;
    private int count = 0;
    private int foot = 0;

    public void add(String data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    public String get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index , String data) {
        if(index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index,data);
    }

    public void remove(String data) {
        if(this.contains(data)){
            if(data.equals(this.root.data)) {
                this.root = this.root.next ;
            }else {
                this.root.next.removeNode(this.root,data);
            }
            this.count -- ;
        }
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty(){
        return this.count==0;
    }

    public void clear(){
        this.root=null;     //清空链表
        this.count=0;       //元素个数为0
    }

    private String [] retArray ;
    public String[] toArray() {
        if(this.root == null) {
            return null ;
        }
        this.foot = 0 ;
        this.retArray = new String[this.count] ;
        this.root.toArrayNode();
        return this.retArray ;
    }
}

package ru.mirea.prac30_drop;

public class Tree {
    Node root;
    int count;

    Tree(){
        root = null;
        count = 0;
    }

    public void insert(int data){
        if(root == null){
            root = new Node(data);
            return;
        }

        Node cur = root;
        while (true){
            if (data < cur.getData()){
                if (cur.getLeft() == null){
                    cur.setLeft(new Node(data));
                    count++;
                    return;
                }
                cur = cur.getLeft();
            } else if (data > cur.getData()){
                if (cur.getRight() == null){
                    cur.setRight(new Node(data));
                    count++;
                    return;
                }
                cur = cur.getRight();
            } else {
                return;
            }
        }
    }

    public void delete(int item){
        
    }

    public int binSearch(int item){
        Node cur = root;
        while (true){
            if (cur == null){
                return 0;
            } else if (item < cur.getData()){
                cur = cur.getLeft();
            } else if (item > cur.getData()){
                cur = cur.getRight();
            } else if (cur.getData() == item){
                return 1;
            }
        }
    }
}

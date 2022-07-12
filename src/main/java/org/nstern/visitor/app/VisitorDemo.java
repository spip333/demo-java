package org.nstern.visitor.app;

import org.nstern.visitor.data.Baustein;

public class VisitorDemo {

    public static void main(String[] args) {
        VisitorDemo demo = new VisitorDemo();
        Baustein root = demo.initTree();
        PrintVisitor visitor = new PrintVisitor();
        root.accept(visitor);
    }

    Baustein initTree() {
        Baustein root = new Baustein("root", 99);
        Baustein sub1 = new Baustein("sub1", 1);
        Baustein sub2 = new Baustein("sub2", 2);
        Baustein sub3 = new Baustein("sub3", 3);
        Baustein sub4 = new Baustein("sub4", 4);
        Baustein sub5 = new Baustein("sub5", 5);

        sub1.addChild(sub3);
        sub2.addChild(sub4);
        sub2.addChild(sub5);
        root.addChild(sub1);
        root.addChild(sub2);
        return root;
    }

}


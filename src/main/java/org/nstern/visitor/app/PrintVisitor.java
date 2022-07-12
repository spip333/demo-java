package org.nstern.visitor.app;

import org.nstern.visitor.data.Baustein;

public class PrintVisitor implements Visitor{

    public void visit(Baustein baustein) {
        System.out.println(baustein.id + " : " + baustein.value);
    }
}

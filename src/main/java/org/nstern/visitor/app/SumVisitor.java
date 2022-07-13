package org.nstern.visitor.app;

import org.nstern.visitor.data.Baustein;

public class SumVisitor implements Visitor {

    private int sum;

    public void visit(Baustein baustein) {
        System.out.println("visiting : " + baustein.id);
        sum = sum + baustein.value;
        System.out.println("- sum = " + sum);
    }

}

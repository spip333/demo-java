package org.nstern.visitor.app;

import org.nstern.visitor.data.Baustein;

public class AbgabeVisitor implements Visitor {

    private int sum;

    public void visit(Baustein baustein) {
        System.out.println("visiting " + baustein.id + " : value = " + baustein.value + ", abgabe = " + baustein.abgabe);
        sum = sum + baustein.value - baustein.abgabe;
        System.out.println("- sum = " + sum);
    }

}

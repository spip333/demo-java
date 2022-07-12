package org.nstern.visitor.app;

import org.nstern.visitor.data.Baustein;

public interface Visitor {
    public void visit(Baustein baustein);
}

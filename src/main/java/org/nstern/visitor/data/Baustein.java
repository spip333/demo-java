package org.nstern.visitor.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.nstern.visitor.app.Visitor;

public class Baustein {
    public String id;
    public int value;
    public int abgabe;

    public List<Baustein> children;

    public Baustein() {
        children = new ArrayList<>();
    }

    public Baustein(String id, int value) {
        this.id = id;
        this.value = value;
        children = new ArrayList<>();
    }

    public Baustein(String id, int value, int abgabe) {
        this.id = id;
        this.value = value;
        this.abgabe = abgabe;
        children = new ArrayList<>();
    }

    public void addChild(Baustein baustein) {
        children.add(baustein);
    }

    public List<Baustein> getChildren() {
        return children;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        children.forEach(child -> child.accept(visitor));
    }

    @Override
    public String toString() {
        return "" + id + ":" + value + children.stream().map(Baustein::toString).collect(Collectors.toList());
    }
}

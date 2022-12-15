package org.nstern.demos.hierarchy;

public class DeckungsBaumDto extends DeckungsBaumDtoNew{

    private Boolean angewaehlt;
    private Boolean anAbwaehlbar;

/*
    public Boolean isAngewaehlt() {return angewaehlt;    }
    public Boolean isAnAbwaehlbar() {
        return anAbwaehlbar;
    }
*/
    public void setAngewaehlt(boolean angewaehlt) {
        this.angewaehlt = angewaehlt;
    }
    public void setAnAbwaehlbar(boolean anAbwaehlbar) {
        this.anAbwaehlbar = anAbwaehlbar;
    }
}

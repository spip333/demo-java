package org.nstern.demos.hierarchy;

import java.util.UUID;

public class DeckungsBaumDtoNew {

    private UUID bausteinId;

    private boolean angewaehlt;
    private boolean anAbwaehlbar;

    public boolean isAngewaehlt() {return angewaehlt;    }
    public boolean isAnAbwaehlbar() {
        return anAbwaehlbar;
    }
    public void setAngewaehlt(boolean angewaehlt) {
        this.angewaehlt = angewaehlt;
    }
    public void setAnAbwaehlbar(boolean anAbwaehlbar) {
        this.anAbwaehlbar = anAbwaehlbar;
    }

}

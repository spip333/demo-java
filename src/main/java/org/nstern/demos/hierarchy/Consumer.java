package org.nstern.demos.hierarchy;

public class Consumer {

    public static void main(String[] args) {

        DeckungsBaumDto deckungsBaumDto = new DeckungsBaumDto();
        deckungsBaumDto.setAnAbwaehlbar(true);
        deckungsBaumDto.setAngewaehlt(true);
        ErsatzgeschaeftDto ersatzgeschaeftDto = new ErsatzgeschaeftDto();
        ersatzgeschaeftDto.deckungsBaum = deckungsBaumDto;


        DeckungsBaumDtoNew deckungsBaumDtoNew = new DeckungsBaumDtoNew();
        deckungsBaumDtoNew.setAnAbwaehlbar(false);
        deckungsBaumDtoNew.setAnAbwaehlbar(false);
        ErsatzgeschaeftDtoNew ersatzgeschaeftDtoNew = new ErsatzgeschaeftDtoNew();
        ersatzgeschaeftDtoNew.deckungsBaum = deckungsBaumDtoNew;

        System.out.println("ErsatzgeschaeftDto: ");
        System.out.println("deckungsBaumDto.isAnAbwaehlbar: " + ersatzgeschaeftDto.deckungsBaum.isAnAbwaehlbar() );
        System.out.println("deckungsBaumDto.isAngewaehlt: " + ersatzgeschaeftDto.deckungsBaum.isAngewaehlt());


        System.out.println("ErsatzgeschaeftDtoNew: ");
        System.out.println("deckungsBaumDto.isAnAbwaehlbar: " + ersatzgeschaeftDtoNew.deckungsBaum.isAnAbwaehlbar() );
        System.out.println("deckungsBaumDto.isAngewaehlt: " + ersatzgeschaeftDtoNew.deckungsBaum.isAngewaehlt());

    }
}

package org.nstern.demos;

import java.util.Iterator;
import java.util.Map;

public class MapDemo {


    public static void main(String[] args) {

        MapDemo demo = new MapDemo();

        var par = Map.of("123456789012", 1, "923456789012", 1);
        demo.doIt(par);


    }

    public void doIt(Map<String, Integer> vrsNummernZuZahlungsHaeufigkeit) {

        StringBuilder output = new StringBuilder("{\n");

        Iterator<Map.Entry<String, Integer>> iterator = vrsNummernZuZahlungsHaeufigkeit.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            String vrsNummer = entry.getKey();
            Integer zahlungsHaeufigkeit = entry.getValue();

            String part = "\"" + vrsNummer + "\": {\n "
                          + "    \"vrsvereinbarungsnummer\": \"" + vrsNummer + "\",\n"
                          + "    \"vertragsbeginn\": \"2021-05-01\",\n"
                          + "    \"vertragsablauf\": \"2026-04-30\",\n"
                          + "    \"vertragsdauer\": 5,\n"
                          + "    \"hauptpraemienverfall\": 5,\n"
                          + "    \"praemienart\": {\n"
                          + "      \"@class\": \"ch.mobi.fdt.types.codes.Fdt_praemienart\",\n"
                          + "      \"art\": 400060,\n"
                          + "      \"code\": 2\n"
                          + "    },\n"
                          + "    \"zahlungshaeufigkeit\": {\n"
                          + "      \"@class\": \"ch.mobi.fdt.types.codes.FdtZahlungsweise\",\n"
                          + "      \"art\": 400634,\n"
                          + "      \"code\": " + zahlungsHaeufigkeit + "\n"
                          + "    },\n"
                          + "    \"status\": {\n"
                          + "      \"@class\": \"ch.mobi.fdt.types.codes.FdtVersicherungsvereinbarungStatus\",\n"
                          + "      \"art\": 700780,\n"
                          + "      \"code\": 8\n"
                          + "    },\n"
                          + "    \"erfassungsDatum\": \"2022-05-12\",\n"
                          + "    \"generierteVertragpraezisierung\": {\n"
                          + "      \"@class\": \"ch.mobi.fdt.types.codes.FdtGenerierteVertragspraezisierung\",\n"
                          + "      \"art\": 400554,\n"
                          + "      \"code\": 108\n"
                          + "    },\n"
                          + "    \"versicherungsprodukt\": {\n"
                          + "      \"@class\": \"ch.mobi.fdt.types.codes.gruppen.FdtProduktart\",\n"
                          + "      \"art\": 20001,\n"
                          + "      \"code\": 20003\n"
                          + "    },\n"
                          + "    \"releasesBeibehalten\": false\n"
                          + "  }";
            output.append(part);
            if (iterator.hasNext()) {
                output.append(",");
            }
            output.append("\n");
        }

        output.append("}");

        System.out.println(output);
    }

}

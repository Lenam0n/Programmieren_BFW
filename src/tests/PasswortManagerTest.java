/**
 * 
 */
package tests;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.util.stream.Stream;
import org.junit.jupiter.api.function.Executable;

public class PasswortManagerTest {

    /**
     * Testet die includes()-Methode der Klasse Passwort über alle Testfälle,
     * die im Enum Testcase definiert sind.
     */
	/*
    @Test
    public void testIncludes() {
        // Erzeugt einen Stream von Executable-Objekten, die jeweils einen Testfall repräsentieren.
        Stream<Executable> testcases = Stream.of(Testcase.values())
            .map(testcase -> () -> {
                // Erzeuge zu jedem Testfall ein Passwort-Objekt mit dem entsprechenden Wert.
                Passwort passwort = new Passwort(testcase.getValue());
                // Wir erwarten, dass passwort.includes( <Kriterium> ) true zurückliefert.
                // (Hier gehen wir davon aus, dass der Testfall auch zugleich das zu prüfende Kriterium darstellt.)
                assertTrue(passwort.includes(testcase.getValue()),
                    "Fehler: Passwort '" + testcase.getValue() 
                    + "' sollte das Kriterium '" + testcase.getValue() + "' enthalten.");
            });
        // assertAll führt alle Test-Ausdrücke aus und sammelt etwaige Fehler.
        assertAll("Alle includes-Testfälle", testcases);
    }*/
    
    /**
     * Testet die Methode methodeIstSicheresPasswort() des PasswortManagers.
     * Hier soll einerseits sichergestellt werden, dass ein als unsicher eingestuftes Passwort
     * (z. B. zu kurz oder fehlende Zeichenarten) abgelehnt wird, und andererseits ein
     * sicheres Passwort alle Kriterien erfüllt.
     *
     * Damit der Test differenziert prüfen kann, erweitern wir hier für Testzwecke den PasswortManager
     * um einen zusätzlichen Konstruktor, der ein Passwort-Objekt entgegennimmt.
     */
    @Test
    public void testMethodeIstSicheresPasswort() {
        // Beispiel für ein unsicheres Passwort: 
    	// "passwort" – zu kurz, keine Großbuchstaben, Zahlen oder Sonderzeichen.
        Passwort unsicher = new Passwort("passwort");
        PasswortManager unsichererManager = new PasswortManager(unsicher);
        
        // Beispiel für ein sicheres Passwort, das alle Anforderungen erfüllt:
        // Länge > 8, enthält mindestens einen Großbuchstaben, einen Kleinbuchstaben, eine Zahl und ein Sonderzeichen.
        Passwort sicher = new Passwort("Abcdef1@123");
        PasswortManager sichererManager = new PasswortManager(sicher);
        
        // Mit assertAll werden beide Fälle gruppiert.
        assertAll("Test sichere vs. unsichere Passwörter",
            () -> assertFalse(unsichererManager.methodeIstSicheresPasswort(),
                "Ein Passwort wie '"+ unsicher.getPasswort() +"' sollte als unsicher bewertet werden."),
            () -> assertTrue(sichererManager.methodeIstSicheresPasswort(),
                "Ein Passwort wie '" + sicher.getPasswort() + "' sollte als sicher bewertet werden.")
        );
    }
}

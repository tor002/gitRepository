/**DOKANF***********************************************************************************
 *
 *  Elementname:     MyJavaFxErstes.java
 *  Elementtitel:    Beispiel fuer Demonstration JavaFX-GUI
 *  Elementart:      JAVA-Klasse
 *  Autor:			 tor001
 *  Java-Runtime:    V8.0 + vorher Plugin in Eclipse installieren ueber Marketplace: e(fx)clipse2.1.0
 *  Anmerkung:       -super ist, dass JavaFX mit der JavaRuntime V8.x bereits installiert ist !!!
 *                   -JavaFX ist die Nachfolgetechnologie von Swing ... fuer moderne, schoene Desktop-GUI's 
 *                   -JavaFX kann auch im WebBrowser laufen & wohl auch unter Android (mobile Betriebssysteme)
 *                    
 *  kurze Versionshistory & Datum: 
 *  V1.0(29.10.15) ... Klasse implementiert
 *  V2.0(xx.yy.15) ... z.B. Methode xyz um ... erweitert  
 *********************************************************************************************/

package demo;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class MyJavaFxErstes extends Application {

	public static void main(String[] args) {
		System.out.println("Starte JavaFX-Anwendung");
		launch(args);
	}

	@Override
	public void start(Stage hauptFenster) {
		Pane pn = new Pane();
		
		hauptFenster.setTitle("BspFX: Objekte zeichnen");
		hauptFenster.setScene(new Scene(pn, 500, 300)); //verbinde Stage und Scene		
		hauptFenster.show(); //Windowsfenster soll angezeigt werden	
	}
}

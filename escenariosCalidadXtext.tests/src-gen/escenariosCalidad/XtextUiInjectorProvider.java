/*
* generated by Xtext
*/
package escenariosCalidad;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XtextUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return escenariosCalidad.ui.internal.XtextActivator.getInstance().getInjector("escenariosCalidad.Xtext");
	}
	
}
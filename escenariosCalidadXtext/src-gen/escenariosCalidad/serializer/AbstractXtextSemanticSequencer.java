package escenariosCalidad.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import escenariosCalidad.Arquitectura;
import escenariosCalidad.Artefacto;
import escenariosCalidad.Escenario;
import escenariosCalidad.EscenariosCalidadPackage;
import escenariosCalidad.Estimulo;
import escenariosCalidad.Fuente;
import escenariosCalidad.MedidaRespuesta;
import escenariosCalidad.Test;
import escenariosCalidad.services.XtextGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractXtextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XtextGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EscenariosCalidadPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EscenariosCalidadPackage.ARQUITECTURA:
				if(context == grammarAccess.getArquitecturaRule()) {
					sequence_Arquitectura(context, (Arquitectura) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.ARTEFACTO:
				if(context == grammarAccess.getArtefactoRule()) {
					sequence_Artefacto(context, (Artefacto) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.ESCENARIO:
				if(context == grammarAccess.getEscenarioRule()) {
					sequence_Escenario(context, (Escenario) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.ESTIMULO:
				if(context == grammarAccess.getEstimuloRule()) {
					sequence_Estimulo(context, (Estimulo) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.FUENTE:
				if(context == grammarAccess.getFuenteRule()) {
					sequence_Fuente(context, (Fuente) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.MEDIDA_RESPUESTA:
				if(context == grammarAccess.getMedidaRespuestaRule()) {
					sequence_MedidaRespuesta(context, (MedidaRespuesta) semanticObject); 
					return; 
				}
				else break;
			case EscenariosCalidadPackage.TEST:
				if(context == grammarAccess.getTestRule()) {
					sequence_Test(context, (Test) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((escenarios+=Escenario escenarios+=Escenario*)? (artefactos+=Artefacto artefactos+=Artefacto*)?)
	 */
	protected void sequence_Arquitectura(EObject context, Arquitectura semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=EString?)
	 */
	protected void sequence_Artefacto(EObject context, Artefacto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=EString? fuente=Fuente estimulo=Estimulo medida=MedidaRespuesta)
	 */
	protected void sequence_Escenario(EObject context, Escenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     artefacto=[Artefacto|EString]
	 */
	protected void sequence_Estimulo(EObject context, Estimulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EscenariosCalidadPackage.Literals.ESTIMULO__ARTEFACTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EscenariosCalidadPackage.Literals.ESTIMULO__ARTEFACTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEstimuloAccess().getArtefactoArtefactoEStringParserRuleCall_3_0_1(), semanticObject.getArtefacto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Fuente(EObject context, Fuente semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EscenariosCalidadPackage.Literals.FUENTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EscenariosCalidadPackage.Literals.FUENTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuenteAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metrica=Metrica? valorEsperado=EDouble? unidad=Unidad? operador=Operador?)
	 */
	protected void sequence_MedidaRespuesta(EObject context, MedidaRespuesta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arquitecturas+=Arquitectura arquitecturas+=Arquitectura*)?)
	 */
	protected void sequence_Test(EObject context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

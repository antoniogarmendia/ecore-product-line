/*
 * generated by Xtext 2.15.0
 */
package pnpl_variability.validation

import javax.xml.parsers.DocumentBuilderFactory
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import variability.Feature
import variability.Variability
import variability.VariabilityPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PNPL_variabilityValidator extends AbstractPNPL_variabilityValidator {
	
	@Check
	def checkValidFeature(Feature feature) {
		var valid = false
		var i = 0
		
		try {
			// get features form feature model
			var variability  = EcoreUtil2.getRootContainer(feature, true) as Variability 
			var vrbfile      = feature.eResource.URI		
			var featuremodel = vrbfile.toString().substring(0, vrbfile.toString().lastIndexOf("/")+1) + variability.featuremodel.importURI
			var dbFactory    = DocumentBuilderFactory.newInstance();
			var dBuilder     = dbFactory.newDocumentBuilder();
			var doc          = dBuilder.parse(featuremodel);
			doc.getDocumentElement().normalize();
		
			// check whether the specified feature exists in the feature model
			var features = doc.getElementsByTagName("feature");
			for (i=0; i<features.getLength() && valid==false; i++) {
				if (feature.feature.equals(features.item(i).attributes.getNamedItem("name").nodeValue)) {
					valid = true					
				}				
			}
		}
		catch (Exception e) {}
		
		// return error if feature does not exist
		if (valid==false)
			error(	'Feature \'' + feature.feature + '\' does not exist', 
					VariabilityPackage.Literals.FEATURE__FEATURE, 
					'invalidFeature' )
	}
	
}
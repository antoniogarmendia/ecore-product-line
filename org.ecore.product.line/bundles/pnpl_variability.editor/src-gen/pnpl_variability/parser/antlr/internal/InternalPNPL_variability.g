/*
 * generated by Xtext 2.15.0
 */
grammar InternalPNPL_variability;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package pnpl_variability.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package pnpl_variability.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pnpl_variability.services.PNPL_variabilityGrammarAccess;

}

@parser::members {

 	private PNPL_variabilityGrammarAccess grammarAccess;

    public InternalPNPL_variabilityParser(TokenStream input, PNPL_variabilityGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Variability";
   	}

   	@Override
   	protected PNPL_variabilityGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleVariability
entryRuleVariability returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariabilityRule()); }
	iv_ruleVariability=ruleVariability
	{ $current=$iv_ruleVariability.current; }
	EOF;

// Rule Variability
ruleVariability returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='pn'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariabilityAccess().getPnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariabilityAccess().getPetrinetFileURIParserRuleCall_1_0());
				}
				lv_petrinet_1_0=ruleFileURI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariabilityRule());
					}
					set(
						$current,
						"petrinet",
						lv_petrinet_1_0,
						"pnpl_variability.PNPL_variability.FileURI");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='fm'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariabilityAccess().getFmKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariabilityAccess().getFeaturemodelFileURIParserRuleCall_3_0());
				}
				lv_featuremodel_3_0=ruleFileURI
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariabilityRule());
					}
					set(
						$current,
						"featuremodel",
						lv_featuremodel_3_0,
						"pnpl_variability.PNPL_variability.FileURI");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getVariabilityAccess().getPresenceconditionPresenceConditionParserRuleCall_4_0_0());
					}
					lv_presencecondition_4_0=rulePresenceCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariabilityRule());
						}
						add(
							$current,
							"presencecondition",
							lv_presencecondition_4_0,
							"pnpl_variability.PNPL_variability.PresenceCondition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=';'
			{
				newLeafNode(otherlv_5, grammarAccess.getVariabilityAccess().getSemicolonKeyword_4_1());
			}
		)*
	)
;

// Entry rule entryRuleFileURI
entryRuleFileURI returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileURIRule()); }
	iv_ruleFileURI=ruleFileURI
	{ $current=$iv_ruleFileURI.current; }
	EOF;

// Rule FileURI
ruleFileURI returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFileURIAccess().getFileURIAction_0(),
					$current);
			}
		)
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getFileURIAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFileURIRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getFeatureParserRuleCall_0());
		}
		this_Feature_0=ruleFeature
		{
			$current = $this_Feature_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExpressionParserRuleCall_1());
		}
		this_UnaryExpression_1=ruleUnaryExpression
		{
			$current = $this_UnaryExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2());
		}
		this_BinaryExpression_2=ruleBinaryExpression
		{
			$current = $this_BinaryExpression_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePresenceCondition
entryRulePresenceCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPresenceConditionRule()); }
	iv_rulePresenceCondition=rulePresenceCondition
	{ $current=$iv_rulePresenceCondition.current; }
	EOF;

// Rule PresenceCondition
rulePresenceCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PC'
		{
			newLeafNode(otherlv_0, grammarAccess.getPresenceConditionAccess().getPCKeyword_0());
		}
		otherlv_1='for'
		{
			newLeafNode(otherlv_1, grammarAccess.getPresenceConditionAccess().getForKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPresenceConditionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPresenceConditionAccess().getElementsEObjectCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPresenceConditionAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPresenceConditionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPresenceConditionAccess().getElementsEObjectCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='='
		{
			newLeafNode(otherlv_5, grammarAccess.getPresenceConditionAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPresenceConditionAccess().getExpressionExpressionParserRuleCall_5_0());
				}
				lv_expression_6_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPresenceConditionRule());
					}
					set(
						$current,
						"expression",
						lv_expression_6_0,
						"pnpl_variability.PNPL_variability.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFeatureAccess().getFeatureEStringParserRuleCall_0());
			}
			lv_feature_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFeatureRule());
				}
				set(
					$current,
					"feature",
					lv_feature_0_0,
					"pnpl_variability.PNPL_variability.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnaryExpressionRule()); }
	iv_ruleUnaryExpression=ruleUnaryExpression
	{ $current=$iv_ruleUnaryExpression.current; }
	EOF;

// Rule UnaryExpression
ruleUnaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_0_0());
				}
				lv_operator_0_0=ruleUnaryOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_0_0,
						"pnpl_variability.PNPL_variability.UnaryOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightExpressionParserRuleCall_1_0());
				}
				lv_right_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
					}
					set(
						$current,
						"right",
						lv_right_1_0,
						"pnpl_variability.PNPL_variability.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBinaryExpression
entryRuleBinaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryExpressionRule()); }
	iv_ruleBinaryExpression=ruleBinaryExpression
	{ $current=$iv_ruleBinaryExpression.current; }
	EOF;

// Rule BinaryExpression
ruleBinaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getBinaryExpressionAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftExpressionParserRuleCall_1_0());
				}
				lv_left_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
					}
					set(
						$current,
						"left",
						lv_left_1_0,
						"pnpl_variability.PNPL_variability.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorEnumRuleCall_2_0());
				}
				lv_operator_2_0=ruleBinaryOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
					}
					set(
						$current,
						"operator",
						lv_operator_2_0,
						"pnpl_variability.PNPL_variability.BinaryOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightExpressionParserRuleCall_3_0());
				}
				lv_right_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
					}
					set(
						$current,
						"right",
						lv_right_3_0,
						"pnpl_variability.PNPL_variability.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getBinaryExpressionAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Rule UnaryOperator
ruleUnaryOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='not'
		{
			$current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration());
		}
	)
;

// Rule BinaryOperator
ruleBinaryOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='and'
			{
				$current = grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getANDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='or'
			{
				$current = grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getOREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='implies'
			{
				$current = grammarAccess.getBinaryOperatorAccess().getIMPLIESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getIMPLIESEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

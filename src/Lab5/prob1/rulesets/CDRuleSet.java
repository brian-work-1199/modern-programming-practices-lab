package Lab5.prob1.rulesets;



import Lab5.prob1.gui.CDWindow;

import java.awt.Component;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWindow;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		priceRule();
	}

	public void nonemptyRule() throws RuleException{
		if(cdWindow.getArtistValue().trim().isEmpty() ||
				cdWindow.getTitleValue().trim().isEmpty() ||
				cdWindow.getPriceValue().trim().isEmpty())
			throw new RuleException("All fields must be non-empty!");
	}

	public void priceRule() throws RuleException{
		String priceStr = cdWindow.getPriceValue().trim();
		double price;
		try {
			price = Double.parseDouble(priceStr);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Price must be numeric");
		}
		if(price <= 0.49) throw new RuleException("Price must be greater than 0.49");
		if(priceStr.matches("^\\d+\\.\\d{2}$")){
			throw new RuleException("Price must be a floating point number with two decimal places");
		}
	}


	
}

package Lab5.prob1.rulesets;

import Lab5.prob1.gui.BookWindow;
import Lab5.prob1.gui.CDWindow;

import java.awt.Component;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow bookWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		bookWindow = (BookWindow) ob;
		nonemptyRule();
		isbnRule();
		priceRule();
	}

	public void nonemptyRule() throws RuleException{
		if(bookWindow.getIsbnValue().trim().isEmpty() ||
			bookWindow.getTitleValue().trim().isEmpty() ||
			bookWindow.getPriceValue().trim().isEmpty())
			throw new RuleException("All fields must be non-empty!");
	}

	public void isbnRule() throws RuleException{
		String val = bookWindow.getIsbnValue().trim();
		try {
			Integer.parseInt(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Isbn must be numeric");
		}
		if(!(val.length() == 10 || val.length() == 13)){
			throw new RuleException("Isbn must have 10 or 13 characters");
		}
		if(val.length() == 10 && !(val.startsWith("0") || val.startsWith("1"))){
			throw new RuleException("For ISBN of length 10, the first digit of Isbn must be 0 or 1");
		}
		if(val.length() == 13 && !(val.startsWith("987") || val.startsWith("979"))){
			throw new RuleException("For ISBN of length 13, the first 3 digits of Isbn must be 987 or 979");
		}
	}

	public void priceRule() throws RuleException{
		String priceStr = bookWindow.getPriceValue().trim();
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

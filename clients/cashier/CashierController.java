package clients.cashier;


/**
 * The Cashier Controller
 * @author M A Smith (c) June 2014
 */

public class CashierController
{
  private CashierModel model = null;
  private CashierView  view  = null;

  /**
   * Constructor
   * @param model The model 
   * @param view  The view from which the interaction came
   */
  public CashierController( CashierModel model, CashierView view )
  {
    this.view  = view;
    this.model = model;
  }

  /**
   * Check interaction from view
   * @param pn The product number to be checked
   */
  public void doCheck( String pn )
  {
    model.doCheck(pn);
  }

   /**
   * Buy interaction from view
   */
  public void doBuy()
  {
    model.doBuy();
  }

  /**
   * Clear interaction from view
   */
  public void doClear() {model.doClear();}

  /**
   * Clear remove ID from view
   */
  public void doRemoveID(String productNum)
  {
    model.doRemoveID(productNum);
  }
   /**
   * Bought interaction from view
   */
  public void doBought()
  {
    model.doBought();
  }
}

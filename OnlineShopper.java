/**
 A class to test your shopping cart implementation.
 @author Jack Richards
 Note: you do not need to submit this file, and may use it for testing your code.
 */

public class OnlineShopper
{
  public static void main (String[] args)
  {
    Item[] items = {
      new Item("Bird feeder", 20.50),
      new Item("Squirrel guard", 15.47),
      new Item("Bird bath", 44.99),
      new Item("Bird bath", 44.99),
      new Item("Sunflower seeds", 12.95)
    };

    // Sample usages of the methods you will be implementing in the ShoppingCart class.
    // Feel free to un-comment the lines below to test as you complete your implementations.

     ShoppingCart myCart = new ShoppingCart(items);
     Item birdBook = new Item("Bird book", 19.99);
      myCart.addToCart(birdBook, 4);
//      myCart.removeFromCart(birdBook, 2);
      myCart.viewCart();

  } // end main

} // end OnlineShopper

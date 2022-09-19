/**
 A class that describes the operations of a shopping cart.
 @author Jack Richards
 */

public class ShoppingCart {

  BagInterface<Item> shoppingCart;

  /** Creates an empty shopping cart. */
  public ShoppingCart() {
    shoppingCart = new ArrayBag<>();
  }

  /** Creates a new shopping cart and adds all the items
   in the input array to the cart.
   @param items the Items to be added to the cart */
  public ShoppingCart(Item[] items) {

    shoppingCart = new ArrayBag<>();

    for (int index = 0; index < items.length; index++)
    {
      Item nextItem = items[index];
      shoppingCart.add(nextItem);
    } // end for
  }

  /** Adds the requested quantity of the specified item to the cart.
   @param item the Item to be added to the cart
   @param quantity how many of the specified item we want to add
   @return true if the addition is successful, or false if not */
  public boolean addToCart(Item item, int quantity) {
    if(shoppingCart.isFit(quantity)){
      for (int index = 0; index < quantity; index++) {
        shoppingCart.add(item);
      }
    }
    else {
      return false;
    }
    return true;
  }

  /** Removes the requested quantity of the specified item to the cart.
   @param item the Item to be removed from the cart
   @param quantity how many of the specified item we want to remove
   @return true if the removal is successful, or false if not */
  public boolean removeFromCart(Item item, int quantity) {

    return true;
  }

  /** Prints out the items currently in the cart in an organized manner.
   Sample output:
   3x Bird feeder @ $20.50
   1x Bird bath @ $44.99
   1x Sunflower seeds @ $12.95
   Total cost: $119.44

   Items may be listed in any order.
   Duplicate items are indicated with the quantity (e.g. "3x Bird feeder")
   rather than listing that item multiple times. */
  public void viewCart() {


    double totalCost = 0;
    for (int index = 0; index < shoppingCart.getCurrentSize(); index++) {
//      boolean shouldPrint = true;
      Item nextItem = shoppingCart.findItem(index);
      if (shoppingCart.getFrequencyOf(nextItem) > 1) {
        System.out.println(shoppingCart.getFrequencyOf(nextItem) + "x " + nextItem.getName() + " $" + nextItem.getPrice());
        totalCost = totalCost + nextItem.getPrice();
      } else {
        System.out.println("1x " + nextItem.getName() + " $" + nextItem.getPrice());
        totalCost = totalCost + nextItem.getPrice();
      }
    }
    System.out.println("Total cost: " + "\t$" + totalCost);
  }

  /** Simulates the checkout process by removing items from the cart, one at a time.
   We print out the name of each item as it is removed
   and also calculate and print out the total cost of all the items.

   Note: This is the same code we wrote in class, reproduced here for your reference.
   No need to modify this in your Assignment 2 submission. */
  public void checkout() {
    double totalCost = 0;
    while (!shoppingCart.isEmpty())
    {
      Item removedItem = shoppingCart.remove();
      System.out.println("Purchasing " + removedItem.getName());
      totalCost = totalCost + removedItem.getPrice();
    }
    System.out.println ("Total cost: " + "\t$" + totalCost);
  }
}

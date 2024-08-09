package items;

import main.LateFeeCalculatable;

/**
 *      this LibraryItem contains only information about item
 *      1.Single Responsibility principle
 *
 *      in this code we can add more classes like newspaper but it is closed to modification.
 *      2.Open Close principle
 */

public interface LibraryItems extends LateFeeCalculatable {

       String getTitle();

       String getUniqueId();

//       int calculateLateFee(int days); // This is breaking the Single Responsibility principle hence we are removing it from here
       // once we remove this from here it will make interface thin so it is
       // Interface segregation : make interface as thin as possible

       double getValue();

}

import java.util.ArrayList;


public class Item {

  public String name;
  public String abbrv;

  public ArrayList<ItemInfo> equipment;


  public Item(String name, String, abbrv) {

  }

  /*
  * Passes to ItemInfo constructor
  */
  public boolean addItemInfo(String descriptor, String status, String barcode) {
    ItemInfo newItem = new ItemInfo(descriptor, status, equipment.size barcode);
    equipment.add(newItem); //TODO implement ArrayList add



  }

}





public class ItemInfo {

  private String status; //TODO Use static identifiers such as REPAIR, OOC, MISSING,
  private String descriptor;

  private int number;
  private final String barcode; //TODO check if barcodes are numbers only or string

  private boolean reserved;
  private boolean checkedOut;

  private ResInfo currentRes;
  private QueueADT<ResInfo> futureRes;
  private StackADT<ResInfo> pastRes;

  public ItemInfo(String descriptor, String status, int number,  String barcode) {
    reserved = false; //Initial values for checked out/reserved, may change later
    checkedOut = false;

    this.barcode = barcode;
    this.number = number;

    this.descriptor = descriptor;
    this.status = status;

  }

  /**
  * Updates the status
  */
  public void changeStatus(String status) {
    this.status = status;
  }

  /**
  * Adds a reservation for the item
  * @return false if the item is already reserved at the time
  */
  public boolean reserve(ResInfo res) {

  }



}




public class ResInfo {

  //***************************************************************************
  private final String accountID;

  private final Date startDate;
  private final Date endDate;

  private ItemInfo item;
  //***************************************************************************

  public ResInfo(String accountID, Date startDate, Date endDate, ItemInfo item) {
    this.accountID = accountID;
    this.startDate = startDate;
    this.endDate = endDate;
    this.item = item;
  }
}

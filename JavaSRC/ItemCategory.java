
import java.lang.Iterable;
import java.util.ArrayList;

public class ItemCategory implements Iterable {

  public String name;
  private ArrayList<SubCategory> equipmentList;

  public ItemCategory(String name) {
    this.name = name;
  }

  //TODO find a way to delete category w/o removing items
  public boolean deleteCategory() {

    return false;
  }

  //Passes to SubCategory constructor
  public boolean addSubCategory() {

  }
}

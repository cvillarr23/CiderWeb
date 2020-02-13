





function main() {

  let catList = new Category;

  let userIn = prompt("Enter newSubCategory:");
  while(userIn != "next") {
    catList.addSubCategory(userIn);
    userIn = prompt("Enter newSubCategory (Or enter next to go to next task): ");
  }


}


main();



// /**
// * Constructor for a type of item
// *
// */
// function createItem(String name, String abbrv) {
//   let item = {
//     name,
//     abbrv,
//     equipList,
//     numItems,
//   }
//
//   item.equipList = new Array();
//   item.numItems = 0;
//
//   return item;
// }
//
// /**
// * Adds a new item # available for checkout
// *
// */
// function addNewItem(String barcode, ) {
//
// }


class ItemType {



   constructor(name, abbrv) {
     this.name = name;
     this.abbrv = abbrv;
     this.equipList = new Array();
     this.numItems = 0;
   }

   function addNewItem(barcode, status) {
     numItems++;
      equipList[numItems] = new ItemInfo(barcode, status, numItems);
   }

}

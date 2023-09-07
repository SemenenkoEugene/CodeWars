//package HeadFirstPattern.Iterator;
//
//import java.util.List;
//
//public class PancakeHouseIterator implements IteratorEx {
//
//    List<MenuItem> items;
//    int position = 0;
//
//    public PancakeHouseIterator(List<MenuItem> items) {
//        this.items = items;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (position >= items.size()) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    @Override
//    public Object next() {
//        MenuItem menuItems = items.get(position);
//        position++;
//        return menuItems;
//    }
//}

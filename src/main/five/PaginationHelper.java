package five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PaginationHelper<I> {

  private final Map<Integer, List<I>> pager;

  private final Integer itemsPerPage;

  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    pager = initPager(collection);
  }

  private Map<Integer, List<I>> initPager(List<I> collection) {
    Map<Integer, List<I>> pager = new HashMap<>();

    List<I> currentPage = new ArrayList<>();

    Integer numOfCurrentItem = 1;
    Integer numOfCurrentPage = 0;

    for (I item : collection) {
      currentPage.add(item);
      if (numOfCurrentItem % itemsPerPage == 0 || numOfCurrentItem.equals(collection.size())) {
        pager.put(numOfCurrentPage, currentPage);
        numOfCurrentPage++;
        currentPage = new ArrayList<>();
      }
      numOfCurrentItem++;
    }
    return pager;
  }

  public int itemCount() {
    int counter = 0;
    for (Map.Entry<Integer, List<I>> entry : pager.entrySet()) {
      counter += entry.getValue().size();
    }
    return counter;

  }

  public int pageCount() {
    return pager.keySet().size();

  }

  public int pageItemCount(int pageIndex) {
    if (pager.get(pageIndex) != null) {
      return pager.get(pageIndex).size();
    }
    return -1;

  }

  public int pageIndex(int itemIndex) {
    if (itemIndex < itemCount() && itemIndex >= 0) {
      return itemIndex / itemsPerPage;
    }
    return -1;

  }
}
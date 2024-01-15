package access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    int itemCount;

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("장바구니를 초과했습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 조회");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + "가격: " + item.totalPrice());
        }
        System.out.println("총 가격: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.totalPrice();
        }
        return totalPrice;
    }


}

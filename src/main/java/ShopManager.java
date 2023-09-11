
public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductException, QuantityException{
        Product product = ProductDatabase.getProduct(productId);
        if (product.getAvailableQuantity() >= quantity){
            double totalPrice = product.getPrice() * quantity;
            return totalPrice;
        }
        throw new QuantityException("Error: We haven't so many products.");
    }
}


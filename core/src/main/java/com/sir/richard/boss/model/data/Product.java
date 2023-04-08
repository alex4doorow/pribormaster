package com.sir.richard.boss.model.data;

import com.sir.richard.boss.model.types.ProductTypes;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class Product extends AnyCatalog {
    private String model;
    private String sku;
    private String deliveryName;
    private int quantity;
    private BigDecimal price; // фактическая цена
    private BigDecimal priceWithoutDiscount; // цена без дисконта
    private BigDecimal priceWithDiscount; // цена c дисконтом
    private BigDecimal supplierPrice;
    private int stockQuantity; // на нашем складе
    private int supplierQuantity; // на складе поставщика
    private int slaveQuantity; // остаток в комплекте
    private ProductCategory category;
    //private PaymentDeliveryMethods deliveryMethod;
    private boolean optionalExist;
    private int linkId;
    //private SupplierTypes mainSupplier;
    private ProductTypes type;
    private boolean composite; // комплект
    private Set<Product> kitComponents;
    private boolean visible; // видимость (да, нет)
    //private ProductStore store;	// фронт
    //private Set<ProductMarket> markets;

    public Product(long id, String name) {
        super(id, name);
        this.quantity = 0;
        this.supplierQuantity = 0;
        this.stockQuantity = 0;
        this.slaveQuantity = -1;
        this.supplierPrice = BigDecimal.ZERO;
        this.price = BigDecimal.ZERO;

        this.priceWithoutDiscount = BigDecimal.ZERO;
        this.priceWithDiscount = BigDecimal.ZERO;

        this.model = "";
        this.sku = "";
        this.optionalExist = false;
        this.linkId = -1;
        //this.mainSupplier = null;
        this.composite = false;
        this.kitComponents = new HashSet<>();
        //this.deliveryMethod = PaymentDeliveryMethods.CURRENT;
        this.type = ProductTypes.MAIN;
        this.visible = true;
        //this.store = new ProductStore();

        //this.markets = new HashSet<ProductMarket>();

        /*
        ProductMarket ozon = new ProductMarket(CrmTypes.OZON);
        this.markets.add(ozon);
        ProductMarket yandex = new ProductMarket(CrmTypes.YANDEX_MARKET);
        this.markets.add(yandex);

        */
    }

    public Product() {
        this(0, "");
    }


    public String getViewSKU() {
        String result = "";
        if (StringUtils.isEmpty(this.sku)) {
            result = StringUtils.truncate(this.model.trim(), 3);
        } else {
            result = this.sku;
        }
        return StringUtils.upperCase(result);
    }

    public boolean isSKUVisible() {
        if (this.type == ProductTypes.MAIN) {
            return visible;
        } else if (this.type == ProductTypes.ADDITIONAL) {
            return true;
        } else {
            return visible;
        }
    }

    public String getViewUnEscapeName() {
        if (StringUtils.isEmpty(this.getName())) {
            return "";
        }
        return StringEscapeUtils.unescapeHtml4(this.getName());
    }

    public String getViewName() {
        final int MAX_VIEW_LENGTH = 139;
        String result = "";
        if (StringUtils.isNotEmpty(this.sku)) {
            result = "[" + StringUtils.upperCase(this.sku) + "] " + this.getName();
        } else {
            result = this.getName();
        }
        int index = Math.min(result.length(), MAX_VIEW_LENGTH);
        if (index < result.length()) {
            return result.substring(0, index) + "...";
        } else {
            return result.substring(0, index);
        }
    }

    public String getViewNameShort() {
        if (getName() != null) {
            final int MAX_VIEW_LENGTH = 120;
            int index = Math.min(getName().length(), MAX_VIEW_LENGTH);
            if (index < getName().length()) {
                return getName().substring(0, index) + "...";
            } else {
                return getName().substring(0, index);
            }
        }
        return null;
    }



/*

    public int getCompositeStockQuantity() {
        if (this.isComposite()) {
            int result = -1;
            for (Product slave : this.kitComponents) {
                if (result == -1) {
                    result = slave.getStockQuantity();
                } else {
                    int quantity = slave.getStockQuantity() / slave.getSlaveQuantity();
                    result = Math.min(result, quantity);
                }
            }
            return result;
        } else {
            return this.getStockQuantity();
        }
    }



    public PaymentDeliveryMethods getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(PaymentDeliveryMethods deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }





    public SupplierTypes getMainSupplier() {
        return mainSupplier;
    }

    public void setMainSupplier(SupplierTypes mainSupplier) {
        this.mainSupplier = mainSupplier;
    }

    public ProductStore getStore() {
        return store;
    }

    public void setStore(ProductStore value) {
        this.store = value;
    }




    public Set<ProductMarket> getMarkets() {
        return markets;
    }

    public void setMarkets(Set<ProductMarket> markets) {
        this.markets = markets;
    }

    public ProductMarket getMarket(CrmTypes marketType) {
        if (markets == null || markets.size() == 0) {
            return null;
        }
        for (ProductMarket productMarket : markets) {
            if (productMarket.getMarketType() == marketType) {
                return productMarket;
            }
        }
        return null;
    }
*/


    @Override
    public Product clone() throws CloneNotSupportedException  {
        Product clone = (Product) super.clone();
        clone.model = this.model == null ? null : new String(this.model);
        clone.sku = this.sku == null ? null : new String(this.sku);
        clone.quantity = this.quantity;
        clone.price = this.price == null ? null : new BigDecimal(this.price.toString());
        clone.supplierPrice = this.supplierPrice == null ? null : new BigDecimal(this.supplierPrice.toString());
        clone.supplierQuantity = this.supplierQuantity;

        clone.category = this.category == null ? null : this.category;
        clone.optionalExist = this.optionalExist;
        clone.linkId = this.linkId;
		/*
		clone.getStore().getWeight() = this.getStore().getWeight() == null ? null : new BigDecimal(this.weight.toString());
		clone.height = this.height;
		clone.length = this.length;
		clone.width = this.width;
		*/
        return clone;
    }


    @Override
    public String toString() {
        return "Product [id=" + getId() + ", name=" + getName()
                //+ ", model=" + model
                + ", sku=" + sku
                //+ ", quantity=" + quantity
                + ", price=" + price
                //+ ", stockQuantity: " + stockQuantity + ", supplierPrice: " + supplierPrice
                //+ ", category=" + category
                + "]";
    }

    public static Product createEmpty() {
        Product result = new Product();
        //result.setModel("?");
        result.setName("");
        return result;
    }
}

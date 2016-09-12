package view;

public class ForecastTable {
    public ForecastTable() {
        super();
    }
    private String childSKU;
    private String childSKUDescr;
    private float salesForecast;
    private boolean addtoPurchaseOrder;
    private boolean addtoSalesOrder;

    public void setAddtoPurchaseOrder(boolean addtoPurchaseOrder) {
        this.addtoPurchaseOrder = addtoPurchaseOrder;
    }

    public boolean isAddtoPurchaseOrder() {
        return addtoPurchaseOrder;
    }

    public void setAddtoSalesOrder(boolean addtoSalesOrder) {
        this.addtoSalesOrder = addtoSalesOrder;
    }

    public boolean isAddtoSalesOrder() {
        return addtoSalesOrder;
    }
    

    public void setSalesForecast(float salesForecast) {
        this.salesForecast = salesForecast;
    }

    public float getSalesForecast() {
        return salesForecast;
    }


    public void setChildSKU(String childSKU) {
        this.childSKU = childSKU;
    }

    public String getChildSKU() {
        return childSKU;
    }

    public void setChildSKUDescr(String childSKUDescr) {
        this.childSKUDescr = childSKUDescr;
    }

    public String getChildSKUDescr() {
        return childSKUDescr;
    }

    
}

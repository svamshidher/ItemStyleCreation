package view;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import javax.naming.Context;

import javax.naming.InitialContext;

import javax.sql.DataSource;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.binding.OperationBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;

import oracle.jbo.JboException;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import view.ForecastTable;


public class ForecastAndOrders {
    private RichInputText totalOrder;
    private RichSelectOneChoice masterSKU;
    private RichTable orderTable;
    private List<ForecastTable> forecastTableList= new ArrayList();
    private RichInputText orderAmount;
    private RichInputText totalPercentage;

    public void setTotalOrder(RichInputText totalOrder) {
        this.totalOrder = totalOrder;
    }

    public RichInputText getTotalOrder() {
        return totalOrder;
    }

    public void setMasterSKU(RichSelectOneChoice masterSKU) {
        this.masterSKU = masterSKU;
    }

    public RichSelectOneChoice getMasterSKU() {
        return masterSKU;
    }

    public void masterSKUValueChangeListner(ValueChangeEvent valueChangeEvent) {
        Connection conn = null;
        ResultSet rs = null;
        try 
        {
              conn = getDbConnection();
         } catch (Exception e) 
        {
            e.printStackTrace();
         }
              
        try {
           
        String sp = "begin ? := xx_getchildskus(?); end;";
        CallableStatement proc = null;
        proc = conn.prepareCall(sp); 
        proc.registerOutParameter(1, OracleTypes.CURSOR);            
        proc.setObject(2, getMasterSKU().getValue());
            System.out.println("input value"+getMasterSKU().getValue());
        proc.executeUpdate();
        proc.executeQuery();
        rs= ((OracleCallableStatement)proc).getCursor(1);
      //  System.out.println("result set length"+rs.);
      if (rs != null) {
      try {
          while(rs.next()){
            ForecastTable row= new ForecastTable();  
            row.setChildSKU(rs.getString("childSKU"));
            row.setChildSKUDescr(rs.getString("childSKUDescr")); 
              forecastTableList.add(row);
          }
     
      } catch (SQLException s) {
      throw new JboException(s);
      }
      }
            orderTable.setValue(forecastTableList);
            AdfFacesContext.getCurrentInstance().addPartialTarget(orderTable);
        } catch (SQLException sqlerr) {
        throw new JboException(sqlerr);
        }
     getTotalPercentage().resetValue();
     getOrderAmount().resetValue();
        AdfFacesContext.getCurrentInstance().addPartialTarget(getTotalPercentage());
        AdfFacesContext.getCurrentInstance().addPartialTarget(getOrderAmount());
    }
    public Connection getDbConnection() throws Exception
         {
             Context ctx = new InitialContext();
             DataSource ds = (DataSource)ctx.lookup("jdbc/Connection1DS");
             Connection L_con = ds.getConnection();
             return L_con;
         }

    public void setOrderTable(RichTable orderTable) {
        this.orderTable = orderTable;
    }

    public RichTable getOrderTable() {
        return orderTable;
    }

    public void SalesForecastValueChange(ValueChangeEvent valueChangeEvent) {
        String percentage;
        if(getTotalPercentage().getValue()==null){
            percentage="0.0";
        }
        else{
           percentage= getTotalPercentage().getValue().toString();
        }
       float totalPercentage=Float.parseFloat(percentage)+Float.parseFloat(valueChangeEvent.getNewValue().toString());
        String totalOrder = getTotalOrder().getValue().toString();
        float value= Float.parseFloat(totalOrder);
        System.out.println("value is"+value);
        String value1= valueChangeEvent.getNewValue().toString();
        float forecast =Float.parseFloat(value1);
        System.out.println("forecast value is"+forecast);
        orderAmount.setValue((value*forecast)/100);
        getTotalPercentage().setValue(totalPercentage);
          AdfFacesContext.getCurrentInstance().addPartialTarget(orderAmount);
        AdfFacesContext.getCurrentInstance().addPartialTarget(getTotalPercentage());
    }

    public void setOrderAmount(RichInputText orderAmount) {
        this.orderAmount = orderAmount;
    }

    public RichInputText getOrderAmount() {
        return orderAmount;
    }

    public void setTotalPercentage(RichInputText totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public RichInputText getTotalPercentage() {
        return totalPercentage;
    }
}

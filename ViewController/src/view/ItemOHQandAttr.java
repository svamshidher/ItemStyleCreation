package view;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

import javax.faces.event.ValueChangeEvent;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.JboException;

import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import view.ItemOHQ;

public class ItemOHQandAttr {
    private RichSelectOneChoice masterSku;
    private List<ItemOHQ> AttrList= new ArrayList();
    private RichTable itemOHQtable;
    private RichInputText masterSKUDescrbinding;
    private RichInputText colorBinding;
    private RichInputText sizeBinding;
    private RichInputText fitBinding;

    public ItemOHQandAttr() {
    }

    public void setMasterSku(RichSelectOneChoice masterSku) {
        this.masterSku = masterSku;
    }

    public RichSelectOneChoice getMasterSku() {
        return masterSku;
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
           
        String sp = "begin ? := XX_ITEM_GETCHILDSKUS(?); end;";
        CallableStatement proc = null;
        proc = conn.prepareCall(sp); 
        proc.registerOutParameter(1, OracleTypes.CURSOR);            
        proc.setObject(2, getMasterSku().getValue());
        System.out.println("input value"+getMasterSku().getValue());
        proc.executeUpdate();
        proc.executeQuery();
        rs= ((OracleCallableStatement)proc).getCursor(1);
        //  System.out.println("result set length"+rs.);
        Random rand = new Random();
        if (rs != null) {
        try {
          while(rs.next()){
            ItemOHQ row= new ItemOHQ();  
            row.setChildSKU(rs.getString("childSKU"));
            row.setChildSKUDescr(rs.getString("childSKU_Descr")); 
            row.setColor(rs.getString("COLOR"));
            row.setItemSize(rs.getString("ITEM_SIZE"));               
            row.setFit(rs.getString("FIT"));  
            row.setItemType(rs.getString("ITEM_TYPE")); 
            row.setSeason(rs.getString("SEASON"));  
            row.setStore1(rand.nextInt(100)); 
              row.setStore2(rand.nextInt(100)); 
              row.setStore3(rand.nextInt(100)); 
              row.setStore4(rand.nextInt(100)); 
              row.setStore5(rand.nextInt(100)); 
              row.setStore6(rand.nextInt(100)); 
              row.setStore7(rand.nextInt(100)); 
              row.setStore8(rand.nextInt(100)); 
              row.setWh1(rand.nextInt(100)); 
              row.setWh2(rand.nextInt(100)); 
              AttrList.add(row);
          }
        
        } catch (SQLException s) {
        throw new JboException(s);
        }
        }
            getItemOHQtable().setValue(AttrList);
            AdfFacesContext.getCurrentInstance().addPartialTarget(getItemOHQtable());
        } catch (SQLException sqlerr) {
        throw new JboException(sqlerr);
        }
            try {
                conn.close();
            } catch (SQLException e) {
            }
       
        }
        public Connection getDbConnection() throws Exception
         {
             Context ctx = new InitialContext();
             DataSource ds = (DataSource)ctx.lookup("jdbc/Connection1DS");
             Connection L_con = ds.getConnection();
             return L_con;
         }

    public void setItemOHQtable(RichTable itemOHQtable) {
        this.itemOHQtable = itemOHQtable;
    }

    public RichTable getItemOHQtable() {
        return itemOHQtable;
    }

    public void setMasterSKUDescrbinding(RichInputText masterSKUDescrbinding) {
        this.masterSKUDescrbinding = masterSKUDescrbinding;
    }

    public RichInputText getMasterSKUDescrbinding() {
        return masterSKUDescrbinding;
    }

    public void setColorBinding(RichInputText colorBinding) {
        this.colorBinding = colorBinding;
    }

    public RichInputText getColorBinding() {
        return colorBinding;
    }

    public void setSizeBinding(RichInputText sizeBinding) {
        this.sizeBinding = sizeBinding;
    }

    public RichInputText getSizeBinding() {
        return sizeBinding;
    }

    public void setFitBinding(RichInputText fitBinding) {
        this.fitBinding = fitBinding;
    }

    public RichInputText getFitBinding() {
        return fitBinding;
    }
}

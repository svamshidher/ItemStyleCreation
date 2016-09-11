package view;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

public class ItemCreation {
    private RichInputText color;
    private RichInputText masterSKU;
    private RichInputText masterSKUDescription;
    private RichInputText roMasterSKU;
    private RichInputText tableMasterSKUDescr;
    private RichInputText code;
    private RichInputText size1;
    private RichInputText size2;
    private RichInputText size3;
    private RichInputText size4;
    private RichInputText size5;
    private RichInputText size6;
    private RichInputText size7;
    private RichInputText size8;
    private RichInputText size9;
    private RichInputText size10;
    private RichInputText size11;
    private RichInputText size12;
    private RichInputText size13;
    private RichInputText size14;
    private RichInputText size15;
    private RichInputText size16;
    private RichInputText size17;
    private RichInputText size18;
    private RichInputText size1Descr;
    private RichInputText size9Descr;
    private RichInputText size8Descr;
    private RichInputText size7Descr;
    private RichInputText size6Descr;
    private RichInputText size5Descr;
    private RichInputText size4Descr;
    private RichInputText size3Descr;
    private RichInputText size2Descr;
    private RichInputText size18Descr;
    private RichInputText size17Descr;
    private RichInputText size16Descr;
    private RichInputText size15Descr;
    private RichInputText size14Descr;
    private RichInputText size13Descr;
    private RichInputText size12Descr;
    private RichInputText size11Descr;
    private RichInputText size10Descr;

    public ItemCreation() {
    }

    public void setColor(RichInputText color) {
        this.color = color;
    }

    public RichInputText getColor() {
        return color;
    }

    public void setMasterSKU(RichInputText masterSKU) {
        this.masterSKU = masterSKU;
    }

    public RichInputText getMasterSKU() {
        return masterSKU;
    }

    public void setMasterSKUDescription(RichInputText masterSKUDescription) {
        this.masterSKUDescription = masterSKUDescription;
    }

    public RichInputText getMasterSKUDescription() {
        return masterSKUDescription;
    }

    public void setRoMasterSKU(RichInputText roMasterSKU) {
        this.roMasterSKU = roMasterSKU;
    }

    public RichInputText getRoMasterSKU() {
        return roMasterSKU;
    }

    public void setTableMasterSKUDescr(RichInputText tableMasterSKUDescr) {
        this.tableMasterSKUDescr = tableMasterSKUDescr;
    }

    public RichInputText getTableMasterSKUDescr() {
        return tableMasterSKUDescr;
    }

    public void setCode(RichInputText code) {
        this.code = code;
    }

    public RichInputText getCode() {
        return code;
    }

    public void CodeValueChangeListner(ValueChangeEvent valueChangeEvent) {
        System.out.println("Inside Value Change Event");
        RichInputText code = getCode();
               RichInputText masterSKU=getMasterSKU();
               RichInputText input=  getSize1();
               RichInputText size2=  getSize2();
               RichInputText size3=  getSize3();
               RichInputText size4=  getSize4();
               RichInputText size5=  getSize5();
               RichInputText size6=  getSize6();
               RichInputText size7=  getSize7();
               RichInputText size8=  getSize8();
               RichInputText size9=  getSize9();
               RichInputText size10=  getSize10();
               RichInputText size11=  getSize11();
               RichInputText size12=  getSize12();
               RichInputText size13=  getSize13();
               RichInputText size14=  getSize14();
               RichInputText size15=  getSize15();
               RichInputText size16=  getSize16();
               RichInputText size17=  getSize17();
               RichInputText size18=  getSize18();
               RichInputText size1Descr=  getSize1Descr();
               RichInputText size2Descr=  getSize2Descr();
        RichInputText size3Descr=  getSize3Descr();
        RichInputText size4Descr=  getSize4Descr();
        RichInputText size5Descr=  getSize5Descr();
        RichInputText size6Descr=  getSize6Descr();
        RichInputText size7Descr=  getSize7Descr();
        RichInputText size8Descr=  getSize8Descr();
        RichInputText size9Descr=  getSize9Descr();
        RichInputText size10Descr=  getSize10Descr();
        RichInputText size11Descr=  getSize11Descr();
        RichInputText size12Descr=  getSize12Descr();
        RichInputText size13Descr=  getSize13Descr();
        RichInputText size14Descr=  getSize14Descr();
        RichInputText size15Descr=  getSize15Descr();
        RichInputText size16Descr=  getSize16Descr();
        RichInputText size17Descr=  getSize17Descr();
        RichInputText size18Descr=  getSize18Descr();
               RichInputText roMasterSKU=  getRoMasterSKU();
               RichInputText masterSKUDescription=getMasterSKUDescription();
               RichInputText tablemasterSKUDescription=getTableMasterSKUDescr();
               String value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+input.getLabel();
               String size2Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size2.getLabel();
               String size3Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size3.getLabel();
               String size4Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size4.getLabel();
               String size5Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size5.getLabel();
               String size6Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size6.getLabel();
               String size7Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size7.getLabel();
               String size8Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size8.getLabel();
               String size9Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size9.getLabel();
               String size10Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size10.getLabel();
               String size11Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size11.getLabel();
               String size12Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size12.getLabel();
               String size13Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size13.getLabel();
               String size14Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size14.getLabel();
               String size15Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size15.getLabel();
               String size16Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size16.getLabel();
               String size17Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size17.getLabel();
               String size18Value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+size18.getLabel();    
               String size1DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XS-Tailored";
               String size2DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XS-Slim";
        String size3DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XS-Standard";
        String size4DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-S-Tailored";
        String size5DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-S-Slim";
        String size6DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-S-Standard";
        String size7DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-M-Tailored";
        String size8DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-M-Slim";
        String size9DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-M-Standard";
        String size10DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-L-Tailored";
        String size11DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-L-Slim";
        String size12DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-L-Standard";
        String size13DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XL-Tailored";
        String size14DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XL-Slim";
        String size15DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XL-Standard";
        String size16DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XXL-Tailored";
        String size17DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XXL-Slim";
        String size18DescrValue =""+getMasterSKUDescription().getValue()+"-"+getColor().getValue()+"-XXL-Standard";
        
               roMasterSKU.setValue(masterSKU.getValue());
               tablemasterSKUDescription.setValue(masterSKUDescription.getValue());
               input.setValue(value);
               size2.setValue(size2Value);
               size3.setValue(size3Value);
               size4.setValue(size4Value);
               size5.setValue(size5Value);
               size6.setValue(size6Value);
               size7.setValue(size7Value);
               size8.setValue(size8Value);
               size9.setValue(size9Value);
               size10.setValue(size10Value);
               size11.setValue(size11Value);
               size12.setValue(size12Value);
               size13.setValue(size13Value);
               size14.setValue(size14Value);
               size15.setValue(size15Value);
               size16.setValue(size16Value);
               size17.setValue(size17Value);
               size18.setValue(size18Value);
               size1Descr.setValue(size1DescrValue);
               size2Descr.setValue(size2DescrValue);
        size3Descr.setValue(size3DescrValue);
        size4Descr.setValue(size4DescrValue);
        size5Descr.setValue(size5DescrValue);
        size6Descr.setValue(size6DescrValue);
        size7Descr.setValue(size7DescrValue);
        size8Descr.setValue(size8DescrValue);        
        size9Descr.setValue(size9DescrValue);
        size10Descr.setValue(size10DescrValue);
        size11Descr.setValue(size11DescrValue);
        size12Descr.setValue(size12DescrValue);
        size13Descr.setValue(size13DescrValue);
        size14Descr.setValue(size14DescrValue);
        size15Descr.setValue(size15DescrValue);
        size16Descr.setValue(size16DescrValue);
        size17Descr.setValue(size17DescrValue);
        size18Descr.setValue(size18DescrValue);
               System.out.println("Value is"+size1DescrValue);
               AdfFacesContext.getCurrentInstance().addPartialTarget(input);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size2);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size3);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size4);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size5);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size6);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size7);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size8);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size9);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size10);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size11);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size12);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size13);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size14);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size15);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size16);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size17);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size18);
               AdfFacesContext.getCurrentInstance().addPartialTarget(roMasterSKU);
               AdfFacesContext.getCurrentInstance().addPartialTarget(tablemasterSKUDescription);
               AdfFacesContext.getCurrentInstance().addPartialTarget(size18Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size1Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size2Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size3Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size4Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size5Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size6Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size7Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size8Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size9Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size10Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size11Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size12Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size13Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size14Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size15Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size16Descr);
        AdfFacesContext.getCurrentInstance().addPartialTarget(size17Descr);
    }

    public void setSize1(RichInputText size1) {
        this.size1 = size1;
    }

    public RichInputText getSize1() {
        return size1;
    }

    public void setSize2(RichInputText size2) {
        this.size2 = size2;
    }

    public RichInputText getSize2() {
        return size2;
    }

    public void setSize3(RichInputText size3) {
        this.size3 = size3;
    }

    public RichInputText getSize3() {
        return size3;
    }

    public void setSize4(RichInputText size4) {
        this.size4 = size4;
    }

    public RichInputText getSize4() {
        return size4;
    }

    public void setSize5(RichInputText size5) {
        this.size5 = size5;
    }

    public RichInputText getSize5() {
        return size5;
    }

    public void setSize6(RichInputText size6) {
        this.size6 = size6;
    }

    public RichInputText getSize6() {
        return size6;
    }

    public void setSize7(RichInputText size7) {
        this.size7 = size7;
    }

    public RichInputText getSize7() {
        return size7;
    }

    public void setSize8(RichInputText size8) {
        this.size8 = size8;
    }

    public RichInputText getSize8() {
        return size8;
    }

    public void setSize9(RichInputText size9) {
        this.size9 = size9;
    }

    public RichInputText getSize9() {
        return size9;
    }

    public void setSize10(RichInputText size10) {
        this.size10 = size10;
    }

    public RichInputText getSize10() {
        return size10;
    }

    public void setSize11(RichInputText size11) {
        this.size11 = size11;
    }

    public RichInputText getSize11() {
        return size11;
    }

    public void setSize12(RichInputText size12) {
        this.size12 = size12;
    }

    public RichInputText getSize12() {
        return size12;
    }

    public void setSize13(RichInputText size13) {
        this.size13 = size13;
    }

    public RichInputText getSize13() {
        return size13;
    }

    public void setSize14(RichInputText size14) {
        this.size14 = size14;
    }

    public RichInputText getSize14() {
        return size14;
    }

    public void setSize15(RichInputText size15) {
        this.size15 = size15;
    }

    public RichInputText getSize15() {
        return size15;
    }

    public void setSize16(RichInputText size16) {
        this.size16 = size16;
    }

    public RichInputText getSize16() {
        return size16;
    }

    public void setSize17(RichInputText size17) {
        this.size17 = size17;
    }

    public RichInputText getSize17() {
        return size17;
    }

    public void setSize18(RichInputText size18) {
        this.size18 = size18;
    }

    public RichInputText getSize18() {
        return size18;
    }

    public void setSize1Descr(RichInputText size1Descr) {
        this.size1Descr = size1Descr;
    }

    public RichInputText getSize1Descr() {
        return size1Descr;
    }

    public void setSize9Descr(RichInputText size9Descr) {
        this.size9Descr = size9Descr;
    }

    public RichInputText getSize9Descr() {
        return size9Descr;
    }

    public void setSize8Descr(RichInputText size8Descr) {
        this.size8Descr = size8Descr;
    }

    public RichInputText getSize8Descr() {
        return size8Descr;
    }

    public void setSize7Descr(RichInputText size7Descr) {
        this.size7Descr = size7Descr;
    }

    public RichInputText getSize7Descr() {
        return size7Descr;
    }

    public void setSize6Descr(RichInputText size6Descr) {
        this.size6Descr = size6Descr;
    }

    public RichInputText getSize6Descr() {
        return size6Descr;
    }

    public void setSize5Descr(RichInputText size5Descr) {
        this.size5Descr = size5Descr;
    }

    public RichInputText getSize5Descr() {
        return size5Descr;
    }

    public void setSize4Descr(RichInputText size4Descr) {
        this.size4Descr = size4Descr;
    }

    public RichInputText getSize4Descr() {
        return size4Descr;
    }

    public void setSize3Descr(RichInputText size3Descr) {
        this.size3Descr = size3Descr;
    }

    public RichInputText getSize3Descr() {
        return size3Descr;
    }

    public void setSize2Descr(RichInputText size2Descr) {
        this.size2Descr = size2Descr;
    }

    public RichInputText getSize2Descr() {
        return size2Descr;
    }

    public void setSize18Descr(RichInputText size18Descr) {
        this.size18Descr = size18Descr;
    }

    public RichInputText getSize18Descr() {
        return size18Descr;
    }

    public void setSize17Descr(RichInputText size17Descr) {
        this.size17Descr = size17Descr;
    }

    public RichInputText getSize17Descr() {
        return size17Descr;
    }

    public void setSize16Descr(RichInputText size16Descr) {
        this.size16Descr = size16Descr;
    }

    public RichInputText getSize16Descr() {
        return size16Descr;
    }

    public void setSize15Descr(RichInputText size15Descr) {
        this.size15Descr = size15Descr;
    }

    public RichInputText getSize15Descr() {
        return size15Descr;
    }

    public void setSize14Descr(RichInputText size14Descr) {
        this.size14Descr = size14Descr;
    }

    public RichInputText getSize14Descr() {
        return size14Descr;
    }

    public void setSize13Descr(RichInputText size13Descr) {
        this.size13Descr = size13Descr;
    }

    public RichInputText getSize13Descr() {
        return size13Descr;
    }

    public void setSize12Descr(RichInputText size12Descr) {
        this.size12Descr = size12Descr;
    }

    public RichInputText getSize12Descr() {
        return size12Descr;
    }

    public void setSize11Descr(RichInputText size11Descr) {
        this.size11Descr = size11Descr;
    }

    public RichInputText getSize11Descr() {
        return size11Descr;
    }

    public void setSize10Descr(RichInputText size10Descr) {
        this.size10Descr = size10Descr;
    }

    public RichInputText getSize10Descr() {
        return size10Descr;
    }
}

--------------------------------------------------------
--  File created - Wednesday-September-14-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Function XX_GETCHILDSKUS
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE FUNCTION "SYSTEM"."XX_GETCHILDSKUS" (ip_MasterSKU String)
RETURN SYS_REFCURSOR
AS
REF_CURSOR SYS_REFCURSOR;
BEGIN
OPEN REF_CURSOR FOR
select  
  item_sku AS childSKU, 
  item_skudesc  AS childSKUDescr
from xx_child_skus
unpivot include nulls
(
  (item_sku, item_skudesc) FOR ( SRC ) IN
  (
    (size1, size1_descr),
    (size2, size2_descr),
    (size3, size3_descr),
    (size4, size4_descr),
    (size5, size5_descr),
    (size6, size6_descr),
    (size7, size7_descr),
    (size8, size8_descr),
    (size9, size9_descr),
    (size10, size10_descr),
    (size11, size11_descr),
    (size12, size12_descr),
    (size13, size13_descr),
    (size14, size14_descr),
    (size15, size15_descr),
    (size16, size16_descr),
    (size17, size17_descr),
    (size18, size18_descr)
  )
) child_sku
where mastersku=ip_MasterSKU
order by code ;
RETURN REF_CURSOR;
END;

/


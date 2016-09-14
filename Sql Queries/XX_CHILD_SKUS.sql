--------------------------------------------------------
--  File created - Wednesday-September-14-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table XX_CHILD_SKUS
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."XX_CHILD_SKUS" 
   (	"MASTERSKU" VARCHAR2(40 BYTE), 
	"COLOR" VARCHAR2(50 BYTE), 
	"CODE" VARCHAR2(30 BYTE), 
	"SIZE1" VARCHAR2(100 BYTE), 
	"SIZE2" VARCHAR2(100 BYTE), 
	"SIZE3" VARCHAR2(100 BYTE), 
	"SIZE4" VARCHAR2(100 BYTE), 
	"SIZE5" VARCHAR2(100 BYTE), 
	"SIZE6" VARCHAR2(100 BYTE), 
	"SIZE7" VARCHAR2(100 BYTE), 
	"SIZE8" VARCHAR2(100 BYTE), 
	"SIZE9" VARCHAR2(100 BYTE), 
	"SIZE10" VARCHAR2(100 BYTE), 
	"SIZE11" VARCHAR2(100 BYTE), 
	"SIZE12" VARCHAR2(100 BYTE), 
	"SIZE13" VARCHAR2(100 BYTE), 
	"SIZE14" VARCHAR2(100 BYTE), 
	"SIZE15" VARCHAR2(100 BYTE), 
	"SIZE16" VARCHAR2(100 BYTE), 
	"SIZE17" VARCHAR2(100 BYTE), 
	"SIZE18" VARCHAR2(100 BYTE), 
	"SIZE1_DESCR" VARCHAR2(100 BYTE), 
	"MASTERSKU_DESCR" VARCHAR2(50 BYTE), 
	"SIZE18_DESCR" VARCHAR2(100 BYTE), 
	"SIZE17_DESCR" VARCHAR2(100 BYTE), 
	"SIZE16_DESCR" VARCHAR2(100 BYTE), 
	"SIZE15_DESCR" VARCHAR2(100 BYTE), 
	"SIZE14_DESCR" VARCHAR2(100 BYTE), 
	"SIZE13_DESCR" VARCHAR2(100 BYTE), 
	"SIZE12_DESCR" VARCHAR2(100 BYTE), 
	"SIZE11_DESCR" VARCHAR2(100 BYTE), 
	"SIZE10_DESCR" VARCHAR2(100 BYTE), 
	"SIZE9_DESCR" VARCHAR2(100 BYTE), 
	"SIZE8_DESCR" VARCHAR2(100 BYTE), 
	"SIZE7_DESCR" VARCHAR2(100 BYTE), 
	"SIZE6_DESCR" VARCHAR2(100 BYTE), 
	"SIZE5_DESCR" VARCHAR2(100 BYTE), 
	"SIZE4_DESCR" VARCHAR2(100 BYTE), 
	"SIZE3_DESCR" VARCHAR2(100 BYTE), 
	"SIZE2_DESCR" VARCHAR2(100 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_CHILD_SKU
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."PK_CHILD_SKU" ON "SYSTEM"."XX_CHILD_SKUS" ("MASTERSKU", "COLOR", "CODE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table XX_CHILD_SKUS
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."XX_CHILD_SKUS" ADD CONSTRAINT "PK_CHILD_SKU" PRIMARY KEY ("MASTERSKU", "COLOR", "CODE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;


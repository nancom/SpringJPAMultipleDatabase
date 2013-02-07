DROP TABLE "REGIONS" cascade constraints;
--------------------------------------------------------
--  DDL for Table REGIONS
--------------------------------------------------------

CREATE TABLE "REGIONS"
 (	"REGION_ID" NUMBER,
"REGION_NAME" VARCHAR2(25 BYTE)
 ) ;


Insert into REGIONS (REGION_ID,REGION_NAME) values (1,'Europe');
Insert into REGIONS (REGION_ID,REGION_NAME) values (2,'Americas');
Insert into REGIONS (REGION_ID,REGION_NAME) values (3,'Asia');
Insert into REGIONS (REGION_ID,REGION_NAME) values (4,'Middle East and Africa');
--------------------------------------------------------
--  DDL for Index REG_ID_PK
--------------------------------------------------------
CREATE UNIQUE INDEX "REG_ID_PK" ON "REGIONS" ("REGION_ID");

--------------------------------------------------------
--  Constraints for Table REGIONS
--------------------------------------------------------

ALTER TABLE "REGIONS" ADD CONSTRAINT "REG_ID_PK" PRIMARY KEY ("REGION_ID") ENABLE;
ALTER TABLE "REGIONS" MODIFY ("REGION_ID" CONSTRAINT "REGION_ID_NN" NOT NULL ENABLE);
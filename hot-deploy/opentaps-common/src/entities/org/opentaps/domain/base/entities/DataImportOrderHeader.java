package org.opentaps.domain.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity DataImportOrderHeader.
 */
@javax.persistence.Entity
@Table(name="DATA_IMPORT_ORDER_HEADER")
public class DataImportOrderHeader extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderTypeId", "ORDER_TYPE_ID");
        fields.put("customerPartyId", "CUSTOMER_PARTY_ID");
        fields.put("supplierPartyId", "SUPPLIER_PARTY_ID");
        fields.put("orderDate", "ORDER_DATE");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("shippingTotal", "SHIPPING_TOTAL");
        fields.put("orderTax", "ORDER_TAX");
        fields.put("taxAuthPartyId", "TAX_AUTH_PARTY_ID");
        fields.put("adjustmentsTotal", "ADJUSTMENTS_TOTAL");
        fields.put("grandTotal", "GRAND_TOTAL");
        fields.put("comments", "COMMENTS");
        fields.put("productStoreShipMethId", "PRODUCT_STORE_SHIP_METH_ID");
        fields.put("orderClosed", "ORDER_CLOSED");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataImportOrderHeader", fields);
}
  public static enum Fields implements EntityFieldInterface<DataImportOrderHeader> {
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    customerPartyId("customerPartyId"),
    supplierPartyId("supplierPartyId"),
    orderDate("orderDate"),
    currencyUomId("currencyUomId"),
    shippingTotal("shippingTotal"),
    orderTax("orderTax"),
    taxAuthPartyId("taxAuthPartyId"),
    adjustmentsTotal("adjustmentsTotal"),
    grandTotal("grandTotal"),
    comments("comments"),
    productStoreShipMethId("productStoreShipMethId"),
    orderClosed("orderClosed"),
    processedTimestamp("processedTimestamp"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="DataImportOrderHeader_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="DataImportOrderHeader_GEN")
   @Id
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="ORDER_TYPE_ID")
   private String orderTypeId;
   @Column(name="CUSTOMER_PARTY_ID")
   private String customerPartyId;
   @Column(name="SUPPLIER_PARTY_ID")
   private String supplierPartyId;
   @Column(name="ORDER_DATE")
   private Timestamp orderDate;
   @Column(name="CURRENCY_UOM_ID")
   private String currencyUomId;
   @Column(name="SHIPPING_TOTAL")
   private BigDecimal shippingTotal;
   @Column(name="ORDER_TAX")
   private BigDecimal orderTax;
   @Column(name="TAX_AUTH_PARTY_ID")
   private String taxAuthPartyId;
   @Column(name="ADJUSTMENTS_TOTAL")
   private BigDecimal adjustmentsTotal;
   @Column(name="GRAND_TOTAL")
   private BigDecimal grandTotal;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="PRODUCT_STORE_SHIP_METH_ID")
   private String productStoreShipMethId;
   @Column(name="ORDER_CLOSED")
   private String orderClosed;
   @Column(name="PROCESSED_TIMESTAMP")
   private Timestamp processedTimestamp;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderType orderType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUSTOMER_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party customerParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SUPPLIER_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party supplierParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_SHIP_METH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStoreShipmentMeth productStoreShipmentMeth = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="dataImportOrderHeader", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ORDER_ID")
   
   private List<DataImportOrderItem> dataImportOrderItems = null;

  /**
   * Default constructor.
   */
  public DataImportOrderHeader() {
      super();
      this.baseEntityName = "DataImportOrderHeader";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("customerPartyId");this.allFieldsNames.add("supplierPartyId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("shippingTotal");this.allFieldsNames.add("orderTax");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("adjustmentsTotal");this.allFieldsNames.add("grandTotal");this.allFieldsNames.add("comments");this.allFieldsNames.add("productStoreShipMethId");this.allFieldsNames.add("orderClosed");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataImportOrderHeader(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param customerPartyId the customerPartyId to set
     */
    public void setCustomerPartyId(String customerPartyId) {
        this.customerPartyId = customerPartyId;
    }
    /**
     * Auto generated value setter.
     * @param supplierPartyId the supplierPartyId to set
     */
    public void setSupplierPartyId(String supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param shippingTotal the shippingTotal to set
     */
    public void setShippingTotal(BigDecimal shippingTotal) {
        this.shippingTotal = shippingTotal;
    }
    /**
     * Auto generated value setter.
     * @param orderTax the orderTax to set
     */
    public void setOrderTax(BigDecimal orderTax) {
        this.orderTax = orderTax;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * @param adjustmentsTotal the adjustmentsTotal to set
     */
    public void setAdjustmentsTotal(BigDecimal adjustmentsTotal) {
        this.adjustmentsTotal = adjustmentsTotal;
    }
    /**
     * Auto generated value setter.
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param productStoreShipMethId the productStoreShipMethId to set
     */
    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }
    /**
     * Auto generated value setter.
     * @param orderClosed the orderClosed to set
     */
    public void setOrderClosed(String orderClosed) {
        this.orderClosed = orderClosed;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomerPartyId() {
        return this.customerPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSupplierPartyId() {
        return this.supplierPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getShippingTotal() {
        return this.shippingTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOrderTax() {
        return this.orderTax;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAdjustmentsTotal() {
        return this.adjustmentsTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getGrandTotal() {
        return this.grandTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreShipMethId() {
        return this.productStoreShipMethId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderClosed() {
        return this.orderClosed;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>OrderType</code> by the relation named <code>OrderType</code>.
     * @return the <code>OrderType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderType getOrderType() throws RepositoryException {
        if (this.orderType == null) {
            this.orderType = getRelatedOne(OrderType.class, "OrderType");
        }
        return this.orderType;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>CustomerParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getCustomerParty() throws RepositoryException {
        if (this.customerParty == null) {
            this.customerParty = getRelatedOne(Party.class, "CustomerParty");
        }
        return this.customerParty;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>SupplierParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getSupplierParty() throws RepositoryException {
        if (this.supplierParty == null) {
            this.supplierParty = getRelatedOne(Party.class, "SupplierParty");
        }
        return this.supplierParty;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>ProductStoreShipmentMeth</code> by the relation named <code>ProductStoreShipmentMeth</code>.
     * @return the <code>ProductStoreShipmentMeth</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStoreShipmentMeth getProductStoreShipmentMeth() throws RepositoryException {
        if (this.productStoreShipmentMeth == null) {
            this.productStoreShipmentMeth = getRelatedOne(ProductStoreShipmentMeth.class, "ProductStoreShipmentMeth");
        }
        return this.productStoreShipmentMeth;
    }
    /**
     * Auto generated method that gets the related <code>DataImportOrderItem</code> by the relation named <code>DataImportOrderItem</code>.
     * @return the list of <code>DataImportOrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DataImportOrderItem> getDataImportOrderItems() throws RepositoryException {
        if (this.dataImportOrderItems == null) {
            this.dataImportOrderItems = getRelated(DataImportOrderItem.class, "DataImportOrderItem");
        }
        return this.dataImportOrderItems;
    }

    /**
     * Auto generated value setter.
     * @param orderType the orderType to set
    */
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
    /**
     * Auto generated value setter.
     * @param customerParty the customerParty to set
    */
    public void setCustomerParty(Party customerParty) {
        this.customerParty = customerParty;
    }
    /**
     * Auto generated value setter.
     * @param supplierParty the supplierParty to set
    */
    public void setSupplierParty(Party supplierParty) {
        this.supplierParty = supplierParty;
    }
    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param productStoreShipmentMeth the productStoreShipmentMeth to set
    */
    public void setProductStoreShipmentMeth(ProductStoreShipmentMeth productStoreShipmentMeth) {
        this.productStoreShipmentMeth = productStoreShipmentMeth;
    }
    /**
     * Auto generated value setter.
     * @param dataImportOrderItems the dataImportOrderItems to set
    */
    public void setDataImportOrderItems(List<DataImportOrderItem> dataImportOrderItems) {
        this.dataImportOrderItems = dataImportOrderItems;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addDataImportOrderItem(DataImportOrderItem dataImportOrderItem) {
        if (this.dataImportOrderItems == null) {
            this.dataImportOrderItems = new ArrayList<DataImportOrderItem>();
        }
        this.dataImportOrderItems.add(dataImportOrderItem);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeDataImportOrderItem(DataImportOrderItem dataImportOrderItem) {
        if (this.dataImportOrderItems == null) {
            return;
        }
        this.dataImportOrderItems.remove(dataImportOrderItem);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearDataImportOrderItem() {
        if (this.dataImportOrderItems == null) {
            return;
        }
        this.dataImportOrderItems.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setCustomerPartyId((String) mapValue.get("customerPartyId"));
        setSupplierPartyId((String) mapValue.get("supplierPartyId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setShippingTotal(convertToBigDecimal(mapValue.get("shippingTotal")));
        setOrderTax(convertToBigDecimal(mapValue.get("orderTax")));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setAdjustmentsTotal(convertToBigDecimal(mapValue.get("adjustmentsTotal")));
        setGrandTotal(convertToBigDecimal(mapValue.get("grandTotal")));
        setComments((String) mapValue.get("comments"));
        setProductStoreShipMethId((String) mapValue.get("productStoreShipMethId"));
        setOrderClosed((String) mapValue.get("orderClosed"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("customerPartyId", getCustomerPartyId());
        mapValue.put("supplierPartyId", getSupplierPartyId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("shippingTotal", getShippingTotal());
        mapValue.put("orderTax", getOrderTax());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("adjustmentsTotal", getAdjustmentsTotal());
        mapValue.put("grandTotal", getGrandTotal());
        mapValue.put("comments", getComments());
        mapValue.put("productStoreShipMethId", getProductStoreShipMethId());
        mapValue.put("orderClosed", getOrderClosed());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
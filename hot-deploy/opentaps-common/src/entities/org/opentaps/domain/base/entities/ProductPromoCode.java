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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductPromoCode.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PROMO_CODE")
public class ProductPromoCode extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPromoCodeId", "PRODUCT_PROMO_CODE_ID");
        fields.put("productPromoId", "PRODUCT_PROMO_ID");
        fields.put("userEntered", "USER_ENTERED");
        fields.put("requireEmailOrParty", "REQUIRE_EMAIL_OR_PARTY");
        fields.put("useLimitPerCode", "USE_LIMIT_PER_CODE");
        fields.put("useLimitPerCustomer", "USE_LIMIT_PER_CUSTOMER");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("createdDate", "CREATED_DATE");
        fields.put("createdByUserLogin", "CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPromoCode", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPromoCode> {
    productPromoCodeId("productPromoCodeId"),
    productPromoId("productPromoId"),
    userEntered("userEntered"),
    requireEmailOrParty("requireEmailOrParty"),
    useLimitPerCode("useLimitPerCode"),
    useLimitPerCustomer("useLimitPerCustomer"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductPromoCode_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductPromoCode_GEN")
   @Id
   @Column(name="PRODUCT_PROMO_CODE_ID")
   private String productPromoCodeId;
   @Column(name="PRODUCT_PROMO_ID")
   private String productPromoId;
   @Column(name="USER_ENTERED")
   private String userEntered;
   @Column(name="REQUIRE_EMAIL_OR_PARTY")
   private String requireEmailOrParty;
   @Column(name="USE_LIMIT_PER_CODE")
   private Long useLimitPerCode;
   @Column(name="USE_LIMIT_PER_CUSTOMER")
   private Long useLimitPerCustomer;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="CREATED_DATE")
   private Timestamp createdDate;
   @Column(name="CREATED_BY_USER_LOGIN")
   private String createdByUserLogin;
   @Column(name="LAST_MODIFIED_DATE")
   private Timestamp lastModifiedDate;
   @Column(name="LAST_MODIFIED_BY_USER_LOGIN")
   private String lastModifiedByUserLogin;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPromo productPromo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CREATED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedCreatedByUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LAST_MODIFIED_BY_USER_LOGIN", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin relatedLastModifiedByUserLogin = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productPromoCode", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID")
   
   private List<OrderProductPromoCode> orderProductPromoCodes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productPromoCode", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID")
   
   private List<ProductPromoCodeEmail> productPromoCodeEmails = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productPromoCode", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID")
   
   private List<ProductPromoCodeParty> productPromoCodePartys = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID")
   
   private List<ProductPromoUse> productPromoUses = null;
   @OneToMany(fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID")
   
   private List<ShoppingList> shoppingLists = null;

  /**
   * Default constructor.
   */
  public ProductPromoCode() {
      super();
      this.baseEntityName = "ProductPromoCode";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPromoCodeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPromoCodeId");this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("userEntered");this.allFieldsNames.add("requireEmailOrParty");this.allFieldsNames.add("useLimitPerCode");this.allFieldsNames.add("useLimitPerCustomer");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPromoCode(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productPromoCodeId the productPromoCodeId to set
     */
    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }
    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
    /**
     * Auto generated value setter.
     * @param userEntered the userEntered to set
     */
    public void setUserEntered(String userEntered) {
        this.userEntered = userEntered;
    }
    /**
     * Auto generated value setter.
     * @param requireEmailOrParty the requireEmailOrParty to set
     */
    public void setRequireEmailOrParty(String requireEmailOrParty) {
        this.requireEmailOrParty = requireEmailOrParty;
    }
    /**
     * Auto generated value setter.
     * @param useLimitPerCode the useLimitPerCode to set
     */
    public void setUseLimitPerCode(Long useLimitPerCode) {
        this.useLimitPerCode = useLimitPerCode;
    }
    /**
     * Auto generated value setter.
     * @param useLimitPerCustomer the useLimitPerCustomer to set
     */
    public void setUseLimitPerCustomer(Long useLimitPerCustomer) {
        this.useLimitPerCustomer = useLimitPerCustomer;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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
    public String getProductPromoCodeId() {
        return this.productPromoCodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoId() {
        return this.productPromoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserEntered() {
        return this.userEntered;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequireEmailOrParty() {
        return this.requireEmailOrParty;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseLimitPerCode() {
        return this.useLimitPerCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseLimitPerCustomer() {
        return this.useLimitPerCustomer;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
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
     * Auto generated method that gets the related <code>ProductPromo</code> by the relation named <code>ProductPromo</code>.
     * @return the <code>ProductPromo</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPromo getProductPromo() throws RepositoryException {
        if (this.productPromo == null) {
            this.productPromo = getRelatedOne(ProductPromo.class, "ProductPromo");
        }
        return this.productPromo;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>CreatedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedCreatedByUserLogin() throws RepositoryException {
        if (this.relatedCreatedByUserLogin == null) {
            this.relatedCreatedByUserLogin = getRelatedOne(UserLogin.class, "CreatedByUserLogin");
        }
        return this.relatedCreatedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>LastModifiedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getRelatedLastModifiedByUserLogin() throws RepositoryException {
        if (this.relatedLastModifiedByUserLogin == null) {
            this.relatedLastModifiedByUserLogin = getRelatedOne(UserLogin.class, "LastModifiedByUserLogin");
        }
        return this.relatedLastModifiedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>OrderProductPromoCode</code> by the relation named <code>OrderProductPromoCode</code>.
     * @return the list of <code>OrderProductPromoCode</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderProductPromoCode> getOrderProductPromoCodes() throws RepositoryException {
        if (this.orderProductPromoCodes == null) {
            this.orderProductPromoCodes = getRelated(OrderProductPromoCode.class, "OrderProductPromoCode");
        }
        return this.orderProductPromoCodes;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoCodeEmail</code> by the relation named <code>ProductPromoCodeEmail</code>.
     * @return the list of <code>ProductPromoCodeEmail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoCodeEmail> getProductPromoCodeEmails() throws RepositoryException {
        if (this.productPromoCodeEmails == null) {
            this.productPromoCodeEmails = getRelated(ProductPromoCodeEmail.class, "ProductPromoCodeEmail");
        }
        return this.productPromoCodeEmails;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoCodeParty</code> by the relation named <code>ProductPromoCodeParty</code>.
     * @return the list of <code>ProductPromoCodeParty</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoCodeParty> getProductPromoCodePartys() throws RepositoryException {
        if (this.productPromoCodePartys == null) {
            this.productPromoCodePartys = getRelated(ProductPromoCodeParty.class, "ProductPromoCodeParty");
        }
        return this.productPromoCodePartys;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoUse</code> by the relation named <code>ProductPromoUse</code>.
     * @return the list of <code>ProductPromoUse</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoUse> getProductPromoUses() throws RepositoryException {
        if (this.productPromoUses == null) {
            this.productPromoUses = getRelated(ProductPromoUse.class, "ProductPromoUse");
        }
        return this.productPromoUses;
    }
    /**
     * Auto generated method that gets the related <code>ShoppingList</code> by the relation named <code>ShoppingList</code>.
     * @return the list of <code>ShoppingList</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShoppingList> getShoppingLists() throws RepositoryException {
        if (this.shoppingLists == null) {
            this.shoppingLists = getRelated(ShoppingList.class, "ShoppingList");
        }
        return this.shoppingLists;
    }

    /**
     * Auto generated value setter.
     * @param productPromo the productPromo to set
    */
    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }
    /**
     * Auto generated value setter.
     * @param relatedCreatedByUserLogin the relatedCreatedByUserLogin to set
    */
    public void setRelatedCreatedByUserLogin(UserLogin relatedCreatedByUserLogin) {
        this.relatedCreatedByUserLogin = relatedCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param relatedLastModifiedByUserLogin the relatedLastModifiedByUserLogin to set
    */
    public void setRelatedLastModifiedByUserLogin(UserLogin relatedLastModifiedByUserLogin) {
        this.relatedLastModifiedByUserLogin = relatedLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param orderProductPromoCodes the orderProductPromoCodes to set
    */
    public void setOrderProductPromoCodes(List<OrderProductPromoCode> orderProductPromoCodes) {
        this.orderProductPromoCodes = orderProductPromoCodes;
    }
    /**
     * Auto generated value setter.
     * @param productPromoCodeEmails the productPromoCodeEmails to set
    */
    public void setProductPromoCodeEmails(List<ProductPromoCodeEmail> productPromoCodeEmails) {
        this.productPromoCodeEmails = productPromoCodeEmails;
    }
    /**
     * Auto generated value setter.
     * @param productPromoCodePartys the productPromoCodePartys to set
    */
    public void setProductPromoCodePartys(List<ProductPromoCodeParty> productPromoCodePartys) {
        this.productPromoCodePartys = productPromoCodePartys;
    }
    /**
     * Auto generated value setter.
     * @param productPromoUses the productPromoUses to set
    */
    public void setProductPromoUses(List<ProductPromoUse> productPromoUses) {
        this.productPromoUses = productPromoUses;
    }
    /**
     * Auto generated value setter.
     * @param shoppingLists the shoppingLists to set
    */
    public void setShoppingLists(List<ShoppingList> shoppingLists) {
        this.shoppingLists = shoppingLists;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addOrderProductPromoCode(OrderProductPromoCode orderProductPromoCode) {
        if (this.orderProductPromoCodes == null) {
            this.orderProductPromoCodes = new ArrayList<OrderProductPromoCode>();
        }
        this.orderProductPromoCodes.add(orderProductPromoCode);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeOrderProductPromoCode(OrderProductPromoCode orderProductPromoCode) {
        if (this.orderProductPromoCodes == null) {
            return;
        }
        this.orderProductPromoCodes.remove(orderProductPromoCode);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearOrderProductPromoCode() {
        if (this.orderProductPromoCodes == null) {
            return;
        }
        this.orderProductPromoCodes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductPromoCodeEmail(ProductPromoCodeEmail productPromoCodeEmail) {
        if (this.productPromoCodeEmails == null) {
            this.productPromoCodeEmails = new ArrayList<ProductPromoCodeEmail>();
        }
        this.productPromoCodeEmails.add(productPromoCodeEmail);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductPromoCodeEmail(ProductPromoCodeEmail productPromoCodeEmail) {
        if (this.productPromoCodeEmails == null) {
            return;
        }
        this.productPromoCodeEmails.remove(productPromoCodeEmail);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductPromoCodeEmail() {
        if (this.productPromoCodeEmails == null) {
            return;
        }
        this.productPromoCodeEmails.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductPromoCodeParty(ProductPromoCodeParty productPromoCodeParty) {
        if (this.productPromoCodePartys == null) {
            this.productPromoCodePartys = new ArrayList<ProductPromoCodeParty>();
        }
        this.productPromoCodePartys.add(productPromoCodeParty);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductPromoCodeParty(ProductPromoCodeParty productPromoCodeParty) {
        if (this.productPromoCodePartys == null) {
            return;
        }
        this.productPromoCodePartys.remove(productPromoCodeParty);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductPromoCodeParty() {
        if (this.productPromoCodePartys == null) {
            return;
        }
        this.productPromoCodePartys.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPromoCodeId((String) mapValue.get("productPromoCodeId"));
        setProductPromoId((String) mapValue.get("productPromoId"));
        setUserEntered((String) mapValue.get("userEntered"));
        setRequireEmailOrParty((String) mapValue.get("requireEmailOrParty"));
        setUseLimitPerCode((Long) mapValue.get("useLimitPerCode"));
        setUseLimitPerCustomer((Long) mapValue.get("useLimitPerCustomer"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
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
        mapValue.put("productPromoCodeId", getProductPromoCodeId());
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("userEntered", getUserEntered());
        mapValue.put("requireEmailOrParty", getRequireEmailOrParty());
        mapValue.put("useLimitPerCode", getUseLimitPerCode());
        mapValue.put("useLimitPerCustomer", getUseLimitPerCustomer());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
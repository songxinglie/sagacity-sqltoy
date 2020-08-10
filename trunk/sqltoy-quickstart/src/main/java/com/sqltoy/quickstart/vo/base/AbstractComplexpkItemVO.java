/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sqltoy.quickstart.vo.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;


/**
 * @project sqltoy-quickstart
 * @version 1.0.0
 * Table: sqltoy_complexpk_item,Remark:复合主键级联操作子表  
 */
@Entity(tableName="sqltoy_complexpk_item",pk_constraint="PRIMARY")
public abstract class AbstractComplexpkItemVO implements Serializable,
	java.lang.Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4276504492384224152L;
	
	/**
	 * jdbcType:VARCHAR
	 * ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String id;
	
	/**
	 * jdbcType:DATE
	 * 交易日期
	 */
	@Column(name="TRANS_DATE",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected LocalDate transDate;
	
	/**
	 * jdbcType:VARCHAR
	 * 业务代码
	 */
	@Column(name="TRANS_ID",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String transId;
	
	/**
	 * jdbcType:VARCHAR
	 * 商品编码
	 */
	@Column(name="PRODUCT_ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String productId;
	
	/**
	 * jdbcType:DECIMAL
	 * 数量
	 */
	@Column(name="QUANTITY",length=8L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal quantity;
	
	/**
	 * jdbcType:DECIMAL
	 * 价格
	 */
	@Column(name="PRICE",length=8L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal price;
	
	/**
	 * jdbcType:DECIMAL
	 * 总金额
	 */
	@Column(name="AMT",length=10L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal amt;
	
	/**
	 * jdbcType:DATETIME
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	

	/** default constructor */
	public AbstractComplexpkItemVO() {
	}
	
	/** pk constructor */
	public AbstractComplexpkItemVO(String id)
	{
		this.id=id;
	}

	/** minimal constructor */
	public AbstractComplexpkItemVO(String id,String productId,BigDecimal quantity,BigDecimal price,BigDecimal amt,LocalDateTime createTime)
	{
		this.id=id;
		this.productId=productId;
		this.quantity=quantity;
		this.price=price;
		this.amt=amt;
		this.createTime=createTime;
	}

	/** full constructor */
	public AbstractComplexpkItemVO(String id,LocalDate transDate,String transId,String productId,BigDecimal quantity,BigDecimal price,BigDecimal amt,LocalDateTime createTime)
	{
		this.id=id;
		this.transDate=transDate;
		this.transId=transId;
		this.productId=productId;
		this.quantity=quantity;
		this.price=price;
		this.amt=amt;
		this.createTime=createTime;
	}
	
	/**
	 *@param id the id to set
	 */
	public AbstractComplexpkItemVO setId(String id) {
		this.id=id;
		return this;
	}
		
	/**
	 *@return the Id
	 */
	public String getId() {
	    return this.id;
	}
	
	/**
	 *@param transDate the transDate to set
	 */
	public AbstractComplexpkItemVO setTransDate(LocalDate transDate) {
		this.transDate=transDate;
		return this;
	}
		
	/**
	 *@return the TransDate
	 */
	public LocalDate getTransDate() {
	    return this.transDate;
	}
	
	/**
	 *@param transId the transId to set
	 */
	public AbstractComplexpkItemVO setTransId(String transId) {
		this.transId=transId;
		return this;
	}
		
	/**
	 *@return the TransId
	 */
	public String getTransId() {
	    return this.transId;
	}
	
	/**
	 *@param productId the productId to set
	 */
	public AbstractComplexpkItemVO setProductId(String productId) {
		this.productId=productId;
		return this;
	}
		
	/**
	 *@return the ProductId
	 */
	public String getProductId() {
	    return this.productId;
	}
	
	/**
	 *@param quantity the quantity to set
	 */
	public AbstractComplexpkItemVO setQuantity(BigDecimal quantity) {
		this.quantity=quantity;
		return this;
	}
		
	/**
	 *@return the Quantity
	 */
	public BigDecimal getQuantity() {
	    return this.quantity;
	}
	
	/**
	 *@param price the price to set
	 */
	public AbstractComplexpkItemVO setPrice(BigDecimal price) {
		this.price=price;
		return this;
	}
		
	/**
	 *@return the Price
	 */
	public BigDecimal getPrice() {
	    return this.price;
	}
	
	/**
	 *@param amt the amt to set
	 */
	public AbstractComplexpkItemVO setAmt(BigDecimal amt) {
		this.amt=amt;
		return this;
	}
		
	/**
	 *@return the Amt
	 */
	public BigDecimal getAmt() {
	    return this.amt;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public AbstractComplexpkItemVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("id=").append(getId()).append("\n");
		columnsBuffer.append("transDate=").append(getTransDate()).append("\n");
		columnsBuffer.append("transId=").append(getTransId()).append("\n");
		columnsBuffer.append("productId=").append(getProductId()).append("\n");
		columnsBuffer.append("quantity=").append(getQuantity()).append("\n");
		columnsBuffer.append("price=").append(getPrice()).append("\n");
		columnsBuffer.append("amt=").append(getAmt()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		return columnsBuffer.toString();
	}
}
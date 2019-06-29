package cn.zhou.core.bean.product;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品
 * 
 * @author lixu
 * @Date [2014-3-28 下午04:38:53]
 */

@Entity
@Table(name = "Product")
public class Product implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;
	/** 前台每页数 */
	public static final int FRONT_PAGE_SIZE = 8;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String no; // 商品编号
	@Column
	private String name; // 商品名称
	@Column
	private Double weight; // 重量
	@Column
	private Integer isNew; // 是否新品
	@Column
	private Integer isHot; // 是否热门
	@Column
	private Integer isCommend; // 是否推荐
	@Column
	private Date createTime; // 创建时间
	@Column
	private String createUserId; // 创建用户id
	@Column
	private Date checkTime; // 检查时间
	@Column
	private String checkUserId; // 检查用户id
	@Column
	private Integer isShow = 0; // 图片 新品 热卖 推荐 上下架 操作选项
	@Column
	private Integer isDel = 1;
	@Column
	private Integer typeId;
	@Column
	private Integer brandId;
	@Column
	private String keywords;
	@Column
	private Integer sales; // 售价
	@Column
	private String description;
	@Column
	private String packageList;
	@Column
	private String feature;// 特征
	@Column
	private String color;// 9,10,11,12
	@Column
	private String size;// S,L,XXL

	/// *****************************************
	// 添加外部对象
	private Img img;

	public Img getImg() {
		return img;
	}

	public void setImg(Img img) {
		this.img = img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsCommend() {
		return isCommend;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPackageList() {
		return packageList;
	}

	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		return "Product [id=" + id + ",no=" + no + ",name=" + name + ",weight=" + weight + ",isNew=" + isNew + ",isHot="
				+ isHot + ",isCommend=" + isCommend + ",createTime=" + createTime + ",createUserId=" + createUserId
				+ ",checkTime=" + checkTime + ",checkUserId=" + checkUserId + ",isShow=" + isShow + ",isDel=" + isDel
				+ ",typeId=" + typeId + ",brandId=" + brandId + ",keywords=" + keywords + ",sales=" + sales
				+ ",description=" + description + ",packageList=" + packageList + ",feature=" + feature + ",color="
				+ color + ",size=" + size + "]";
	}
}

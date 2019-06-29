package cn.zhou.core.bean.product;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import cn.zhou.core.web.Constants;

/**
 * 品牌
 * 
 * @author lx
 *
 */

@Entity
@Table(name = "Brand2")
public class Brand2 {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private String description;
	@Column(name = "img_url")
	private String imgUrl;
	@Column
	private Integer sort;
	@Column(name = "is_display")
	private Integer isDisplay;

	// 获取全路径
//	public String getAllUrl(){
//		return Constants.IMAGE_URL + imgUrl;
//	}

	// 页号
	private Integer pageNo = 1;
	// 开始行
	private Integer startRow;
	// 每页数
	private Integer pageSize = 10;

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		// 计算一次开始行
		this.startRow = (pageNo - 1) * pageSize;
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		// 计算一次开始行
		this.startRow = (pageNo - 1) * pageSize;
		this.pageNo = pageNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl + ", sort="
				+ sort + ", isDisplay=" + isDisplay + "]";
	}

}

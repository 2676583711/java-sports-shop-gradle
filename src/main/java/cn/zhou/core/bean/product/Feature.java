package cn.zhou.core.bean.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品属性
 * 
 * @author lixu
 * @Date [2014-3-28 下午04:38:53]
 */

@Entity
@Table(name = "feature")
public class Feature implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private String value;
	@Column
	private Integer sort;
	@Column
	private Integer isDel;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public String toString() {
		return "Feature [id=" + id + ",name=" + name + ",value=" + value + ",sort=" + sort + ",isDel=" + isDel + "]";
	}
}

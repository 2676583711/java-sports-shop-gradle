package cn.zhou.core.bean.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import cn.zhou.core.web.Constants;

/**
 * 图片
 * 
 * @author lixu
 * @Date [2014-3-28 下午04:38:53]
 */

@Entity
@Table(name = "Img")
public class Img implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private Integer productId;
	@Column
	private String url;
	@Column
	private Integer isDef;

	// 获取全Url
//	public String getAllUrl(){
//		return Constants.IMAGE_URL + url;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getIsDef() {
		return isDef;
	}

	public void setIsDef(Integer isDef) {
		this.isDef = isDef;
	}

	public String toString() {
		return "Img [id=" + id + ",productId=" + productId + ",url=" + url + ",isDef=" + isDef + "]";
	}
}

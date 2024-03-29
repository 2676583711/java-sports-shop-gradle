package cn.zhou.core.bean.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 购买者
 * 
 * @author lixu
 * @Date [2014-3-28 下午04:38:53]
 */

@Entity
@Table(name = "Buyer")
public class Buyer implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private Gender gender;
	@Column
	private String email;
	@Column
	private String realName;
	@Column
	private Date registerTime;
	@Column
	private String province;
	@Column
	private String city;
	@Column
	private String town;
	@Column
	private String addr;
	@Column
	private Integer isDel;

	public enum Gender {

		MAN {
			public String getName() {
				return "男";
			}
		},
		WOMAN {
			public String getName() {
				return "女";
			}
		},
		SECRECY {
			public String getName() {
				return "保密";
			}
		};

		public abstract String getName();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "Buyer [username=" + username + ", password=" + password + ", gender=" + gender + ", email=" + email
				+ ", realName=" + realName + ", registerTime=" + registerTime + ", province=" + province + ", city="
				+ city + ", town=" + town + ", addr=" + addr + ", isDel=" + isDel + "]";
	}

}

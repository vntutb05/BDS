package com.pdsproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "active")
	private String active;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "hot_product")
	private String hotProduct;
	
	@Column(name = "for_you")
	private String forYouProduct;
	
	@Column(name = "area")
	private String area;

	@Column(name = "xa")
	private String xa;
	
	@Column(name = "thon")
	private String thon;
	
	@Column(name = "huyen")
	private String huyen;
	
	@Column(name = "tinh")
	private String tinh;
	
	@Column(name = "duong")
	private String duong;
	
	@Column(name = "mat_tien")
	private String matTien;
	
	@Column(name = "tho_cu")
	private String thoCu;
	
	@Column(name = "phap_ly")
	private String phapLy;
	
	@Column(name = "hinh_1")
	private String hinh1;
	
	@Column(name = "hinh_2")
	private String hinh2;
	
	@Column(name = "hinh_3")
	private String hinh3;
	
	@Column(name = "hinh_4")
	private String hinh4;
	
	@Column(name = "hinh_5")
	private String hinh5;
	
	public Product() {
		
	}

	public Product(long id, String name, String description, String active, String category, String price,
			String hotProduct, String forYouProduct, String area, String xa, String thon, String huyen, String tinh,
			String duong, String matTien, String thoCu, String phapLy, String hinh1, String hinh2, String hinh3,
			String hinh4, String hinh5) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
		this.category = category;
		this.price = price;
		this.hotProduct = hotProduct;
		this.forYouProduct = forYouProduct;
		this.area = area;
		this.xa = xa;
		this.thon = thon;
		this.huyen = huyen;
		this.tinh = tinh;
		this.duong = duong;
		this.matTien = matTien;
		this.thoCu = thoCu;
		this.phapLy = phapLy;
		this.hinh1 = hinh1;
		this.hinh2 = hinh2;
		this.hinh3 = hinh3;
		this.hinh4 = hinh4;
		this.hinh5 = hinh5;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getHotProduct() {
		return hotProduct;
	}

	public void setHotProduct(String hotProduct) {
		this.hotProduct = hotProduct;
	}

	public String getForYouProduct() {
		return forYouProduct;
	}

	public void setForYouProduct(String forYouProduct) {
		this.forYouProduct = forYouProduct;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	public String getDuong() {
		return duong;
	}

	public void setDuong(String duong) {
		this.duong = duong;
	}

	public String getMatTien() {
		return matTien;
	}

	public void setMatTien(String matTien) {
		this.matTien = matTien;
	}

	public String getThoCu() {
		return thoCu;
	}

	public void setThoCu(String thoCu) {
		this.thoCu = thoCu;
	}

	public String getPhapLy() {
		return phapLy;
	}

	public void setPhapLy(String phapLy) {
		this.phapLy = phapLy;
	}

	public String getHinh1() {
		return hinh1;
	}

	public void setHinh1(String hinh1) {
		this.hinh1 = hinh1;
	}

	public String getHinh2() {
		return hinh2;
	}

	public void setHinh2(String hinh2) {
		this.hinh2 = hinh2;
	}

	public String getHinh3() {
		return hinh3;
	}

	public void setHinh3(String hinh3) {
		this.hinh3 = hinh3;
	}

	public String getHinh4() {
		return hinh4;
	}

	public void setHinh4(String hinh4) {
		this.hinh4 = hinh4;
	}

	public String getHinh5() {
		return hinh5;
	}

	public void setHinh5(String hinh5) {
		this.hinh5 = hinh5;
	}

}

package com.pdsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pdsproject.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%"
			+ "OR p.description LIKE %?1%"
			+ "OR p.category LIKE %?1%"
			+ "OR p.price LIKE %?1% ")
	List<Product> findAllProducts(@Param("searchText") String searchText);

	// Tìm giá

	@Query("SELECT p FROM Product p WHERE 0 < p.price AND p.price <= 5000000 ")
	List<Product> findAllProductsPrice1();

	@Query("SELECT p FROM Product p WHERE 500000000 < p.price AND p.price <= 800000000 ")
	List<Product> findAllProductsPrice2();

	@Query("SELECT p FROM Product p WHERE 800000000 < p.price AND p.price <= 1000000000 ")
	List<Product> findAllProductsPrice3();

	@Query("SELECT p FROM Product p WHERE 1000000000 < p.price AND p.price < 2000000001 ")
	List<Product> findAllProductsPrice4();

	@Query("SELECT p FROM Product p WHERE 2000000000 < p.price AND p.price <= 3000000000 ")
	List<Product> findAllProductsPrice5();

	@Query("SELECT p FROM Product p WHERE 3000000000 < p.price AND p.price <= 5000000000 ")
	List<Product> findAllProductsPrice6();

	@Query("SELECT p FROM Product p WHERE 5000000000 < p.price AND p.price <= 7000000000 ")	
	List<Product> findAllProductsPrice7();

	@Query("SELECT p FROM Product p WHERE 7000000000 < p.price AND p.price <= 10000000000 ")
	List<Product> findAllProductsPrice8();

	@Query("SELECT p FROM Product p WHERE 10000000000 < p.price AND p.price <= 20000000000 ")
	List<Product> findAllProductsPrice9();

	@Query("SELECT p FROM Product p WHERE 20000000000 <= p.price")
	List<Product> findAllProductsPrice10();

	// Tìm diện tích

	@Query("SELECT p FROM Product p WHERE 0 < p.area AND p.area <= 200 ")
	List<Product> findAllProductsArea1();

	@Query("SELECT p FROM Product p WHERE 200 < p.area AND p.area <= 500 ")
	List<Product> findAllProductsArea2();

	@Query("SELECT p FROM Product p WHERE 500 < p.area AND p.area <= 1000 ")
	List<Product> findAllProductsArea3();

	@Query("SELECT p FROM Product p WHERE 1000 < p.area AND p.area <= 5000 ")
	List<Product> findAllProductsArea4();

	@Query("SELECT p FROM Product p WHERE 5000 < p.area AND p.area <= 10000 ")
	List<Product> findAllProductsArea5();

	@Query("SELECT p FROM Product p WHERE 10000 < p.area AND p.area <= 50000 ")
	List<Product> findAllProductsArea6();

	@Query("SELECT p FROM Product p WHERE 50000 < p.area AND p.area <= 100000 ")
	List<Product> findAllProductsArea7();

	@Query("SELECT p FROM Product p WHERE 100000 < p.area AND p.area <= 200000 ")
	List<Product> findAllProductsArea8();

	@Query("SELECT p FROM Product p WHERE 200000 <= p.area")
	List<Product> findAllProductsArea9();

	@Query("SELECT p FROM Product p WHERE p.hotProduct = 1")
	List<Product> findHotProduct();

	@Query("SELECT p FROM Product p WHERE p.forYouProduct = 1")
	List<Product> findForYouProduct();

	// ĐẤT DỰ ÁN

	@Query("SELECT p FROM Product p WHERE p.category = 1")
	List<Product> findDuAnProduct();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 0 < p.price AND p.price <= 500000000 ")
	List<Product> findDuAnProductAndPrice1();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 500000000 < p.price AND p.price <= 800000000")
	List<Product> findDuAnProductAndPrice2();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 800000000 < p.price AND p.price <= 1000000000 ")
	List<Product> findDuAnProductAndPrice3();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 1000000000 < p.price AND p.price <= 2000000000")
	List<Product> findDuAnProductAndPrice4();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 2000000000 < p.price AND p.price <= 3000000000")
	List<Product> findDuAnProductAndPrice5();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 3000000000 < p.price AND p.price <= 3000000000")
	List<Product> findDuAnProductAndPrice6();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 5000000000 < p.price AND p.price <= 7000000000 ")
	List<Product> findDuAnProductAndPrice7();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 7000000000 < p.price AND p.price <= 10000000000 ")
	List<Product> findDuAnProductAndPrice8();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 10000000000 < p.price AND p.price <= 20000000000 ")
	List<Product> findDuAnProductAndPrice9();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 20000000000 <= p.price")
	List<Product> findDuAnProductAndPrice10();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 0 < p.area AND p.area <= 200")
	List<Product> findDuAnProductAndArea1();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 200 < p.area AND p.area <= 500")
	List<Product> findDuAnProductAndArea2();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 500 < p.area AND p.area <= 1000")
	List<Product> findDuAnProductAndArea3();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 1000 < p.area AND p.area <= 5000")
	List<Product> findDuAnProductAndArea4();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 5000 < p.area AND p.area <= 10000")
	List<Product> findDuAnProductAndArea5();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 10000 < p.area AND p.area <= 50000")
	List<Product> findDuAnProductAndArea6();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 50000 < p.area AND p.area <= 100000")
	List<Product> findDuAnProductAndArea7();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 100000 < p.area AND p.area <= 200000")
	List<Product> findDuAnProductAndArea8();

	@Query("SELECT p FROM Product p WHERE p.category = 1 AND 200000 <= p.area")
	List<Product> findDuAnProductAndArea9();

	// ĐẤT VƯỜN
	@Query("SELECT p FROM Product p WHERE p.category = 2")
	List<Product> findVuonProduct();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 0 < p.price AND p.price <= 500000000")
	List<Product> findVuonProductAndPrice1();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 500000000 < p.price AND p.price <= 800000000")
	List<Product> findVuonProductAndPrice2();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 800000000 < p.price AND p.price <= 1000000000")
	List<Product> findVuonProductAndPrice3();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 1000000000 < p.price AND p.price <= 2000000000")
	List<Product> findVuonProductAndPrice4();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 2000000000 < p.price AND p.price <= 3000000000")
	List<Product> findVuonProductAndPrice5();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 3000000000 < p.price AND p.price <= 5000000000")
	List<Product> findVuonProductAndPrice6();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 5000000000 < p.price AND p.price <= 7000000000")
	List<Product> findVuonProductAndPrice7();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 7000000000 < p.price AND p.price <= 10000000000")
	List<Product> findVuonProductAndPrice8();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 10000000000 < p.price AND p.price <= 20000000000")
	List<Product> findVuonProductAndPrice9();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 20000000000 <= p.price")
	List<Product> findVuonProductAndPrice10();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 0 < p.area AND p.area <= 200")
	List<Product> findVuonProductAndArea1();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 200 < p.area AND p.area <= 500")
	List<Product> findVuonProductAndArea2();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 500 < p.area AND p.area <= 1000")
	List<Product> findVuonProductAndArea3();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 1000 < p.area AND p.area <= 5000")
	List<Product> findVuonProductAndArea4();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 5000 < p.area AND p.area <= 10000")
	List<Product> findVuonProductAndArea5();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 10000 < p.area AND p.area <= 50000")
	List<Product> findVuonProductAndArea6();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 50000 < p.area AND p.area <= 100000")
	List<Product> findVuonProductAndArea7();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 100000 < p.area AND p.area <= 200000")
	List<Product> findVuonProductAndArea8();

	@Query("SELECT p FROM Product p WHERE p.category = 2 AND 200000 <= p.area")
	List<Product> findVuonProductAndArea9();

	// ĐẤT MẶT ĐƯỜNG
	@Query("SELECT p FROM Product p WHERE p.category = 3")
	List<Product> findMatDuongProduct();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 0 < p.price AND p.price <= 500000000")
	List<Product> findMatDuongProductAndPrice1();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 500000000 < p.price AND p.price <= 800000000")
	List<Product> findMatDuongProductAndPrice2();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 800000000 < p.price AND p.price <= 1000000000")
	List<Product> findMatDuongProductAndPrice3();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 1000000000 < p.price AND p.price <= 2000000000")
	List<Product> findMatDuongProductAndPrice4();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 2000000000 < p.price AND p.price <= 3000000000")
	List<Product> findMatDuongProductAndPrice5();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 3000000000 < p.price AND p.price <= 5000000000")
	List<Product> findMatDuongProductAndPrice6();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 5000000000 < p.price AND p.price <= 7000000000")
	List<Product> findMatDuongProductAndPrice7();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 7000000000 < p.price AND p.price <= 10000000000")
	List<Product> findMatDuongProductAndPrice8();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 10000000000 < p.price AND p.price <= 20000000000")
	List<Product> findMatDuongProductAndPrice9();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 20000000000 <= p.price")
	List<Product> findMatDuongProductAndPrice10();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 0 < p.area AND p.area <= 200")
	List<Product> findMatDuongProductAndArea1();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 200 < p.area AND p.area <= 500")
	List<Product> findMatDuongProductAndArea2();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 500 < p.area AND p.area <= 1000")
	List<Product> findMatDuongProductAndArea3();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 1000 < p.area AND p.area <= 5000")
	List<Product> findMatDuongProductAndArea4();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 5000 < p.area AND p.area <= 10000")
	List<Product> findMatDuongProductAndArea5();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 10000 < p.area AND p.area <= 50000")
	List<Product> findMatDuongProductAndArea6();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 50000 < p.area AND p.area <= 100000")
	List<Product> findMatDuongProductAndArea7();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 100000 < p.area AND p.area <= 200000")
	List<Product> findMatDuongProductAndArea8();

	@Query("SELECT p FROM Product p WHERE p.category = 3 AND 200000 <= p.area")
	List<Product> findMatDuongProductAndArea9();
}

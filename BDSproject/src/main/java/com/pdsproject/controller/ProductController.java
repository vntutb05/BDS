package com.pdsproject.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pdsproject.exception.ResourceNotFoundException;
import com.pdsproject.model.Product;
import com.pdsproject.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {

	public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/img";
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(@Param("searchText") String searchText){
		if(searchText != null) {
			String searchText2 = searchText.replaceAll("_", " ");
			return productRepository.findAllProducts(searchText2);
		}
		return productRepository.findAll();
	}
	
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody Product product) {
//		
//		Product product = new Product();
//		
//		String imageUUID;
//        if (!file.isEmpty()) {
//            imageUUID = file.getOriginalFilename();
//            Path fileNameAndPath = Paths.get(uploadDir, imageUUID);
//            Files.write(fileNameAndPath, file.getBytes());
//        } else {
//            imageUUID = "null";
//        }
//		product.setName(name);
//		product.setDescription(description);
//		product.setImageUrl("abc" + file.getOriginalFilename());
		
		return new ResponseEntity<>(productRepository.save(product) , HttpStatus.CREATED);
		
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sản phẩm không có!"));
		return ResponseEntity.ok(product);
	}
	
	// Gía
	@GetMapping("/findProductPrice1")
	public List<Product> getProductPrice1() {
		return productRepository.findAllProductsPrice1();
	}
	
	@GetMapping("/findProductPrice2")
	public List<Product> getProductPrice2() {
		return productRepository.findAllProductsPrice2();
	}
	
	@GetMapping("/findProductPrice3")
	public List<Product> getProductPrice3() {
		return productRepository.findAllProductsPrice3();
	}
	
	@GetMapping("/findProductPrice4")
	public List<Product> getProductPrice4() {
		return productRepository.findAllProductsPrice4();
	}
	
	@GetMapping("/findProductPrice5")
	public List<Product> getProductPrice5() {
		return productRepository.findAllProductsPrice5();
	}
	
	@GetMapping("/findProductPrice6")
	public List<Product> getProductPrice6() {
		return productRepository.findAllProductsPrice6();
	}
	
	@GetMapping("/findProductPrice7")
	public List<Product> getProductPrice7() {
		return productRepository.findAllProductsPrice7();
	}
	
	@GetMapping("/findProductPrice8")
	public List<Product> getProductPrice8() {
		return productRepository.findAllProductsPrice8();
	}
	
	@GetMapping("/findProductPrice9")
	public List<Product> getProductPrice9() {
		return productRepository.findAllProductsPrice9();
	}
	
	@GetMapping("/findProductPrice10")
	public List<Product> getProductPrice10() {
		return productRepository.findAllProductsPrice10();
	}
	
	// Diện tích
	
	@GetMapping("/findProductArea1")
	public List<Product> getProductArea1() {
		return productRepository.findAllProductsArea1();
	}
	
	@GetMapping("/findProductArea2")
	public List<Product> getProductArea2() {
		return productRepository.findAllProductsArea2();
	}
	
	@GetMapping("/findProductArea3")
	public List<Product> getProductArea3() {
		return productRepository.findAllProductsArea3();
	}
	
	@GetMapping("/findProductArea4")
	public List<Product> getProductArea4() {
		return productRepository.findAllProductsArea4();
	}
	
	@GetMapping("/findProductArea5")
	public List<Product> getProductArea5() {
		return productRepository.findAllProductsArea5();
	}
	
	@GetMapping("/findProductArea6")
	public List<Product> getProductArea6() {
		return productRepository.findAllProductsArea6();
	}
	
	@GetMapping("/findProductArea7")
	public List<Product> getProductArea7() {
		return productRepository.findAllProductsArea7();
	}
	
	@GetMapping("/findProductArea8")
	public List<Product> getProductArea8() {
		return productRepository.findAllProductsArea8();
	}
	
	@GetMapping("/findProductArea9")
	public List<Product> getProductArea9() {
		return productRepository.findAllProductsArea9();
	}
	
	@GetMapping("/hotProduct")
	public List<Product> getHotProduct() {
		return productRepository.findHotProduct();
	}
	
	@GetMapping("/forYouProduct")
	public List<Product> getForYouProduct() {
		return productRepository.findForYouProduct();
	}
	//ĐẤT DỰ ÁN
	@GetMapping("/DatDuAn")
	public List<Product> getDatDuAn() {
		return productRepository.findDuAnProduct();
	}
	
	@GetMapping("/DatDuAnAndPrice1")
	public List<Product> getDatDuAnAndPrice1() {
		return productRepository.findDuAnProductAndPrice1();
	}
	
	@GetMapping("/DatDuAnAndPrice2")
	public List<Product> getDatDuAnAndPrice2() {
		return productRepository.findDuAnProductAndPrice2();
	}

	@GetMapping("/DatDuAnAndPrice3")
	public List<Product> getDatDuAnAndPrice3() {
		return productRepository.findDuAnProductAndPrice3();
	}
	
	@GetMapping("/DatDuAnAndPrice4")
	public List<Product> getDatDuAnAndPrice4() {
		return productRepository.findDuAnProductAndPrice4();
	}

	@GetMapping("/DatDuAnAndPrice5")
	public List<Product> getDatDuAnAndPrice5() {
		return productRepository.findDuAnProductAndPrice5();
	}
	
	@GetMapping("/DatDuAnAndPrice6")
	public List<Product> getDatDuAnAndPrice6() {
		return productRepository.findDuAnProductAndPrice6();
	}
	
	@GetMapping("/DatDuAnAndPrice7")
	public List<Product> getDatDuAnAndPrice7() {
		return productRepository.findDuAnProductAndPrice7();
	}
	
	@GetMapping("/DatDuAnAndPrice8")
	public List<Product> getDatDuAnAndPrice8() {
		return productRepository.findDuAnProductAndPrice8();
	}
	
	@GetMapping("/DatDuAnAndPrice9")
	public List<Product> getDatDuAnAndPrice9() {
		return productRepository.findDuAnProductAndPrice9();
	}
	
	@GetMapping("/DatDuAnAndPrice10")
	public List<Product> getDatDuAnAndPrice10() {
		return productRepository.findDuAnProductAndPrice10();
	}
	
	@GetMapping("/DatDuAnAndArea1")
	public List<Product> getDatDuAnAndArea1() {
		return productRepository.findDuAnProductAndArea1();
	}
	
	@GetMapping("/DatDuAnAndArea2")
	public List<Product> getDatDuAnAndArea2() {
		return productRepository.findDuAnProductAndArea2();
	}
	
	@GetMapping("/DatDuAnAndArea3")
	public List<Product> getDatDuAnAndArea3() {
		return productRepository.findDuAnProductAndArea3();
	}
	
	@GetMapping("/DatDuAnAndArea4")
	public List<Product> getDatDuAnAndArea4() {
		return productRepository.findDuAnProductAndArea4();
	}
	
	@GetMapping("/DatDuAnAndArea5")
	public List<Product> getDatDuAnAndArea5() {
		return productRepository.findDuAnProductAndArea5();
	}
	
	@GetMapping("/DatDuAnAndArea6")
	public List<Product> getDatDuAnAndArea6() {
		return productRepository.findDuAnProductAndArea6();
	}
	
	@GetMapping("/DatDuAnAndArea7")
	public List<Product> getDatDuAnAndArea7() {
		return productRepository.findDuAnProductAndArea7();
	}
	
	@GetMapping("/DatDuAnAndArea8")
	public List<Product> getDatDuAnAndArea8() {
		return productRepository.findDuAnProductAndArea8();
	}
	
	@GetMapping("/DatDuAnAndArea9")
	public List<Product> getDatDuAnAndArea9() {
		return productRepository.findDuAnProductAndArea9();
	}
	
	//ĐẤT VƯỜN
	@GetMapping("/DatVuon")
	public List<Product> getDatVuon() {
		return productRepository.findVuonProduct();
	}
	
	@GetMapping("/DatVuonAndPrice1")
	public List<Product> getDatVuonAndPrice1() {
		return productRepository.findVuonProductAndPrice1();
	}
	
	@GetMapping("/DatVuonAndPrice2")
	public List<Product> getDatVuonAndPrice2() {
		return productRepository.findVuonProductAndPrice2();
	}
	
	@GetMapping("/DatVuonAndPrice3")
	public List<Product> getDatVuonAndPrice3() {
		return productRepository.findVuonProductAndPrice3();
	}
	
	@GetMapping("/DatVuonAndPrice4")
	public List<Product> getDatVuonAndPrice4() {
		return productRepository.findVuonProductAndPrice4();
	}
	
	@GetMapping("/DatVuonAndPrice5")
	public List<Product> getDatVuonAndPrice5() {
		return productRepository.findVuonProductAndPrice5();
	}
	
	@GetMapping("/DatVuonAndPrice6")
	public List<Product> getDatVuonAndPrice6() {
		return productRepository.findVuonProductAndPrice6();
	}
	
	@GetMapping("/DatVuonAndPrice7")
	public List<Product> getDatVuonAndPrice7() {
		return productRepository.findVuonProductAndPrice7();
	}
	
	@GetMapping("/DatVuonAndPrice8")
	public List<Product> getDatVuonAndPrice8() {
		return productRepository.findVuonProductAndPrice8();
	}
	
	@GetMapping("/DatVuonAndPrice9")
	public List<Product> getDatVuonAndPrice9() {
		return productRepository.findVuonProductAndPrice9();
	}
	
	@GetMapping("/DatVuonAndPrice10")
	public List<Product> getDatVuonAndPrice10() {
		return productRepository.findVuonProductAndPrice10();
	}
	
	@GetMapping("/DatVuonAndArea1")
	public List<Product> getDatVuonAndArea1() {
		return productRepository.findVuonProductAndArea1();
	}

	@GetMapping("/DatVuonAndArea2")
	public List<Product> getDatVuonAndArea2() {
		return productRepository.findVuonProductAndArea2();
	}
	
	@GetMapping("/DatVuonAndArea3")
	public List<Product> getDatVuonAndArea3() {
		return productRepository.findVuonProductAndArea3();
	}
	
	@GetMapping("/DatVuonAndArea4")
	public List<Product> getDatVuonAndArea4() {
		return productRepository.findVuonProductAndArea4();
	}
	
	@GetMapping("/DatVuonAndArea5")
	public List<Product> getDatVuonAndArea5() {
		return productRepository.findVuonProductAndArea5();
	}
	
	@GetMapping("/DatVuonAndArea6")
	public List<Product> getDatVuonAndArea6() {
		return productRepository.findVuonProductAndArea6();
	}
	
	@GetMapping("/DatVuonAndArea7")
	public List<Product> getDatVuonAndArea7() {
		return productRepository.findVuonProductAndArea7();
	}
	
	@GetMapping("/DatVuonAndArea8")
	public List<Product> getDatVuonAndArea8() {
		return productRepository.findVuonProductAndArea8();
	}
	
	@GetMapping("/DatVuonAndArea9")
	public List<Product> getDatVuonAndArea9() {
		return productRepository.findVuonProductAndArea9();
	}
	
	// ĐẤT MẶT ĐƯỜNG
	@GetMapping("/DatMatDuong")
	public List<Product> getDatMatDuong() {
		return productRepository.findMatDuongProduct();
	}
	
	@GetMapping("/DatMatDuongAndPrice1")
	public List<Product> getDatMatDuongAndPrice1() {
		return productRepository.findMatDuongProductAndPrice1();
	}
	
	@GetMapping("/DatMatDuongAndPrice2")
	public List<Product> getDatMatDuongAndPrice2() {
		return productRepository.findMatDuongProductAndPrice2();
	}
	
	@GetMapping("/DatMatDuongAndPrice3")
	public List<Product> getDatMatDuongAndPrice3() {
		return productRepository.findMatDuongProductAndPrice3();
	}
	
	@GetMapping("/DatMatDuongAndPrice4")
	public List<Product> getDatMatDuongAndPrice4() {
		return productRepository.findMatDuongProductAndPrice4();
	}
	
	@GetMapping("/DatMatDuongAndPrice5")
	public List<Product> getDatMatDuongAndPrice5() {
		return productRepository.findMatDuongProductAndPrice5();
	}
	
	@GetMapping("/DatMatDuongAndPrice6")
	public List<Product> getDatMatDuongAndPrice6() {
		return productRepository.findMatDuongProductAndPrice6();
	}
	
	@GetMapping("/DatMatDuongAndPrice7")
	public List<Product> getDatMatDuongAndPrice7() {
		return productRepository.findMatDuongProductAndPrice7();
	}
	
	@GetMapping("/DatMatDuongAndPrice8")
	public List<Product> getDatMatDuongAndPrice8() {
		return productRepository.findMatDuongProductAndPrice8();
	}
	
	@GetMapping("/DatMatDuongAndPrice9")
	public List<Product> getDatMatDuongAndPrice9() {
		return productRepository.findMatDuongProductAndPrice9();
	}
	
	@GetMapping("/DatMatDuongAndPrice10")
	public List<Product> getDatMatDuongAndPrice10() {
		return productRepository.findMatDuongProductAndPrice10();
	}
	
	@GetMapping("/DatMatDuongAndArea1")
	public List<Product> getDatMatDuongAndArea1() {
		return productRepository.findMatDuongProductAndArea1();
	}
	
	@GetMapping("/DatMatDuongAndArea2")
	public List<Product> getDatMatDuongAndArea2() {
		return productRepository.findMatDuongProductAndArea2();
	}
	
	@GetMapping("/DatMatDuongAndArea3")
	public List<Product> getDatMatDuongAndArea3() {
		return productRepository.findMatDuongProductAndArea3();
	}
	
	@GetMapping("/DatMatDuongAndArea4")
	public List<Product> getDatMatDuongAndArea4() {
		return productRepository.findMatDuongProductAndArea4();
	}
	
	@GetMapping("/DatMatDuongAndArea5")
	public List<Product> getDatMatDuongAndArea5() {
		return productRepository.findMatDuongProductAndArea5();
	}
	
	@GetMapping("/DatMatDuongAndArea6")
	public List<Product> getDatMatDuongAndArea6() {
		return productRepository.findMatDuongProductAndArea6();
	}
	
	@GetMapping("/DatMatDuongAndArea7")
	public List<Product> getDatMatDuongAndArea7() {
		return productRepository.findMatDuongProductAndArea7();
	}
	
	@GetMapping("/DatMatDuongAndArea8")
	public List<Product> getDatMatDuongAndArea8() {
		return productRepository.findMatDuongProductAndArea8();
	}
	
	@GetMapping("/DatMatDuongAndArea9")
	public List<Product> getDatMatDuongAndArea9() {
		return productRepository.findMatDuongProductAndArea9();
	}
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id,@RequestBody Product productDetails){
		
		Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sản phẩm không có!"));
		
		product.setName(productDetails.getName());
		product.setActive(productDetails.getActive());
		product.setDescription(productDetails.getDescription());
		product.setHotProduct(productDetails.getHotProduct());
		product.setCategory(productDetails.getCategory());
		product.setArea(productDetails.getArea());
		product.setPrice(productDetails.getPrice());
		product.setXa(productDetails.getXa());
		product.setThon(productDetails.getThon());
		product.setHuyen(productDetails.getHuyen());
		product.setTinh(productDetails.getTinh());
		product.setMatTien(productDetails.getMatTien());
		product.setPhapLy(productDetails.getPhapLy());
		product.setDuong(productDetails.getDuong());
		product.setThoCu(productDetails.getThoCu());
		product.setForYouProduct(productDetails.getForYouProduct());
		product.setHinh1(productDetails.getHinh1());
		product.setHinh2(productDetails.getHinh2());
		product.setHinh3(productDetails.getHinh3());
		product.setHinh4(productDetails.getHinh4());
		product.setHinh5(productDetails.getHinh5());
		
		Product updateProduct = productRepository.save(product);
		return ResponseEntity.ok(updateProduct);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}

}

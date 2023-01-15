//package com.example.productservice;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.reactive.server.WebTestClient;
//
//import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
//import static org.springframework.http.HttpStatus.BAD_REQUEST;
//import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;
//import static org.springframework.http.MediaType.APPLICATION_JSON;
//import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
//
//@SpringBootTest(webEnvironment=RANDOM_PORT)
//class ProductServiceApplicationTests {
//
//	@Autowired
//	private WebTestClient client;
//
//	@Test
//	public void getProductById(){
//		int PRODUCT_ID_OK = 1;
//		client.get()
//				.uri("/product-composite/" + PRODUCT_ID_OK)
//				.accept(APPLICATION_JSON_UTF8)
//				.exchange()
//				.expectStatus().isOk()
//				.expectHeader().contentType(APPLICATION_JSON_UTF8)
//				.expectBody()
//				.jsonPath("$.productId").isEqualTo(PRODUCT_ID_OK)
//				.jsonPath("$.recommendations.length()").isEqualTo(1)
//				.jsonPath("$.reviews.length()").isEqualTo(1);
//	}
//
//	@Test
//	public void getProductNotFound() {
//
//		int PRODUCT_ID_NOT_FOUND = 13;
//		client.get()
//				.uri("/product-composite/" + PRODUCT_ID_NOT_FOUND)
//				.accept(APPLICATION_JSON_UTF8)
//				.exchange()
//				.expectStatus().isNotFound()
//				.expectHeader().contentType(APPLICATION_JSON_UTF8)
//				.expectBody()
//				.jsonPath("$.path").isEqualTo("/product-composite/" +
//						PRODUCT_ID_NOT_FOUND)
//				.jsonPath("$.message").isEqualTo("NOT FOUND: " +
//						PRODUCT_ID_NOT_FOUND);
//	}
//
//	@Test
//	public void getProductInvalidParameterString() {
//
//		client.get()
//				.uri("/product/no-integer")
//				.accept(APPLICATION_JSON)
//				.exchange()
//				.expectStatus().isEqualTo(BAD_REQUEST)
//				.expectHeader().contentType(APPLICATION_JSON)
//				.expectBody()
//				.jsonPath("$.path").isEqualTo("/product/no-integer")
//				.jsonPath("$.message").isEqualTo("Type mismatch.");
//	}
//
//	@Test
//	public void getProductInvalidParameterNegativeValue() {
//
//		int productIdInvalid = -1;
//
//		client.get()
//				.uri("/product/" + productIdInvalid)
//				.accept(APPLICATION_JSON)
//				.exchange()
//				.expectStatus().isEqualTo(UNPROCESSABLE_ENTITY)
//				.expectHeader().contentType(APPLICATION_JSON)
//				.expectBody()
//				.jsonPath("$.path").isEqualTo("/product/" + productIdInvalid)
//				.jsonPath("$.message").isEqualTo("Invalid productId: " + productIdInvalid);
//	}
//
//}

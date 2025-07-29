package com.app.utils;

public class PathUtils {
	private PathUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static final String VERSION_V1 = "v1";

	public static final String API = "api";

	public static final String SLASH = "/";

	public static final String HEALTH_CHECK_API = "/healthCheck";

	public static final String USER_SERVICE = "user-service";

	public static final String API_V1_PREFIX = SLASH + API + SLASH + VERSION_V1;

	 

	public static final String SALE_SERVICE = SLASH + "sale";
	
	// category api
	public static final String CATEGORY_API = "category";
	
	public static final String CATEGORY_EC_API = "category_ec";

	public static final String CATEGORY_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + CATEGORY_API;

	public static final String CATEGORY_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + CATEGORY_EC_API;

	public static final String CATEGORY_PAGING_SEARCH_SORT_FILTER = SLASH + "category_paging_search_sort_filter";
	
	public static final String CATEGORY_FIND_TREE_BY_PARENT_ID = SLASH + "category_find_tree_by_parent_id";
	
	public static final String CATEGORY_FIND_BY_LEVEL = SLASH + "category_find_by_level/{level}";

	public static final String CATEGORY_FIND_BY_ID = SLASH + "category_by_id/{id}";

	public static final String CATEGORY_CREATE = SLASH + "category_create";

	public static final String CATEGORY_UPDATE = SLASH + "category_update";

	public static final String CATEGORY_DELETES = SLASH + "category_deletes";

	public static final String CATEGORY_GET_ALL = SLASH + "category_get_all";
	
	
	public static final String RATING_API = "rating";
	
	public static final String RATING_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + RATING_API;

	// product api
	public static final String PRODUCT_API = "product";

	public static final String PRODUCT_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + PRODUCT_API;
	
	public static final String PRODUCT_PAGING_SEARCH_SORT_FILTER = SLASH + "product_paging_search_sort_filter";

 

	public static final String PRODUCT_GET_BY_ID = SLASH + "product_by_id/{id}";

	public static final String PRODUCT_CREATE = SLASH + "product_create";

	public static final String PRODUCT_UPDATE = SLASH + "product_update";

	public static final String PRODUCT_DELETES = SLASH + "product_deletes";

	public static final String PRODUCT_FIND_ALL = SLASH + "product_find_all";
	
	// product ec api
	public static final String PRODUCT_EC_API = "product_ec";

	public static final String PRODUCT_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + PRODUCT_EC_API;
	
	public static final String PRODUCT_SCROLLING_PAGING_SEARCH_SORT_FILTER = "product_scrolling_paging_search_sort_filter";
	
	
	//product variant
	public static final String PRODUCT_VARIANT_API =  "product_variant";
	
	public static final String PRODUCT_VARIANT_EC_API =  "product_variant_ec";

	public static final String PRODUCT_VARIANT_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + PRODUCT_VARIANT_EC_API;
	 
	public static final String PRODUCT_VARIANT_CREATE = SLASH + "product_variant_create";
	
	public static final String PRODUCT_VARIANT_UPDATE = SLASH + "product_variant_update";

	public static final String PRODUCT_VARIANT_DELETE = SLASH + "product_variant_delete/{id}";
	
	public static final String PRODUCT_VARIANT_PAGING_SEARCH_SORT_FILTER = SLASH + "product_variant_paging_search_sort_filter";
	
	public static final String PRODUCT_VARIANT_FIND_BY_ID = SLASH + "product_variant_by_id/{id}";
	
	public static final String PRODUCT_VARIANT_RELATED = SLASH + "product_variant_related/{id}";
	
	public static final String PRODUCT_VARIANT_NEW_SCROLLING = SLASH + "product_variant_new_scrolling";
	

	// sale api

	public static final String SALE_ORDER_API = "sale_order";
	
	public static final String SALE_ORDER_EC_API = "sale_order_ec";

	public static final String SALE_ORDER_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + SALE_ORDER_API;
	
	public static final String SALE_ORDER_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + SALE_ORDER_EC_API;

	public static final String SALE_ORDER_PAGING_SEARCH_SORT_FILTER = SLASH + "sale_order_paging_search_sort_filter";

	public static final String SALE_ORDER_GET_BY_ID = SLASH + "sale_order_by_id/{id}";

	public static final String SALE_ORDER_CREATE = SLASH + "sale_order_create";

	public static final String SALE_ORDER_CREATE_V2 = SLASH + "sale_order_create_v2";
	
	public static final String SALE_ORDER_CREATE_MOCK = SLASH + "sale_order_create_mock";
	
	public static final String SALE_ORDER_UPDATE_STATUS = SLASH + "sale_order_update_status";
	
	public static final String SALE_ORDER_PAYMENT = SLASH + "sale_order_payment";
	
	public static final String SALE_ORDER_CART = SLASH + "sale_order_cart";
	
	public static final String SALE_ORDER_BY_CUSTOMER_ID = SLASH + "sale_order_by_customer_id/{customerId}";
	 
	// stock  api
	
	public static final String STOCK_SERVICE = SLASH + "stock";
	
	public static final String STOCK_API = "stock";
	
	public static final String STOCK_API_V1 = SLASH + API + SLASH + VERSION_V1 + STOCK_SERVICE + SLASH + STOCK_API;
	
	public static final String STOCK_GET_BY_PRODUCT_VARIANT_ID = SLASH + "stock_by_product_variant_id/{product_variant_id}";
	
	public static final String STOCK_GET_BY_PRODUCT_ID = SLASH + "stock_by_product_id/{product_id}";
	
	// stock trans api
	public static final String STOCK_TRANS_API = "trans";

	public static final String STOCK_TRANS_API_V1 = STOCK_API_V1 +  SLASH +  STOCK_TRANS_API;

	public static final String STOCK_TRANS_PAGING_SEARCH_SORT_FILTER = SLASH + "stock_trans_paging_search_sort_filter";

	public static final String STOCK_TRANS_GET_BY_ID = SLASH + "stock_trans_by_id/{id}";

	public static final String STOCK_TRANS_CREATE = SLASH + "stock_trans_create";

	public static final String STOCK_TRANS_UPDATE = SLASH + "stock_trans_update";

	public static final String STOCK_TRANS_DELETES = SLASH + "stock_trans_deletes";

	public static final String STOCK_TRANS_GET_ALL = SLASH + "product_get_all";
	
	public static final String PRODUCT_INFO = "product_info";
	
	public static final String PRODUCT_INFO_EC_API = "product_info_ec";

	public static final String PRODUCT_INFO_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + PRODUCT_INFO;

	public static final String PRODUCT_INFO_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + PRODUCT_INFO_EC_API;
	
	public static final String PRODUCT_INFO_FIND_BY_TYPE = SLASH + "product_info_find_by_type/{type}";
	
	// account service
	public static final String ACCOUNT_SERVICE = "account";
	
	public static final String AUTH_API = "auth";
	
	// category api
	public static final String CUSTOMER_API = "customer";

	public static final String CUSTOMER_API_V1 = SLASH + API + SLASH + VERSION_V1 + SLASH + ACCOUNT_SERVICE + SLASH + CUSTOMER_API;

	public static final String CUSTOMER_PAGING_SEARCH_SORT_FILTER = SLASH + "customer_paging_search_sort_filter";

	public static final String CUSTOMER_FIND_BY_ID = SLASH + "customer_by_id/{id}";

	public static final String CUSTOMER_CREATE = SLASH + "customer_create";

	public static final String CUSTOMER_UPDATE = SLASH + "customer_update";

	public static final String CUSTOMER_DELETES = SLASH + "customer_deletes";

	public static final String CUSTOMER_FIND_ALL = SLASH + "customer_find_all";
	
	public static final String AUTH_API_V1 = SLASH + API + SLASH + VERSION_V1 + SLASH + ACCOUNT_SERVICE + SLASH + AUTH_API;
	
	public static final String AUTH_LOGIN = SLASH + "login";
	
	public static final String AUTH_LOGOUT = SLASH + "logout";
	
	public static final String AUTH_VALITE_TOKEN = SLASH + "validate_token";
	
	public static final String AUTH_REGISTER = SLASH + "register";
	
	public static final String AUTH_GENERATE_HASH_PASSWORD = SLASH + "generate_hash_password/{rawPassword}";
	
	public static final String AUTH_REFRESH_TOKEN = SLASH + "refresh_token";
	
	
	// file api
	public static final String FILE_API = "file";

	public static final String FILE_API_V1 = SLASH + API + SLASH + VERSION_V1 + SLASH + ACCOUNT_SERVICE + SLASH + FILE_API;

	public static final String FILE_UPLOAD = SLASH + "file_upload";
	
	public static final String FILE_DOWNLOAD = SLASH + "file_download/{fileName}";
	
	public static final String FILE_UPLOAD_MINIO = SLASH + "file_upload_minio";
	
	public static final String FILE_GET_MINIO = SLASH + "file_get_minio/{uuid}";
	
	
	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_API = "customer_shipping_address_ec_api";
  
	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + CUSTOMER_SHIPPING_ADDRESS_EC_API;

	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_PAGING_SEARCH_SORT_FILTER = SLASH + "customer_shipping_address_paging_search_sort_filter";

	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_FIND_BY_ID = SLASH + "customer_shipping_address_find_by_id/{id}";

	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_CREATE = SLASH + "customer_shipping_address_create";
	
	public static final String CUSTOMER_SHIPPING_ADDRESS_EC_UPDATE = SLASH + "customer_shipping_address_update";

 
	
	// user api
	public static final String USER_API = "users";

	public static final String USER_API_V1 = API_V1_PREFIX + SLASH + ACCOUNT_SERVICE + SLASH + USER_API;
	
	public static final String USER_FIND_CURRENT_USER = SLASH + "current_user";
	
	public static final String USER_FIND_CURRENT_USER_BY_TOKEN = SLASH + "current_user_by_token";
	
	
	public static final String CART_EC_API = "cart_ec_api";
	  
	public static final String CART_EC_API_V1 = SLASH + API + SLASH + VERSION_V1 + SALE_SERVICE + SLASH + CART_EC_API;
 
	public static final String CART_EC_FIND_BY_ID = SLASH + "cart_find_by_id/{id}";

	public static final String CART_EC_CREATE_OR_UPDATE = SLASH + "cart_create_or_update";
	
	public static final String CART_EC_GET_ALL = SLASH + "cart_get_all";
	
	public static final String CART_EC_DELETE = SLASH + "cart_delete";
	
	public static final String CART_EC_MOCK_CREATE_ORDER = SLASH + "mock_create_order";
	 
	 
}

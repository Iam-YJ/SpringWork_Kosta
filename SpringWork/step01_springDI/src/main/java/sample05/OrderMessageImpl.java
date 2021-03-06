package sample05;

public class OrderMessageImpl implements OrderMessage {
	private int orderid;
	private String message;
	private UserBean userbean;
	private ProductBean productbean;

	public OrderMessageImpl() {
		System.out.println("OrderMessageImpl 생성자 호출");
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserBean getUserbean() {
		return userbean;
	}

	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}

	public ProductBean getProductbean() {
		return productbean;
	}

	public void setProductbean(ProductBean productbean) {
		this.productbean = productbean;
	}

	public void getOrder_Message() {
		System.out.println("orderId : " + orderid);
		System.out.println("상품명 : " + productbean.getP_name());
		System.out.println("상품 가격 : " + productbean.getP_price());
		System.out.println("주문자 번호 : " + userbean.getId());
		System.out.println("주문자 이름 : " + userbean.getName());
		System.out.println("주문자 핸드폰 : " + userbean.getPhone());
		System.out.println("message : " + message);

	}

}

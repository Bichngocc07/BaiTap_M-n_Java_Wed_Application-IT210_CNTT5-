package repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public String getAllOrders() {
        return "Danh sách toàn bộ đơn hàng";
    }

    public String getOrderById(long id) {
        return "Thông tin đơn hàng với id = " + id;
    }
}
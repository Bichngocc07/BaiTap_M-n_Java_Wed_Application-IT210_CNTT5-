////Lập bảng so sánh ưu/nhược điểm của 2 cách tiếp cận:
//// (A) Copy-paste Header/Footer vào từng file và
//// (B) Sử dụng layout:decorate.
/// //| Tiêu chí       | Cách A: Copy-Paste    | Cách B: Layout Dialect |
/// //|--------        |-----------------------|------------------------|
/// //|Tái sử dụng     |      Thấp             |               Cao      |
/// //| Bảo trì        |  Khó (sửa nhiều file) |       Dễ (1 chỗ)       |
/// //| DRY            |  Vi phạm              |        Tuân thủ        |
/// //| Độ linh hoạt   |  Kém                  |           Tốt          |
/// //|Khả năng mở rộng|  Khó                  |            Dễ          |
/// //| Clean code     |  Không                |            Có          |

////Triển khai theo Cách B: Định nghĩa một file layout.html chứa
////khung xương chính và dùng layout:fragment cho phần nội dung thay đổi.

////Phân tích kỹ thuật: Giải thích tại sao khi sử dụng Layout
////Dialect, chúng ta vẫn phải đăng ký Bean LayoutDialect
////trong SpringTemplateEngine ở mã Java.
//_Layout Dialect không tự động hoạt động chỉ vì thêm dependency.
//Chúng ta phải đăng ký nó vào SpringTemplateEngine
//dưới dạng một Dialect.
//
//Lý do:
//        - Thymeleaf hoạt động theo cơ chế plugin (Dialect)
//- LayoutDialect cung cấp các thuộc tính như:
//        + layout:decorate
//  + layout:fragment
//
//Nếu không add vào engine:
//        → Thymeleaf không hiểu các thuộc tính này
//→ layout sẽ không hoạt động


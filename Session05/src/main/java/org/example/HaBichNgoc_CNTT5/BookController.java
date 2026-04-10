import org.example.HaBichNgoc_CNTT5.Book;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@Repository
    private Lish<Book>  BookLish = new ArrayLishh<>();
    public class BookController{
        BookLish.add(new BookController(1,"Java Core","Nguyen Van A","1234567899000");
        BookLish.add(new BookController(1,"Java Core","Nguyen Van A","1234567899000");
        BookLish.add(new BookController(1,"Java Core","Nguyen Van A","1234567899000");
    }
    @GetMapping
    public String lishBook(Model model){
        model.addTttribute("book", lishBook());
        model.addAttribute("title","Danh sách ");
        return "books";
    }
    @GetMapping{(/id)};
    public String bookDetail(@PathVariable int id, Model model){
        for (Book b : bookLish){
            if(b : getId()= id){
                model.addAttribute("book",b);
                model.addAttribute("title","Chi tiết sách");
                break;
            }
            return "book detail";
        }
    }

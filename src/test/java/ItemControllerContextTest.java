import com.shopping.inventory.ItemController;
import com.shopping.inventory.TableService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes=ItemController.class)
public class ItemControllerTest {
    @Autowired
    private ItemController controller;
    @MockBean
    private TableService tableService;
    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}

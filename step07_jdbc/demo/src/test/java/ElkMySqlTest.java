import org.junit.Before;
import org.junit.Test;

import com.example.titanic.TitanicService;

public class ElkMySqlTest {
    private TitanicService titanicService;

    @Before
    public void setup() {
        titanicService = new TitanicService();
    }

    @Test
    public void insertGroupTest() throws Exception {
        titanicService.insertGroup(1);
    }
}

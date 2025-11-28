package scrolling;

import base.BaseTest;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest {
    @Test
public void scrollInfinite(){
    homePage.clickScroll().scrollSection(3);
    }
}


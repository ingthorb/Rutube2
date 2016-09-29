/**
 * Created by Laufey on 29/09/16.
 */
/*
import is.ru.honn.reader.ReadHandler;
import is.ru.honn.reader.Reader;
import is.ru.honn.reader.ReaderFactory;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:reader.xml")

public class TestReader implements ReadHandler
{
   // Logger log = Logger.getLogger(TestPlayerService.class.getName());


    @Autowired
    private Reader reader;

    public TestReader(Reader reader) {
        this.reader = reader;
    }

    @Before
    public void Setup()
    {
        ReaderFactory factory = new ReaderFactory();
        reader = factory.getReader("videoReader");

        reader.setReadHandler(this);
        reader.read();

    }

    @Test
    public void testReader()
    {

//        Player player0 = new Player(0, "messi", "Messi");
//        Player player1 = new Player(1, "ronaldo", "Ronaldo");
//
//        service.addPlayer(player0);
//        int pos = service.addPlayer(player1);
//
//        assertEquals(2, pos+1);
//
//        Player playerNew = service.getPlayer(1);
//        assertSame(playerNew, player1);
//
//        try
//        {
//            service.addPlayer(player1);
//        }
//        catch (ServiceException s)
//        {
//            assertSame(ServiceException.class, s.getClass());
//        }
    }

    @Override
    public void read(int count, Object object) {

    }
}*/
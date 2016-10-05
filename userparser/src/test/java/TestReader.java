/**
 *TODO:Document
 */

import is.ru.honn.reader.*;

import is.ru.honn.rutube.process.UserImportProcess;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:readerTest.xml")


//Test the reader
//        Factory reads the reader.xml correctly ??? skiliggi hvernig við eigum að testa þetta
//        Exception if URI is wrong   - erum að kasta exeption ef handle er ekki set
//        Exception if handler is not set - erum að kasta exeption ef handle er ekki set
//        Check the number of lines read matches with file


public class TestReader implements ReadHandler
{
    private Logger log = Logger.getLogger(TestReader.class.getName());
    private int countObjects;
    private UserImportProcess process;

    @Autowired
    private ReaderFactory reader;

    @Before
    public void Setup()
    {
        process = new UserImportProcess();

        //ÞAf held ég að setja eh í uri  og sækja það úr baunini ?
    }

    @Test
    public void testReader()
    {
        Reader userReader = reader.getReader("UserReader");
        userReader.setURI("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        userReader.setReadHandler(process);

        try {
            userReader.read();
        } catch (ReaderException e) {
            //Exception if handler is not set - erum að kasta exeption ef handle er ekki set

            e.printStackTrace();
        }

        //        Check the number of lines read matches with file veit ekki hversu mörg þau eru ???
       // assertEquals(countObjects, 0);
    }


    @Test
public void CheckIfFactoryReadsXMLCorrectly()
{
    Reader userReader = reader.getReader("UserReader");
    userReader.setURI("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
    userReader.setReadHandler(process);

    try {
        userReader.read();
    } catch (ReaderException e) {
        //Exception if handler is not set - erum að kasta exeption ef handle er ekki set

        e.printStackTrace();
    }

    //        Check the number of lines read matches with file veit ekki hversu mörg þau eru ???
    // assertEquals(countObjects, 0);
}

    @Test
    public void WrongURI()
    {
        Reader userReader = reader.getReader("UserReader");
        userReader.setURI("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        userReader.setReadHandler(process);

        try {
            userReader.read();
        } catch (ReaderException e) {
            //Exception if handler is not set - erum að kasta exeption ef handle er ekki set

            e.printStackTrace();
        }

        //        Check the number of lines read matches with file veit ekki hversu mörg þau eru ???
        // assertEquals(countObjects, 0);
    }

    @Test
    public void HandlerNotSet()
    {
        Reader userReader = reader.getReader("UserReader");
        userReader.setURI("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        userReader.setReadHandler(process);

        try {
            userReader.read();
        } catch (ReaderException e) {
            //Exception if handler is not set - erum að kasta exeption ef handle er ekki set

            e.printStackTrace();
//            assertThat(e)
//                    .isInstanceOf(IllegalArgumentException.class)
//                    .hasMessage("negatives not allowed: [-1, -2]");
        }

        //        Check the number of lines read matches with file veit ekki hversu mörg þau eru ???
        // assertEquals(countObjects, 0);
    }

    @Test
    public void CheckIfNumberOfLinesMatches()
    {
        Reader userReader = reader.getReader("UserReader");
        userReader.setURI("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        userReader.setReadHandler(process);

        try {
            userReader.read();
        } catch (ReaderException e) {
            //Exception if handler is not set - erum að kasta exeption ef handle er ekki set

            e.printStackTrace();
        }

        //        Check the number of lines read matches with file veit ekki hversu mörg þau eru ???
        // assertEquals(countObjects, 0);
    }

    @Override
    public void read(int count, Object object) {
        //counta usera ? ??  skiliggi og hvað svo ?
        countObjects = count;

    }
}
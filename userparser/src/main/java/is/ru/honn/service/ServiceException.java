package is.ru.honn.service;

/**
 * Exception cast if there is a error in Service
 */
public class ServiceException extends Exception {

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }
}

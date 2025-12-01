package Project.Project.Exceptions;

import Project.Project.Exceptions.CustomIT114Exception;

public class DuplicateRoomException extends CustomIT114Exception {
    public DuplicateRoomException(String message) {
        super(message);
    }

    public DuplicateRoomException(String message, Throwable cause) {
        super(message, cause);
    }

}

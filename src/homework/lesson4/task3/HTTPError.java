package homework.lesson4.task3;

import java.lang.Enum;
public enum HTTPError {
    ERROR_400(400,"Bad Request"),
    ERROR_401(401,"Unauthorized"),
    ERROR_402(402,"Payment Required"),
    ERROR_403(403, "Forbidden"),
    ERROR_404(404, "Not Found"),
    ERROR_405(405, "Method Not Allowed"),
    ERROR_406(406,"Not Acceptable"),
    ERROR_407(407,"Proxy Authentication Required"),
    ERROR_408(408, "Request Timeout"),
    ERROR_409(409, "Conflict"),
    ERROR_410(410, "Gone");

    private int errorCode;
    private String errorName;

    HTTPError(int errorCode, String errorName) {
        this.errorCode = errorCode;
        this.errorName = errorName;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorName() {
        return errorName;
    }

    public static String getErrorName(int errorCode){
        for (HTTPError error : HTTPError.values()){
            if (error.getErrorCode()==errorCode) return error.getErrorName();
        }
        return "THERE IS NO ERROR WITH THIS CODE";
    }
}

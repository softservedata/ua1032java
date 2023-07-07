package homeWork_4_Condition_Statements.homeWork;

public enum HTTPError {

    Bad_Request(400),Unauthorized(401),Payment_Required(402),Forbidden(403),Not_Found(404);

    private final int title;
    HTTPError(int title) {
        this.title = title;
    }

    public int getTitle() {
        return title;
    }
}

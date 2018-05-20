package im.conversations.compliance.pojo;

public class PostResponse {
    private final boolean success;
    private final String message;
    private final String redirectLink;

    public PostResponse(boolean success, String message, String redirectLink) {
        this.success = success;
        this.message = message;
        this.redirectLink = redirectLink;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public String getRedirectLink() {
        return redirectLink;
    }
}

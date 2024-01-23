public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedWebPage) {
        super(decoratedWebPage);
    }

    public void authenticateUser() {
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        super.display();
        authenticateUser();
    }
}
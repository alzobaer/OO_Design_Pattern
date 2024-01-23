public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedWebPage) {
        super(decoratedWebPage);
    }

    private void authorizeUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        authorizeUser();
        super.display();
    }
}

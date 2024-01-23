// Component Interface
interface WebPage {
    public void display();
}
  
// Concrete Component
class BasicWebPage implements WebPage {
    @Override
    public void display() {
        System.out.println("Basic Web Page");
    }
}

abstract class WebPageDecorator implements WebPage {
    protected WebPage page;

    public WebPageDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public void display() {
        page.display();
    }
}

class AuthorizedWebPage extends WebPageDecorator {
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
  
// Concrete Decorator - Paginated Results
class AuthenticatedWebPage extends WebPageDecorator {
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
  
// Example Usage
public class DecoratorPatternDemo{
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();                // Basic page with some content
        myPage = new AuthorizedWebPage(myPage);             // Decorate with authentication check for specific users
        myPage = new AuthenticatedWebPage(myPage);          // Further decorate with pagination or authentication
        
        myPage.display();
    }
}
  
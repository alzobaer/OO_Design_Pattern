public class DecoratorPatternDemo{
    public static void main(String[] args) {
        WebPage myPage = new BasicWebPage();                // Basic page with some content
        myPage = new AuthorizedWebPage(myPage);             // Decorate with authentication check for specific users
        myPage = new AuthenticatedWebPage(myPage);          // Further decorate with pagination or authentication
        
        myPage.display();
    }
}
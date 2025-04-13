class JuniorSupportHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            System.out.println("[JuniorSupport] Passing to next handler");
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}
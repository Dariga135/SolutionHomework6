class FAQBotHandler extends SupportHandler {
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled password_reset");
        } else if (nextHandler != null) {
            System.out.println("[FAQBot] Passing to next handler");
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually");
        }
    }
}


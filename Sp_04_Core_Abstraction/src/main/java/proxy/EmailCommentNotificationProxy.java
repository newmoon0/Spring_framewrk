package proxy;

import model.Comment;

public class EmailCommentNotificationProxy {

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment: "+comment.getText());
    }
}

package main.java.com.conference.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 18/07/2014
 * Time: 15:44
 */
public class Submission {

    List<SubmissionPart> submissionPartList = new ArrayList<SubmissionPart>();

    public List<SubmissionPart> getSubmissionPartList() { return submissionPartList;}

    public void setSubmissionPartList(List<SubmissionPart> submissionPartList){
        this.submissionPartList = submissionPartList;
    }

    public void agenda(){
        AgendaSubmissionPartVisitor visitor = new AgendaSubmissionPartVisitor();
        for(SubmissionPart submissionPart : submissionPartList){
            if(submissionPart instanceof Abstract){
                submissionPart.acceptSubmissionVisitor(visitor);
            }
        }
    }

    public void overview(){
        OverviewSubmissionPartVisitor visitor = new OverviewSubmissionPartVisitor();
        for(SubmissionPart submissionPart : submissionPartList){
            if((submissionPart instanceof Abstract) || (submissionPart instanceof Review)){
                submissionPart.acceptSubmissionVisitor(visitor);
            }
        }
    }

    public void comprehensive(){
        ComprehensiveSubmissionPartVisitor visitor = new ComprehensiveSubmissionPartVisitor();
        for(SubmissionPart submissionPart : submissionPartList){
            submissionPart.acceptSubmissionVisitor(visitor);
        }
    }
}

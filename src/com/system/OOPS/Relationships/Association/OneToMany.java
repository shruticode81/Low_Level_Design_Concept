package com.system.OOPS.Relationships.Association;

import java.util.ArrayList;
import java.util.List;

public class OneToMany {

}

class Project{
    List<Issue> issues = new ArrayList<Issue>();
    private void addIssue(Issue issue){
        issues.add(issue);
        issue.setProject(this);
    }
}
class Issue{
    private Project project;

    public void setProject(Project project){
        this.project = project;
    }
}



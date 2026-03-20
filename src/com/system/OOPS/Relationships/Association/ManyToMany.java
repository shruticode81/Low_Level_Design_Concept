package com.system.OOPS.Relationships.Association;

import java.util.ArrayList;
import java.util.List;

public class ManyToMany {
    // User and group association
}

class User{
    private String name;
    private List<Group> groups = new ArrayList<Group>();

    public User(String name) {
        this.name = name;
    }
    public void joinGroup(Group group){
        if(!groups.contains(group)){
            groups.add(group);
            group.addUser(this);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Group> getGroups() {
        return groups;
    }

}
class Group{
    private String name;
    List<User> users = new ArrayList<User>();
    public Group(String name) {
        this.name = name;
    }
    public void addUser(User user){
        if(!users.contains(user)){
            users.add(user);
            user.joinGroup(this);
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<User> getUsers() {
        return users;
    }

}


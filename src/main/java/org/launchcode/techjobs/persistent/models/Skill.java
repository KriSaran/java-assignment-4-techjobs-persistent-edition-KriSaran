package org.launchcode.techjobs.persistent.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500,message="Description no longer than 500 characters")
    private String description;

    @ManyToMany(mappedBy = "skills" ,cascade = CascadeType.ALL)
    private List<Job> jobs=new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }
    public Skill(){}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
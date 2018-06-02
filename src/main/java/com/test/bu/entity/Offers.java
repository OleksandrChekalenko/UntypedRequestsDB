package com.test.bu.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "offers")
public class Offers implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(targetEntity = Requests.class, mappedBy = "offers_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Requests> requestsList = new ArrayList<>();


    public Offers() {
    }

    public Offers(String name, List<Requests> requestsList) {
        this.name = name;
        this.requestsList = requestsList;
    }

    public Offers(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Requests> getRequestsList() {
        return requestsList;
    }

    public void setRequestsList(List<Requests> requestsList) {
        this.requestsList = requestsList;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Offers{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", requestsList=").append(requestsList);
        sb.append('}');
        return sb.toString();
    }
}

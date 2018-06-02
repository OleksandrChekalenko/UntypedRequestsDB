package com.test.bu.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "operators")
public class Operators {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String fio;

    @OneToMany(targetEntity = Requests.class, mappedBy = "operators_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Requests> requestsList = new ArrayList<>();




    public Operators() {
    }

    public Operators(String name, String fio) {
        this.name = name;
        this.fio = fio;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Operators{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", fio='").append(fio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package com.shubham.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@ Setter
@ToString
public class Link extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    //TODO comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();


//    public Link(String title, String url) {
//        this.title = title;
//        this.url = url;
//    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
}

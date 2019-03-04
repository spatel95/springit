package com.shubham.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @ Setter
@ToString
public class Comment extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    // Todo link

    @ManyToOne
    @NonNull
    private Link link;
//
//    public Comment(String comment, Link link) {
//        this.body = comment;
//        this.link = link;
//    }
}

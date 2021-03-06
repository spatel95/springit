package com.shubham.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Vote extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote;

}

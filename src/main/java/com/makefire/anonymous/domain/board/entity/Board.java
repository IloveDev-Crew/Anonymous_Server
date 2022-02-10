package com.makefire.anonymous.domain.board.entity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Data
@Entity
public class Board {
    @Id
    @GeneratedValue
    Long id;


    String boardName;

}

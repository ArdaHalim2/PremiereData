package com.ardahalim2.premieredata.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
    private String nation;
    private String pos;
    private Integer age;
    private Integer mp; // matches played
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk; // penalty kicks
    private Double crdy; // yellow cards
    private Double crdr; // red cards
    private Double xg; // expected goals
    private Double xag; // expexted assist and goals
    private String teams;
}

package ru.oskin_di.TestERPdesigninstitute.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "work_tasks")
public class WorkTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "in_work")
    private boolean inProgress;

    @ManyToOne
    @JoinColumn(name = "id creator")
    private Employee employeeCreator;

    @ManyToOne
    @JoinColumn(name = "id executor")
    private Employee employeeExecutor;


}

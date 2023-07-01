package Sagawala.developer.EmployeesSystem.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tbl_employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class  Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String department;
}

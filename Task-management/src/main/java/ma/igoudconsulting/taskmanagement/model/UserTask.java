package ma.igoudconsulting.taskmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data  //pour lombok
@Entity(name = "user_task") //pour changer le nom de table a la base de donnee
public class UserTask {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	@Column(name="assignementdate_date") //pour change le nom de la ligne a la base de donnee
	private Date assignementdate;
	@ManyToOne
	private Task task;
	@ManyToOne
	private Role role;

}

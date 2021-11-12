package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_categories")
public class Category {
	private Long id;
	private String name;

}

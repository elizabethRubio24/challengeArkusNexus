package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

//Suponiendo que hago un camnbio en development
@Entity
@Table(name="tbl_categories")
public class Category {
	private Long id;
	private String name;

}

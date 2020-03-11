package com.revature.hibernate.beans;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Project")
	@SequenceGenerator(name="Project", sequenceName="Project_seq", allocationSize=1)
	private Integer id;
	private String projectname;
	
	//curious about how Hibernate joins this to the employee table
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="teamlead_id")
	private Integer lead;
	private Timestamp startdate;
	private Timestamp enddate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public Integer getLead() {
		return lead;
	}
	public void setLead(Integer lead) {
		this.lead = lead;
	}
	public Timestamp getStartdate() {
		return startdate;
	}
	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}
	public Timestamp getEnddate() {
		return enddate;
	}
	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lead == null) ? 0 : lead.hashCode());
		result = prime * result + ((projectname == null) ? 0 : projectname.hashCode());
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (enddate == null) {
			if (other.enddate != null)
				return false;
		} else if (!enddate.equals(other.enddate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lead == null) {
			if (other.lead != null)
				return false;
		} else if (!lead.equals(other.lead))
			return false;
		if (projectname == null) {
			if (other.projectname != null)
				return false;
		} else if (!projectname.equals(other.projectname))
			return false;
		if (startdate == null) {
			if (other.startdate != null)
				return false;
		} else if (!startdate.equals(other.startdate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectname=" + projectname + ", lead=" + lead + ", startdate=" + startdate
				+ ", enddate=" + enddate + "]";
	}
	public Project() {
		super();
	}
	public Project(Integer id, String projectname, Integer lead, Timestamp startdate, Timestamp enddate) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.lead = lead;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	
}